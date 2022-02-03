package application;

import  recette.Ingredient;
import recette.Recette;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Instancier un objet de type Recette
        Recette recette1 = new Recette("crepes");
        for (int i = 0; i<3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nom de l'ingredient: ");
            String nom = sc.nextLine();
            System.out.print("Quantite: ");
            double quantite = sc.nextDouble();
            System.out.print("Unite: ");
            sc.nextLine();
            String unite = sc.nextLine();

            // Instancier un objet de type Ingredient
            Ingredient myIngredient = new Ingredient(nom, quantite, unite);
            recette1.ajouterIngredient(myIngredient);
        }

        System.out.println("Nombre d'ingredients: "+recette1.getNbIngredients());
        System.out.println("Le premier ingredient: "+recette1.afficheIngredient(0));
        System.out.println("Recette complete: "+ recette1.afficheRecette());

        int multiplicateur = 5;
        for (int i = 0; i< recette1.getNbIngredients();i++){
            recette1.getIngredients(i).setQuantite(recette1.getIngredients(i).getQuantite()*multiplicateur);
        }
        System.out.println(recette1.afficheRecette());


        // Nouvelle quantite

    }
}
