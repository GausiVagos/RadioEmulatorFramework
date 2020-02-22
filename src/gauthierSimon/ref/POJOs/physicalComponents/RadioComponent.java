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
	IState state; // State design pattern
	OffState off;
	OnState on;
	PausedState paused;
	PlayingState playing;
	BrokenState broken;
	
	String componentName;
	protected States enumState; // to get quickly the current state without having to analyze the class of the IState attribute.
	String message;
	
	
	public RadioComponent(String name)
	{
		componentName = name;
		off = new OffState(this);
		on = new OnState(this);
		paused = new PausedState(this);
		playing = new PlayingState(this);
		broken = new BrokenState(this);
		
		state = off;
		enumState = States.off;
	}
	
	public void changeState(States newState)
	{
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
		}
	}
	
	@Override
	public boolean turnOn() {
		return state.turnOn();
	}

	@Override
	public boolean start() {
		return state.start();
	}

	@Override
	public boolean pause() {
		return state.pause();
	}

	@Override
	public boolean turnOff() {
		return state.turnOff();
	}

	@Override
	public boolean breakComponent() {
		return state.breakComponent();
	}

	@Override
	public boolean repairComponent() {
		return state.repairComponent();
	}

}
