
public class File extends Composant{

	public File(String name) {
		super(name);
	}

	@Override
	public void view() {
		String tab = identation();
		 System.out.println(tab + "File: " + name);
	}

}
