package minhasmusica.exercicio;

public class Music extends  Audio{
    private String album;
    private String artist;
    private String genero;

    public String getAlbum() {
        return album;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public int getClassication() {
        if(this.getReproductionTotal() > 5000){
            return 10;
        } else {
            return 8;
        }

    }
}
