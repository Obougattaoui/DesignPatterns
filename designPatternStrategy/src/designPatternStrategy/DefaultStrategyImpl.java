package designPatternStrategy;

public class DefaultStrategyImpl implements Istrategy {

	@Override
	public void applyStrategy() {
		System.out.println("Etape interm�diare de l'algo avec la strat�gie par d�faut");
	}

}
