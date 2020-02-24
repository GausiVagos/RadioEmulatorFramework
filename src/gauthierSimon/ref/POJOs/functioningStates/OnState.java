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
		return context.changeState(States.playing);
	}

	@Override
	public boolean pause() {
		return false;
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
