import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);
        VideoStore manager = new VideoStore();
        boolean ruleaza = true;
        Movie film1 = new Movie("Matrix", 1999);
        Movie film2 = new Movie("Zootropolis 2", 2026);

        System.out.println(film1);
        System.out.println(film2);

        manager.addFilm(film1);
        manager.addFilm(film2);

        System.out.println("Filmele de test au fost adaugate cu succes!");

        while (ruleaza) {
            System.out.println("\n *MENIU VIDEOTECA*");
            System.out.println("1. Adauga un film nou");
            System.out.println("2. Afiseaza toate filmele");
            System.out.println("3. Inchiriaza un film");
            System.out.println("4. Iesire");
            System.out.println("Alege o obtiune: ");

            int obtiune = cititor.nextInt();
            cititor.nextLine();

            switch(obtiune){
                case 1:
                    System.out.print("Introduceti titlul filmului: ");
                    String titluNou = cititor.nextLine();

                    System.out.print("Introduceti anul filmului: ");
                    int anNou = cititor.nextInt();
                    cititor.nextLine();

                    Movie filmNou = new Movie(titluNou, anNou);
                    manager.addFilm(filmNou);
                    break;

                case 2:
                    System.out.println("\n *Inventar Filme* ");
                    manager.afiseazaFilme();
                    break;

                case 3:
                    System.out.print("Introduceti titlul filmului pe care vreti sa l inchiriati ");
                    String titluCautat = cititor.nextLine();
                    manager.inchiriazaFilm(titluCautat);
                    break;

                case 4:
                    ruleaza = false;
                    System.out.println("Iesire");
                    break;

                default:
                    System.out.println("Obtiune invalida! ");
            }
        }
        cititor.close();
    }
}