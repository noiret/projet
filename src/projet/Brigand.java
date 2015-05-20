package projet;

public class Brigand extends Humain {
	private String style;
	private int nbDame;
	private int prix;
	private boolean prison;
	public Brigand(String nom){
		super(nom);
		style="méchant";
		nbDame=0;
		prix=100;
		prison=false;
	}
	public void kidnap(String nomDame){
		parle("Ah ah ! "+nomDame+", tu est mienne désormais !");
		nbDame++;
	}
	public void enPrison(String nomCowboy){
		prison=true;
		parle("Damned, je suis fait ! "+nomCowboy+", tu m'as eu");
	}
	public int getRec(){
		return prix;
	}
	public String quelEstTonNom(){
		parle("je suis "+this.nom+" le "+style);
		return nom;
	}
	
}
