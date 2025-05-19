package model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {

	private String nomePL;
	private List<Brano> brani = new ArrayList<Brano>();

	public Playlist(String nomePL) {
		this.nomePL = nomePL;
		System.out.println("Hai appena creato una playlist..");
	}

	public String getNomePL() {
		return nomePL;
	}

	public List<Brano> getBrani() {
		return brani;
	}

	public void addBrano(Brano brano) {
		
		if(brani.size() == 0) {
			//il primo lo aggiunge sempre
			brani.add(brano);
		}else {
			for (Brano branoInPL : brani) {
				if(branoInPL.compareTo(brano) == 0) {
					System.out.println("Stai aggiungendo un brano esistente: " + brano);
					break;
				}else {
					this.brani.add(brano);
					break;
				}
			}
		}
	}

	public void infoPlayList() {
		System.out.println("Hai scelto la playlist: " + this.nomePL);
		int spazioDisponibile = 10 - this.brani.size();
		System.out.println("Hai ancora posto per " + spazioDisponibile + " posti");
	}

}
