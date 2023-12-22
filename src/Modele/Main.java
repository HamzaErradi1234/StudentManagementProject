package Modele;


import Service.DB;
import Controller.DepartementsController;

import java.util.Scanner;

public class Main {
    public static boolean isNull(Object ob) {
        return ob == null ;
    }
    public static int getIntInput(String... msg) {
        Scanner scan = new Scanner(System.in);
        String message = "Entrez un nombre entier : ";
        if (msg.length > 0 )
            message = msg[0] ;
        System.out.print(message);

        return scan.nextInt();
    }

    public static String getStringInput(String... msg) {
        Scanner scan = new Scanner(System.in);
        String message = "Entrez un texte : ";
        if (msg.length > 0 )
            message = msg[0] ;
        System.out.print(message);

        String str = scan.nextLine();


        return str;
    }

    public static void showPrincipalMenu(){
        System.out.println("-------------------------[ Bienvenu ]---------------------------");


        System.out.println("1: Pour gérer les départements");
        System.out.println("2: Pour gérer les filières");
        System.out.println("3: Pour gérer les enseignants");
        System.out.println("4: Pour gérer les modules");
        System.out.println("5: Pour gérer les étudiants");
        System.out.println("0: Pour sortir");


        int option = getIntInput("Veuillez sélectionner une option : ");
        switch(option) {
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:

        }
        switch(option) {
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:

        }


    }
    public static void main(String[] args) {

        Enseignant enseignant = new Enseignant();
        enseignant.setNom("Mohammed");
        enseignant.setPrenom("Hicham");
        enseignant.setEmail("thh@gmail.com");
        enseignant.setGrade("Prof");
        enseignant.setId(DB.getEnsId());
        DB.enseignants.add(enseignant);
        showPrincipalMenu();
    }
}
