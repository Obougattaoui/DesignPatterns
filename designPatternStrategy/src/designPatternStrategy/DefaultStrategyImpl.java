package designPatternStrategy;

public class DefaultStrategyImpl implements Istrategy {

	@Override
	public void applyStrategy() {
		System.out.println("Etape intermédiare de l'algo avec la stratégie par défaut");
	}

}
