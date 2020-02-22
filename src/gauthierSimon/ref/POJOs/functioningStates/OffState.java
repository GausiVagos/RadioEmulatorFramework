package gauthierSimon.ref.POJOs.functioningStates;

import gauthierSimon.ref.POJOs.physicalComponents.RadioComponent;

public class OffState implements IState {

	RadioComponent context;
	
	public OffState(RadioComponent context) {
		super();
		this.context = context;
	}

	@Override
	public boolean turnOn() {
		context.changeState(States.on);
		return true;
	}

	@Override
	public boolean start() {
		return false;
	}

	@Override
	public boolean pause() {
		return false;
	}

	@Override
	public boolean turnOff() {
		return false;
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
