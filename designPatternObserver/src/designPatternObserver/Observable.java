package designPatternObserver;

//le sujet : 
public interface Observable  {
	public void subscribe(Observer o);// add a new observer
	public void unsubscribe(Observer o);// remove an observer
	public void notifyObservers();//notify an observer
}
