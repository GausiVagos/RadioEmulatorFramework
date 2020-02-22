package gauthierSimon.ref.POJOs.physicalComponents;

import java.util.HashMap;
import java.util.Map;

import gauthierSimon.ref.POJOs.functioningStates.States;

public class Antenna extends RadioComponent 
{
	double currentFrequency;
	Map<Double,Object> captableObjects;
	

	public double getCurrentFrequency() {
		return currentFrequency;
	}


	public void setCurrentFrequency(double currentFrequency) {
		this.currentFrequency = currentFrequency;
	}


	public Map<Double, Object> getCaptableObjects() {
		return captableObjects;
	}


	public void setCaptableObjects(Map<Double, Object> captableObjects) {
		this.captableObjects = captableObjects;
	}

	public Antenna() {
		super("Antenna");
		captableObjects = new HashMap<Double,Object>();
	}


	public Antenna(String name,Map<Double, Object> captableObjects) {
		super(name);
		this.captableObjects = captableObjects;
	}


	@Override
	public boolean turnOn() {
		if(super.turnOn() && enumState == States.on)
		{
			//TODO the antenna get the "online" content
			//captableObjects == 
			return true;
		}
		return false;
	}


	@Override
	public boolean start() {
		if(super.start() && enumState == States.playing)
		{
			Object sound = captableObjects.get(currentFrequency);
			if(sound!=null)
			{
				//do something
			}
			else
			{
				//parasites
			}
			return true;
		}
		return false;
	}


	@Override
	public boolean breakComponent() {
		if(super.breakComponent() && enumState == States.broken)
		{
			//DO SOMETHING (stop speakers?)
			return true;
		}
		return false;
	}

}
