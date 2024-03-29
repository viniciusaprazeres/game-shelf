package games.model;

import games.util.Colors;

public class EpicGamesStoreGames extends Games{

    private int criticsRecommend;
    private int topCriticAverage;
    private String openCriticRating;

    public EpicGamesStoreGames(String name, String description, String developer, String publisher, String releaseDate, float price, String platform, int criticsRecommend, int topCriticAverage, String openCriticRating) {
        super(name, description, developer, publisher, releaseDate, price, platform);
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
        System.out.println(Colors.TEXT_WHITE_BOLD_BRIGHT + "⢠⣴⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣶⣦⡄");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⣿⣿⡇¨¨⣿¨¨¨¨¨ ⣿¨¨⡏¨¨¨¨¨⢹⣿⣿");
        System.out.println("⣿⣿⡇⠸⣿⣿⠀⢸⡇⠀⣿⠀⢸⡇⠀⣿⣧⣼⣿⣿");
        System.out.println("⣿⣿⡇⢀⣤⣿⠀⠈⠁⢀⣿⠀⢸⡇⠀⣿⡿⢿⣿⣿");
        System.out.println("⣿⣿⡇⠸⠿⣿⠀⢸⣿⣿⣿⠀⢸⡇⠀⠿⠃⢸⣿⣿");
        System.out.println("⣿⣿⣧⣤⣤⣿⣤⣼⣿⣿⣿⣤⣼⣷⣤⣤⣤⣾⣿⣿");
        System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        System.out.println("⠈⠛⢿⣿⣿⣿⣯⣭⣉⠉⠉⣉⣭⣽⣿⣿⣿⡿⠛⠁");
        System.out.println("⠀⠀⠀⠀⠉⠛⠿⣿⣿⣿⣿⣿⣿⠿⠛⠉⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀");
        super.informations();
        System.out.println("Critics Recommend: " + this.criticsRecommend);
        System.out.println("Top Critic Average: " + this.topCriticAverage);
        System.out.println("Open Critic Rating: " + this.openCriticRating + Colors.TEXT_RESET);
    }
}
