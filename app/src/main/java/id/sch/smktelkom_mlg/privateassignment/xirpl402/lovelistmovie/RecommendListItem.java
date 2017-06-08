package id.sch.smktelkom_mlg.privateassignment.xirpl402.lovelistmovie;


import java.io.Serializable;

public class RecommendListItem implements Serializable {
    public String imageUrl;
    public String head;
    // private String desc;

    public RecommendListItem(String imageUrl, String head) {
        this.imageUrl = imageUrl;
        this.head = head;

    }
}


