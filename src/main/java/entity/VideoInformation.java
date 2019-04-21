package entity;

public class VideoInformation {
    private String id;
    private String title;
    private double views;

    public VideoInformation() {
    }

    public VideoInformation(String id, String title, double views) {
        this.id = id;
        this.title = title;
        this.views = views;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getViews() {
        return views;
    }

    public void setViews(double views) {
        this.views = views;
    }
}
