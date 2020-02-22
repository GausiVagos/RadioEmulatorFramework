package gauthierSimon.ref.POJOs.functioningStates;

public interface IState 
{
	public boolean turnOn();
	public boolean start();
	public boolean pause();
	public boolean turnOff();
	public boolean breakComponent();
	public boolean repairComponent();
}
