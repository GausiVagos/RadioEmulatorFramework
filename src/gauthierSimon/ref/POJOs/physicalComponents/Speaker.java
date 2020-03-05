package gauthierSimon.ref.POJOs.physicalComponents;

public class Speaker extends RadioComponent 
{
	int maxVolume;
	float currentVolume; //between 0 and 1
	
	public Speaker(Radio radio, int mv)
	{
		super(radio, "Speaker");
		maxVolume = mv;
	}
	
	public Speaker(Radio radio, String name, int mv) {
		super(radio, name);
		maxVolume = mv;
	}
	
	
	// State methods that need extra actions :
	
	@Override
	public boolean start() {
		if(super.start()) // if the state has changed & was set to "playing"
		{
			//TODO visual/textual representation
			// start music at maxVolume*currentVolume
			return true;
		}
		return false;
	}

	@Override
	public boolean pause() {
		if(super.pause())
		{
			//TODO
			// pause music
			return true;
		}
		return false;
	}

	@Override
	public boolean turnOff() {
		if(super.turnOff())
		{
			//TODO
			// stop music
			return true;
		}
		return false;
	}

	@Override
	public boolean breakComponent() {
		if(super.breakComponent())
		{
			//TODO
			// stop music
			return true;
		}
		return false;
	}
	
	
	
}
