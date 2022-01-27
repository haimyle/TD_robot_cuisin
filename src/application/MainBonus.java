package application;

import recette.Ingredient;

import java.util.ArrayList;
import java.util.Scanner;

public class MainBonus {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Ingredient> myList = new ArrayList<Ingredient>();
        int id;
        int choix;
        double quantite;
        do {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Creer une nouvel ingredient");
            System.out.println("2. Afficher touts les ingredients");
            System.out.println("3. Afficher un ingredient");
            System.out.println("4. Remplacer un ingredient");
            System.out.println("5. Supprimer un ingredient");
            System.out.println("6. Modifier la quantite");
            System.out.print("Veuillez choisir une option: ");
            choix = sc.nextInt();
            System.out.println();

            switch (choix){
                case 1:
                    Ingredient myIngredient = creerIngredient();
                    myList.add(myIngredient);
                    break;
                case 2:
                    for (int i = 0; i<myList.size(); i++){
                        System.out.println(i+1 + " . " +myList.get(i).afficher());
                    }
                    break;
                case 3:
                    System.out.println("ID de l'ingredient: ");
                    id = sc.nextInt();
                    System.out.println(myList.get(id -1).getNom());
                    break;
                case 4:
                    System.out.println("ID de l'ingredient a remplacer: ");
                    id = sc.nextInt();
                    myList.set(id-1,myList.get(id-2));
                case 5:
                    System.out.println("ID de l'ingredient a supprimer");
                    id = sc.nextInt();
                    myList.remove(id -1);
                    break;
                case 6:
                    System.out.println("ID de l'ingredient a modifier: ");
                    id = sc.nextInt();
                    System.out.println("Nouvelle quantite: ");
                    quantite = sc.nextDouble();
                    myList.get(id-1).setQuantite(quantite);
                    System.out.println(myList.get(id-1).afficher());

                    break;


            }

        } while (choix !=0);



    }
    public static Ingredient creerIngredient (){
        System.out.print("Nom de l'ingredient: ");
        String nom = sc.nextLine();
        System.out.print("Quantite: ");
        Double quantite = sc.nextDouble();
        sc.nextLine();
        System.out.print("Unite: ");
        String unite = sc.nextLine();
        Ingredient myIngredient = new Ingredient(nom, quantite,unite);
        return myIngredient;
    }
}
