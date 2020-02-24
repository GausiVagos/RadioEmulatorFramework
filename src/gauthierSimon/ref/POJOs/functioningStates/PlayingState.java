package gauthierSimon.ref.POJOs.functioningStates;

import gauthierSimon.ref.POJOs.physicalComponents.RadioComponent;

public class PlayingState implements IState {

	RadioComponent context;
	
	public PlayingState(RadioComponent context) {
		super();
		this.context = context;
	}

	@Override
	public boolean turnOn() {
		return false;
	}

	@Override
	public boolean start() {
		return false;
	}

	@Override
	public boolean pause() {
		return context.changeState(States.paused);
	}

	@Override
	public boolean turnOff() {
		return context.changeState(States.off);
	}

	@Override
	public boolean breakComponent() {
		return context.changeState(States.broken);
	}

	@Override
	public boolean repairComponent() {
		return false;
	}

}
