package games.model;

public class EpicGamesStoreGames extends Games{

    private int criticsRecommend;
    private int topCriticAverage;
    private String openCriticRating;

    public EpicGamesStoreGames(String name, String description, String developer, String publisher, String releaseDate, float price, int criticsRecommend, int topCriticAverage, String openCriticRating) {
        super(name, description, developer, publisher, releaseDate, price);
        this.criticsRecommend = criticsRecommend;
        this.topCriticAverage = topCriticAverage;
        this.openCriticRating = openCriticRating;
    }

    public int getCriticsRecommend() {
        return criticsRecommend;
    }

    public void setCriticsRecommend(int criticsRecommend) {
        this.criticsRecommend = criticsRecommend;
    }

    public int getTopCriticAverage() {
        return topCriticAverage;
    }

    public void setTopCriticAverage(int topCriticAverage) {
        this.topCriticAverage = topCriticAverage;
    }

    public String getOpenCriticRating() {
        return openCriticRating;
    }

    public void setOpenCriticRating(String openCriticRating) {
        this.openCriticRating = openCriticRating;
    }

    public void informations(){
        super.informations();
        System.out.println("Critics Recommend: " + this.criticsRecommend);
        System.out.println("Top Critic Average: " + this.topCriticAverage);
        System.out.println("Open Critic Rating: " + this.openCriticRating);
    }
}
