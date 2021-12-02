
public abstract class Composant {
	protected String name;
	//le niveau de l'élement dans l'herarchie:
	protected int level;
	protected Folder parent;
	
	
	public Composant(String name) {
		this.name = name;
	}

	//un élement va afficher l'hierarchie:
	public abstract void view();
	public String identation() {
		String str = "";
		for(int i = 0; i < level; i++) {
			str += "\t";
		}
		return str;
	}

	public Folder getParent() {
		return parent;
	}
}
