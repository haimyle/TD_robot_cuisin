package recette;

public class Ingredient {
    private String nom;
    private double quantite;
    private String unite;

    public Ingredient(String nom, double quantite, String unite){
        this.nom = nom;
        this.quantite = quantite;
        this.unite = unite;
    }

    public String afficher(){
        return this.nom + " : " + this.quantite + " " + this.unite;
    }

    public String getNom(){
        return this.nom;
    }
    public double getQuantite(){
        return this.quantite;
    }
    public String getUnite(){
        return  this.unite;
    }
    public void setQuantite(double quantite){
        this.quantite = quantite;
    }
}
