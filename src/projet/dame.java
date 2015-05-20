package projet;

public class dame extends Humain{
	private String colorRobe;
	private boolean Libre;
	
	public dame(String nomDame){
		super(nomDame);
		colorRobe="noire";
		Libre=true;
	}
	public void kidnap(){
		Libre=false;
		parle("haaaaaaaaaaaaaaaaaaaa!!!");
	}
	public void Liberer(String nomCowboy){
		Libre=true;
		parle("Merci "+nomCowboy+"vous etes mon héro" );
	} 
	public void swap(String couleur){
		colorRobe=couleur;
		parle("Regardez ma nouvelle robe "+colorRobe);
	}
	public String quelEstTonNom(){
		parle("Miss "+ this.nom);
		return this.nom;
	}

}