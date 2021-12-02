import java.util.Random;

public class Proxy implements Standard {
	//proxy vers un objet:
	private StandardImpl1 target;
	@Override
	public void process() {
		System.out.println("Vérification du contexte de sécurité");
		boolean b = new Random().nextBoolean();
		if (b) {
			System.out.println("Avant l'appel ===> on peut fait des traitements");
			target = new StandardImpl1();
			target.process();
			System.out.println("Aprés l'appel ===> aprés avoirs le résultat : faire vérification, ...");//commit, fermer la connexion,transformaer le résultat,... 
		}			
		else
			throw new RuntimeException("Forbidden 403");
		
	}

}
