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
		return context.changeState(States.on);
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
		return context.changeState(States.broken);
	}

	@Override
	public boolean repairComponent() {
		return false;
	}

}
