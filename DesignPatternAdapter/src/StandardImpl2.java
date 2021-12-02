
public class StandardImpl2 implements Standard {

	@Override
	public void operation(int nb1, int nb2) {
		double res = nb1 + nb2;
		System.out.println("***************************");
		System.out.println("Implémentation Standard 2");
		System.out.println("***** Res = " + res);
		System.out.println("***************************");
	}

}
