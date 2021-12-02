import java.util.ArrayList;
import java.util.List;

public class Folder extends Composant{
	
	private List<Composant> composants = new ArrayList<Composant>();
	
	public Folder(String name) {
		super(name);
	}

	@Override
	public void view() {
		String tab = identation();
		System.out.println(tab + "Folder: " + name);
		for(Composant c: composants) {
			c.view();
		}
	}
	
	public Composant addComposant(Composant composant) {
		composant.level = this.level + 1;
		this.parent = this;
		this.composants.add(composant);
		return composant;
	}

}
