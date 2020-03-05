package gauthierSimon.ref.POJOs.functioningStates;

public class BrokenState implements IState {

	public BrokenState() {
		super();
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
		return true;
	}

}
