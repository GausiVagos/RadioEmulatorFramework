package gauthierSimon.ref.POJOs.physicalComponents;

public class Speaker extends RadioComponent 
{
	int maxVolume;
	enum playingState{
		off,
		playing,
		paused
	}
	
	/*
	public boolean startPlaying(Object sound, float volumePercentage)
	{
		if(!isBroken)
		{
			//TODO
			float volume = volumePercentage*maxVolume;
		}
		return false;
	}
	
	public boolean stopPlaying()
	{
		//TODO
		return true;
	}
	*/
}
