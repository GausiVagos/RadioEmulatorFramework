package gauthierSimon.ref.POJOs.functioningStates;

public class OffState implements IState {

	public OffState() {
		super();
	}

	@Override
	public boolean turnOn() {
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
		return true;
	}

	@Override
	public boolean repairComponent() {
		return false;
	}

}
