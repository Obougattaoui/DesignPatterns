package decorateurs;

import boissons.Boisson;

public class Caramel extends AbstractDecorator{

	public Caramel(Boisson boisson) {
		super(boisson);
	}

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return 0.9 + boisson.cout();
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " Au Caramel";
	}
	
}
