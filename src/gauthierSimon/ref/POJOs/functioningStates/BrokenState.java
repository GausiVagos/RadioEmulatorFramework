package gauthierSimon.ref.POJOs.functioningStates;

import gauthierSimon.ref.POJOs.physicalComponents.RadioComponent;

public class BrokenState implements IState {

	RadioComponent context;
	
	
	public BrokenState(RadioComponent context) {
		super();
		this.context = context;
	}
	
	
	//TODO : error messages in the error panel
	
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
		return false;
	}

	@Override
	public boolean turnOff() {
		return false;
	}

	@Override
	public boolean breakComponent() {
		return false;
	}

	@Override
	public boolean repairComponent() {
		context.changeState(States.off);
		return true;
	}

}
