package projet;

public class cowboy extends Humain {
	private int popularit�;
	private String caract;
	public cowboy(String nomCowboy){
		super(nomCowboy);
		popularit�=0;
		caract="vaillant";
	}
	public void tirer(String nomBrigand){
		// affiche le %=cherche les element du tab dans l'odre(1,2,...) new tableau d'objet sort pour aller chercher les elements 
		System.out.printf("Le % % tire sur %. Pan !",new Object [] {caract,this.nom,nomBrigand});
		parle("Prend �a, rascal !");
	}
	public void libererDame(){
		popularit�++;
		parle("Que vous avez de grande dent !");
	}
	
}
