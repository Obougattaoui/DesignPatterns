package designPatternStrategy;

public class StrategyImpl1 implements Istrategy {

	@Override
	public void applyStrategy() {
		System.out.println("Etape intermédiare de l'algo avec la stratégie 1");
	}

}
