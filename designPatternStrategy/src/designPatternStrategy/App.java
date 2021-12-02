package designPatternStrategy;

import java.util.Scanner;

public class App {

	public static void main(String[] args) throws InstantiationException, ClassNotFoundException, IllegalAccessException {
		Context context = new Context();
		Scanner scanner =  new Scanner(System.in);
		boolean fin  = false;
		while(!fin) {
			System.out.println("Donner la stratégie : ");
			String strategyClassName = scanner.nextLine();
			Istrategy strategy = (Istrategy) Class.forName(strategyClassName).newInstance();
			System.out.println("----------------------------------");
			context.setIstrategy(strategy);
			context.process();
		}
	}

}
