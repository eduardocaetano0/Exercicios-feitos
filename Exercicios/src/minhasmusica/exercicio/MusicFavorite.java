package minhasmusica.exercicio;

public class MusicFavorite {

    public void include(Audio audio) {
        if (audio.getClassication() >= 8) {
            System.out.println("A música"+ audio.getTitle() +"está nas mais favoritas!");
        } else {
            System.out.println("Escute também!");
        }
    }
}