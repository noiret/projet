package projet;

public class humain {
	private String nom;
	private String boissonFavorite;
	
	public humain(String nom,String boissonFavorite){
		this.nom="nom";
		this.boissonFavorite="eau";
	}
	
	public static void parle(String unnom,String uneboissonFavorite){
		System.out.println(unnom+" - Ah un bon verre de "+uneboissonFavorite+" ! GLOUPS !");
	}

}
