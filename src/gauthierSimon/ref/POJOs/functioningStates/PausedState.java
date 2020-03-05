package gauthierSimon.ref.POJOs.functioningStates;

public class PausedState implements IState{

	public PausedState() {
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
