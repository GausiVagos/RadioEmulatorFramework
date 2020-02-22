package gauthierSimon.ref.POJOs.functioningStates;

import gauthierSimon.ref.POJOs.physicalComponents.RadioComponent;

public class OnState implements IState {

	RadioComponent context;
	
	public OnState(RadioComponent context) {
		super();
		this.context = context;
	}

	@Override
	public boolean turnOn() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean start() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean pause() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean resume() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean turnOff() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean breakComponent() {
		// TODO Auto-generated method stub
		return false;
		
	}

	@Override
	public boolean repairComponent() {
		// TODO Auto-generated method stub
		return false;
		
	}

}
