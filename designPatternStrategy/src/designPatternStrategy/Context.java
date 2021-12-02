package designPatternStrategy;

public class Context {
	
	private Istrategy istrategy;
	
	public Context() {
		//new ===> couplage fort
		this.istrategy = new DefaultStrategyImpl();
	}
	public void  process() {
		System.out.println("Etape 1 de l'algorithme");
		//appliquer un traitement qui peut évoluer:
		istrategy.applyStrategy();
		System.out.println("Etape final de l'algorithme");
	}
	//permet d'injecter :
	public void setIstrategy(Istrategy istrategy) {
		this.istrategy = istrategy;
	}
}
