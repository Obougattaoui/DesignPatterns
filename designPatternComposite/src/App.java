
public class App {

	public static void main(String[] args) {
		Folder root = new Folder("Root");
		Folder f1 = new Folder("Structure");
		Folder f2 = new Folder("Comportement");
		Folder f3 = new Folder("Création");
		root.addComposant(f1);
		root.addComposant(f2);
		root.addComposant(f3);
		
		f1.addComposant(new File("Composite"));
		f1.addComposant(new File("Decorator"));
		
		f2.addComposant(new File("Strategy"));
		
		f3.addComposant(new File("Singleton"));
		f3.addComposant(new File("Builder"));
		
		Folder fSt1 = (Folder)f1.addComposant(new Folder("St1"));
		fSt1.addComposant(new File("composite version 1"));
		root.view();
	}

}
