package gauthierSimon.ref.POJOs.physicalComponents;

import java.util.HashMap;
import java.util.Map;

public class Radio {
	Map<String,RadioComponent> components;

        OffState off;
	OnState on;
	PausedState paused;
	PlayingState playing;
	BrokenState broken;
	
	public Radio()// basic radio with no optional feature
	{
	        off = new OffState(this);
		on = new OnState(this);
		paused = new PausedState(this);
		playing = new PlayingState(this);
		broken = new BrokenState(this);

                components = new HashMap<>();
		components.put("Primary speaker", new Speaker(100));
		components.put("Antenna", new Antenna());
	}
}
