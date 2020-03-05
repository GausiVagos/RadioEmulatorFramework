package gauthierSimon.ref.POJOs.physicalComponents;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import gauthierSimon.ref.POJOs.functioningStates.BrokenState;
import gauthierSimon.ref.POJOs.functioningStates.OffState;
import gauthierSimon.ref.POJOs.functioningStates.OnState;
import gauthierSimon.ref.POJOs.functioningStates.PausedState;
import gauthierSimon.ref.POJOs.functioningStates.PlayingState;

public class Radio {
	Map<String,RadioComponent> components;

    OffState off;
	OnState on;
	PausedState paused;
	PlayingState playing;
	BrokenState broken;
	List<String> logs;

	public Radio()// basic radio with no optional feature
	{
	    off = new OffState();
		on = new OnState();
		paused = new PausedState();
		playing = new PlayingState();
		broken = new BrokenState();
		
		logs = new ArrayList<String>();
		
		components = new HashMap<>();
		components.put("Primary speaker", new Speaker(this,100));
		components.put("Antenna", new Antenna(this));
	}

	public OffState getOff() {
		return off;
	}

	public OnState getOn() {
		return on;
	}

	public PausedState getPaused() {
		return paused;
	}

	public PlayingState getPlaying() {
		return playing;
	}

	public BrokenState getBroken() {
		return broken;
	}
	
	public void addLog(String log)
	{
		logs.add(log);
	}
	
}
