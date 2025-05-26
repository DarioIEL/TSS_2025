package model;

import utils.Evolvibile;
import utils.TipoFuoco;

public class Charmeleon extends Pokemon implements TipoFuoco, Evolvibile{

	public Charmeleon(String nome, int livello, int pvMax, String[] tipi) {
		super(nome, livello, pvMax, tipi);

	}

	@Override
	public boolean puoEvolvere() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String prossimaEvoluzione() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pokemon evolvi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void lanciafiamme() {
		System.out.println(this.nome + " usa Lanciafiamme...VROOOOOOO");
	}

	@Override
	public void braciere() {
		System.out.println(this.nome + " usa Braciere");
	}

	@Override
	public void nitrocarica() {
		System.out.println(this.nome + " usa Nitrocarica");
	}

	@Override
	public void attaccoBase() {
		// TODO Auto-generated method stub
		this.mossaSpeciale();
	}

	@Override
	public void mossaSpeciale() {
		this.lanciafiamme();
	}

	@Override
	public void faiVerso() {
		System.out.println(this.nome + " dice: CHARMELEOOOOOOOON" );
	}
	
}
