import java.util.Random;

public class Proxy implements Standard {
	//proxy vers un objet:
	private StandardImpl1 target;
	@Override
	public void process() {
		System.out.println("V�rification du contexte de s�curit�");
		boolean b = new Random().nextBoolean();
		if (b) {
			System.out.println("Avant l'appel ===> on peut fait des traitements");
			target = new StandardImpl1();
			target.process();
			System.out.println("Apr�s l'appel ===> apr�s avoirs le r�sultat : faire v�rification, ...");//commit, fermer la connexion,transformaer le r�sultat,... 
		}			
		else
			throw new RuntimeException("Forbidden 403");
		
	}

}
