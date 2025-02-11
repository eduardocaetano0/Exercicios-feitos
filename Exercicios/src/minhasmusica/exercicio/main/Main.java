package minhasmusica.exercicio.main;
import minhasmusica.exercicio.Music;
import minhasmusica.exercicio.MusicFavorite;

public class Main {
    public static void main(String[] args) {
        Music music = new Music();

        music.setTitle(" Rich Spirit ");
        music.setAlbum(" Mr. Morale & the Big Steppers ");
        music.setArtist(" Kendrick Lamar ");
        music.setGenero(" Rap ");

        for (int i = 0; i < 100 ; i++) {
            music.getReproductionTotal();
        }
        for (int i = 0; i < 50; i++) {
            music.like();
        }
        MusicFavorite musicFavorite = new MusicFavorite();

        musicFavorite.include(music);
    }
}
