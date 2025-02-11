package minhasmusica.exercicio;

public class Audio {
    private String title;
    private int likesTotal;
    private int reproductionTotal;
    private int classication;

    public int getReproductionTotal() {
        return reproductionTotal;
    }
    public int getClassication() {
        return classication;
    }
    public int getLikesTotal() {
        return likesTotal;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public void like(){
        this.likesTotal++;
    }
    public void play(){
        this.reproductionTotal++;
    }
}