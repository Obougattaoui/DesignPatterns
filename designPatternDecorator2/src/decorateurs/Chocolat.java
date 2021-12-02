package decorateurs;

import boissons.Boisson;

public class Chocolat extends AbstractDecorator{

	public Chocolat(Boisson boisson) {
		super(boisson);
	}

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return 0.7 + boisson.cout();
	}

	@Override
	public String getDescription() {
		return boisson.getDescription() + " Au chocolat";
	}
	
}
