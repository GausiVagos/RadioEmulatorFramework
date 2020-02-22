package gauthierSimon.ref.POJOs.physicalComponents;

import java.util.HashMap;
import java.util.Map;

public class Radio {
	Map<String,RadioComponent> components;
	
	public Radio()// basic radio with no optional feature
	{
		components = new HashMap<>();
		components.put("Primary speaker", new Speaker(100));
		components.put("Antenna", new Antenna());
	}
}
