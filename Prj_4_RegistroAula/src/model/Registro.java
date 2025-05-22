package model;

import java.util.ArrayList;

public class Registro {

	/**
	 * nomeCorso
	 * studenti
	 * 
	 * getStudenteByMatricola(numMat) 
	 * 
	 * aggiungiStudenteAlCorso() **ATT** 
	 */
	
	private String nomeCorso;
	private ArrayList<Studente> studenti;
	
	public Registro(String nomeCorso) {
		this.nomeCorso = nomeCorso;
		this.studenti = new ArrayList<Studente>();
	}

	public String getNomeCorso() {
		return this.nomeCorso;
	}

	public ArrayList<Studente> getStudenti() {
		return this.studenti;
	}

	public Studente getStudByMat(int nMat) {
		for(Studente s: studenti) {
			if(s.getnMat() == nMat) {
				return s;
			}
		}
		return null;
	}
	
	public void aggiungiStudente(Studente s) {
		this.studenti.add(s);
	}
	
}
