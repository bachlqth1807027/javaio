package entity;

public class Video {
    private String date;
    private String id;
    private String title;
    private double views;

    public Video(String id, double views) {
    }

    public Video(String date, String id, String title, double views) {
        this.date = date;
        this.id = id;
        this.title = title;
        this.views = views;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
}