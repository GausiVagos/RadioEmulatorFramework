package gauthierSimon.ref.POJOs.physicalComponents;

import gauthierSimon.ref.POJOs.functioningStates.BrokenState;
import gauthierSimon.ref.POJOs.functioningStates.IState;
import gauthierSimon.ref.POJOs.functioningStates.OffState;
import gauthierSimon.ref.POJOs.functioningStates.OnState;
import gauthierSimon.ref.POJOs.functioningStates.PausedState;
import gauthierSimon.ref.POJOs.functioningStates.PlayingState;
import gauthierSimon.ref.POJOs.functioningStates.States;


public abstract class RadioComponent implements IState
{
	Radio radio;
	
	IState state; // State design pattern
	OffState off;
	OnState on;
	PausedState paused;
	PlayingState playing;
	BrokenState broken;
	
	String componentName;
	protected States enumState; // to get quickly the current state without having to analyze the class of the IState attribute.
	
	
	public RadioComponent(Radio radio, String name)
	{	
		this.radio = radio;
		off = radio.getOff();
		on = radio.getOn();
		paused = radio.getPaused();
		playing = radio.getPlaying();
		broken = radio.getBroken();
		
		state = off;
		enumState = States.off;
	}
	
	public boolean changeState(States newState)
	{
		String message;
		
		switch(newState)
		{
			case off:	state = off;
						message = componentName.concat(" stopped.");
						break;
			case on: 	state = on;
						message = componentName.concat(" started.");
						break;
			case paused:	state = paused;
							message = componentName.concat(" was paused.");
							break;
			case playing:	state = playing;
							message = componentName.concat(" started playing.");
							break;
			case broken:	state = broken;
							message = componentName.concat(" broke!");
							break;
			default :	message = "Something went wrong with ".concat(componentName);
						radio.addLog(message);
						return false;
		}
		
		radio.addLog(message);
		return true;
	}
	
	@Override
	public boolean turnOn() {
		return state.turnOn()? changeState(States.on) : false;
	}

	@Override
	public boolean start() {
		return state.start()? changeState(States.playing) : false;
	}

	@Override
	public boolean pause() {
		return state.pause()? changeState(States.paused) : false;
	}

	@Override
	public boolean turnOff() {
		return state.turnOff()? changeState(States.off) : false;
	}

	@Override
	public boolean breakComponent() {
		return state.breakComponent()? changeState(States.broken) : false;
	}

	@Override
	public boolean repairComponent() {
		return state.repairComponent()? changeState(States.off) : false;
	}

}
