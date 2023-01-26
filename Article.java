package poo;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
public class Article {

	public static void main(String[] args) {
			 Hashtable<Long, String> mapArticle = new Hashtable<Long, String>();
			  mapArticle.put(100L, "HP Slim Core i6");
			  mapArticle.put(102L, "Samsung Core i5");
			  mapArticle.put(103L, "Dell Core i5");
			  mapArticle.put(104L, "MacBook Core i7");
			  mapArticle.put(105L, "Toshiba Core i4");
			  mapArticle.put(106L, "Lenovo Centrino");
			  mapArticle.put(107L, "Samsung s21 Ulta");
			  mapArticle.put(108L, "Lg Resurrection 3");
			  mapArticle.put(109L, "OPPo Slim Ultimate");
			  mapArticle.put(110L, "Iphone13 Pro max");
			  mapArticle.put(111L, "Spark 22 Floid");
			  mapArticle.put(112L, "Itel 12 pro mini");
			  mapArticle.put(113L, "Ak47 automatic");
			  mapArticle.put(114L, "Calibre 12 ");
			  mapArticle.put(115L, "Grenade Aveuglante");
			  mapArticle.put(116L, "Bombe lacrimo");
			  mapArticle.put(117L, "Lunette a rayon x");
			  mapArticle.put(118L, "Miniteur explosif");
			  mapArticle.put(119L, "Stylo lazer");
			  mapArticle.put(120L, "Pantolon Blinder");
		 for (Map.Entry mapentry : mapArticle.entrySet()) {
			 if(mapentry.getValue().equals("Pantalon Blinder"))
		 	  System.out.println("cle:"+mapentry.getKey()
               +"| valeur:" +mapentry.getValue());
		 	  

			 
		 }
	 

	}

}
