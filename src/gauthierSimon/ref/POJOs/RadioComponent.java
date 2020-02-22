package gauthierSimon.ref.POJOs;

public abstract class RadioComponent 
{
	boolean isBroken = false;
	
	public void repairComponent()
	{
		isBroken = false;
	}
	
	public void breakComponent()
	{
		isBroken = true;
	}
}
