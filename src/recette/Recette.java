package recette;

import java.util.ArrayList;

public class Recette {

    private String nomRecette;
    private ArrayList <Ingredient> ingredients = new ArrayList<Ingredient>();

    public Recette(String nomRecette) {
        this.setNomRecette(nomRecette);
    }
    public String getNomRecette() {
        return nomRecette;
    }
    public void setNomRecette(String nomRecette) {
        this.nomRecette = nomRecette;
    }
    public void ajouterIngredient(Ingredient nouveauIngrdient){
        this.ingredients.add(nouveauIngrdient);
    }
    public int getNbIngredients(){
        return this.ingredients.size();
    }
    public void changeQuantiteIngredient(int position, double nouvelleQuantite){
        this.ingredients.get(position).setQuantite(nouvelleQuantite);
    }
    public String afficheIngredient(int position){
        return this.ingredients.get(position).toString();
    }
    public String afficheRecette(){
        return this.nomRecette + " : " + this.ingredients.toString();
    }

}
