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
		context.changeState(States.paused);
		return true;
	}

	@Override
	public boolean turnOff() {
		context.changeState(States.off);
		return true;
	}

	@Override
	public boolean breakComponent() {
		context.changeState(States.broken);
		return true;
	}

	@Override
	public boolean repairComponent() {
		return false;
	}

}
