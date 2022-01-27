package application;

import  recette.Ingredient;
import recette.Recette;

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
        System.out.println(recette1.afficheIngredient(1));
        System.out.println(recette1.afficheRecette());


        // Nouvelle quantite

    }
}
