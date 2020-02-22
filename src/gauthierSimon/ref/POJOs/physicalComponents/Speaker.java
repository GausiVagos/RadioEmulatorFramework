package gauthierSimon.ref.POJOs.physicalComponents;

import gauthierSimon.ref.POJOs.functioningStates.States;

public class Speaker extends RadioComponent 
{
	int maxVolume;
	float currentVolume; //between 0 and 1
	
	public Speaker(int mv)
	{
		super("Speaker");
		maxVolume = mv;
	}
	
	public Speaker(String name, int mv) {
		super(name);
		maxVolume = mv;
	}
	
	
	// State methods that need extra actions :
	
	@Override
	public boolean start() {
		if(super.start() && enumState == States.playing) // if the state has changed && was set to "playing"
		{
			//TODO visual/textual representation
			// start music at maxVolume*currentVolume
			return true;
		}
		return false;
	}

	@Override
	public boolean pause() {
		if(super.pause() && enumState == States.paused)
		{
			//TODO
			// pause music
			return true;
		}
		return false;
	}

	@Override
	public boolean turnOff() {
		if(super.turnOff() && enumState == States.off)
		{
			//TODO
			// stop music
			return true;
		}
		return false;
	}

	@Override
	public boolean breakComponent() {
		if(super.breakComponent() && enumState == States.broken)
		{
			//TODO
			// stop music
			return true;
		}
		return false;
	}
	
	
	
}
