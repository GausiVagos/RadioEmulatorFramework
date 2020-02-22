package gauthierSimon.ref.POJOs.physicalComponents;

import gauthierSimon.ref.POJOs.functioningStates.BrokenState;
import gauthierSimon.ref.POJOs.functioningStates.IState;
import gauthierSimon.ref.POJOs.functioningStates.OffState;
import gauthierSimon.ref.POJOs.functioningStates.OnState;
import gauthierSimon.ref.POJOs.functioningStates.PausedState;
import gauthierSimon.ref.POJOs.functioningStates.PlayingState;

public abstract class RadioComponent implements IState
{
	IState state;
	OffState off;
	OnState on;
	PausedState paused;
	PlayingState playing;
	BrokenState broken;
	
	public RadioComponent()
	{
		off = new OffState(this);
		on = new OnState(this);
		paused = new PausedState(this);
		playing = new PlayingState(this);
		broken = new BrokenState(this);
		
		state = off;
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
	public boolean resume() {
		return state.resume();
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
