package projet;

public class Humain {
	protected String nom;
	private String boissonFavorite;
	
	public Humain(String nom){
		this.nom=nom;
		boissonFavorite="l'eau";
	}
	public void parle(String texte){
		System.out.println(nom+" - "+texte);
	}
	public String quelEstTonNom(){
		return nom;
	}
	public String quelEstTaBoissonFavorite(){
		return boissonFavorite;
	}
	public void presentation(){
		parle("Bonjour.");
		parle("Je m'appelle "+nom);
		parle("Ma boisson favorite est "+boissonFavorite);
	}
	public void boire(){
		parle("Ah un bon verre de "+boissonFavorite+" ! GLOUPS !");
	}
}