package gauthierSimon.ref.POJOs.physicalComponents;

import java.util.HashMap;
import java.util.Map;

public class Antenna extends RadioComponent 
{
	Map<Double,Object> captableObjects;
	
	

	public Map<Double, Object> getCaptableObjects() {
		return captableObjects;
	}



	public void setCaptableObjects(Map<Double, Object> captableObjects) {
		this.captableObjects = captableObjects;
	}


	public Antenna() {
		super();
		captableObjects = new HashMap<Double,Object>();
	}



	public Antenna(Map<Double, Object> captableObjects) {
		super();
		this.captableObjects = captableObjects;
	}


/*
	public Object capt(double frequency)
	{
		if(!isBroken)
		{
			return captableObjects.get(frequency);
		}
		else return null;
	}
	*/
}
