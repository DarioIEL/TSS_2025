package view;

import controller.PlayListCtrl;
import model.Brano;
import model.Playlist;

public class Main {
	
	public static void main(String[] args) {
		
		Playlist miaPlayList = new Playlist("rock '70");

//		Brano nuovoBrano = new Brano("Immigrant song", "Led Zeppelin", 4.5);
//		Brano nuovoBrano2 = new Brano("Breathe", "Pink Floyd", 5.2);
//				
//		miaPlayList.addBrano(nuovoBrano);
//		miaPlayList.addBrano(nuovoBrano2);

//		PlayListCtrl database = new PlayListCtrl();
//		database.caricaCanzoni();
//		database.stampaBraniPL();
		
		
		PlayListCtrl db = new PlayListCtrl();
		db.caricaCanzoniDaFile();
		System.out.println("Stai stampando tutti i brani disponibili !!");
		db.stampaBraniPL();
		
		System.out.println("----------AGGIUNGO A PLAY-----------");
		
		miaPlayList.addBrano(db.getSingoloBrano(0));
		miaPlayList.addBrano(db.getSingoloBrano(12));
		miaPlayList.addBrano(db.getSingoloBrano(64));
		miaPlayList.addBrano(db.getSingoloBrano(0)); //già esiste
		miaPlayList.addBrano(db.getSingoloBrano(64)); //già esiste
		
		
		miaPlayList.infoPlayList();
		
//		System.out.println("----------Confronta brani------------");
//		
//		Brano b1 = db.getSingoloBrano(0);
//		System.out.println(b1);
//		
//		Brano b2 = db.getSingoloBrano(1);
//		System.out.println(b2);
//		
//		if(b1.compareTo(b2) == 0) {
//			System.out.println("I brani sono uguali");
//		}else {
//			System.out.println("I brani sono diversi");
//			System.out.println(b1.compareTo(b2));
//		}
	}
	
}
