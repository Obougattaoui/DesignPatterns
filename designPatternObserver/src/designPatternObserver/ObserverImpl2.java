package designPatternObserver;

public class ObserverImpl2 implements Observer {

	@Override
	public void update(Observable observable) {
		int state = ((ObservableImpl) observable).getState();
		System.out.println("***********************Observer Impl2************");
		System.out.println("Nouvelle mise � jour: state " + state);
		System.out.println("R�sultat de calcul: " + ((state%2)==0? "Pair" : "Impair"));
	}

}
