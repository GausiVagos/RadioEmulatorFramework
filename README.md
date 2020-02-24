<b>WORK IN PROGRESS</b>
<p>
  Java state machine allowing to emulate the design and use of a DAB+ radio device. <i>(UMONS : projet de Génie Logiciel)</i>
</p>
<h2>Packages :</h2>

<h4>functioningStates</h4>
Contains the state mechanics of the project:
<ul>
  <li>States : a simple enum containing the names of the different states, to simplify and uniformize the calling of some methods.</li>
  <li>IState : the java interface containing the methods allowing to change the current state; implemented by the following </li>
  <li>***State : the real states of the system. The methods they contain determines how they pass from one to another.</li>
</ul>

<i>Note : all the said methods return a boolean, designing if the state has successfully changed.</i>

<h4>physicalComponents</h4>
Contains the base and optional features/components of the radio.
<ul>
  <li>RadioComponent : the base abstract class for all of them. Has an instance of all the states, and switch the current one according to the methods (*).</li>
  <li>Radio : the container of all the components, central system.</li>
  <li>*Others* : the specialized components, overriding some of the state methods if needed (see explanations below).</li>
</ul>

<i>(*)Note : due to the potentially high number of components, each having a complete set of states, it may be less taxing to only store the current state, and create a new one at each change?
<b> OR </b>
store one instance of each state centrally, and only pass the reference to the new state? Definitively this one.</i>

<h2>State mechanic</h2>
<p>
  Each radio component has a current state. The call of one of the methods is delegated to the latter, which determine if this 
  change is possible. If it is, the state calls the <i>changeState</i> method of the component, which change its current state and returns 
  <i>true</i> to manifest that a modification has occured.
</p>
<p>
  If the change of state requires a specific action within a component (ex : in <b>Speaker</b>, the <i>turnOff</i>, <i>pause</i> or <i>breakComponent</i> methods need to stop the music)
  , the said method is overriden in the said component. The super method is called to verify the change has occured, and if so the necessary actions are taken.
</p>

