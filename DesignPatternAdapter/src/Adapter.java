
public class Adapter implements Standard{
	private AncienneImpl ancienneImpl = new AncienneImpl();
	
	@Override
	public void operation(int nb1, int nb2) {
		double res = ancienneImpl.calcul(nb1, nb2);
		ancienneImpl.print(res);
	}

}
