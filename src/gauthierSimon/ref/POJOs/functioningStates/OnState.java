package gauthierSimon.ref.POJOs.functioningStates;

import gauthierSimon.ref.POJOs.physicalComponents.RadioComponent;

public class OnState implements IState {

	// OnState : displaying hour, etc, but not actually playing music.
	
	RadioComponent context;
	
	public OnState(RadioComponent context) {
		super();
		this.context = context;
	}

	@Override
	public boolean turnOn() {
		return false;
	}

	@Override
	public boolean start() {
		context.changeState(States.playing);
		return true;
	}

	@Override
	public boolean pause() {
		return false;
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
