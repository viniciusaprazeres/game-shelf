package games.model;

public class SteamGames extends Games{

    private int recentReviews;
    private int allReviews;

    public SteamGames(String name, String description, String developer, String publisher, String releaseDate, float price, int recentReviews, int allReviews) {
        super(name, description, developer, publisher, releaseDate, price);
        this.recentReviews = recentReviews;
        this.allReviews = allReviews;
    }

    public int getRecentReviews() {
        return recentReviews;
    }

    public void setRecentReviews(int recentReviews) {
        this.recentReviews = recentReviews;
    }

    public int getAllReviews() {
        return allReviews;
    }

    public void setAllReviews(int allReviews) {
        this.allReviews = allReviews;
    }

    public void informations(){
        super.informations();
        System.out.println("Recent Reviews: " + this.recentReviews + "%");
        System.out.println("All Reviews: " + this.allReviews + "%");
    }
}
