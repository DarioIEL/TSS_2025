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

		PlayListCtrl database = new PlayListCtrl();
		database.caricaCanzoni();
		database.stampaBraniPL();
		
	}
	
}
