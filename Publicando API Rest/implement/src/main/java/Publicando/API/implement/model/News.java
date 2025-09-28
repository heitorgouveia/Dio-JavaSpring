package Publicando.API.implement.model;

public class News {

    private Long id;
    private String icon;
    private String newsDescription;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getNewsDescription() {
        return newsDescription;
    }
    public void setNewsDescription(String newsDescription) {
        this.newsDescription = newsDescription;
    }

}
