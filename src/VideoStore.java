import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Movie> lista;

    public VideoStore(){
        lista = new ArrayList<>();
    }

    public void addFilm(Movie filmNou){
        lista.add(filmNou);
    }

    public void afiseazaFilme(){
        for(Movie filmCurent : lista){
            System.out.println(filmCurent);
        }
    }

    public boolean inchiriazaFilm(String titluCautat){
        for(Movie filmCurent : lista){
            if(filmCurent.getTitlu().equalsIgnoreCase(titluCautat)){
               if(filmCurent.isDisponibil()) {
                   filmCurent.setDisponibil(false);
                   System.out.println("Filmul a fost inchiriat cu succes!");
                   return true;
               }
               else{
                   System.out.println("Filmul este deja inchiriat! ");
                   return false;
               }
            }
        }
        System.out.println("Filmul nu a fost gasit!");
        return false;
    }
}
