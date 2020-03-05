package gauthierSimon.ref.POJOs.functioningStates;

import gauthierSimon.ref.POJOs.physicalComponents.RadioComponent;

public class OnState implements IState {

	// OnState : displaying hour, etc, but not actually playing music.
	
	public OnState() {
		super();
	}

	@Override
	public boolean turnOn() {
		return false;
	}

	@Override
	public boolean start() {
		return true;
	}

	@Override
	public boolean pause() {
		return false;
	}

	@Override
	public boolean turnOff() {
		return true;
	}

	@Override
	public boolean breakComponent() {
		return true;
	}

	@Override
	public boolean repairComponent() {
		return false;
	}

}
