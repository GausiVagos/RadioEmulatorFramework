package gauthierSimon.ref.POJOs.functioningStates;

public class PlayingState implements IState {

	public PlayingState() {
		super();
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
		return true;
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
