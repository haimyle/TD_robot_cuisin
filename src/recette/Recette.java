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
    public void ajouterIngredient(Ingredient nouveauIngredient){
        this.ingredients.add(nouveauIngredient);
    }
    public int getNbIngredients(){
        return this.ingredients.size();
    }
    public void changeQuantiteIngredient(int position, double nouvelleQuantite){
        this.ingredients.get(position).setQuantite(nouvelleQuantite);
    }
    public String afficheIngredient(int position){
        return this.ingredients.get(position).getNom();
    }
    public String afficheRecette(){
        for (Ingredient i : ingredients){
            i.getNom();
        }
        return this.nomRecette + " : " + for (Ingredient i : ingredients){
            i.getNom();
        } ;
    }

}
