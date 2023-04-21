package games.model;

public class XboxGames  extends Games{

    private float reviews;

    public XboxGames(String name, String description, String developer, String publisher, String releaseDate, float price, String platform, float reviews) {
        super(name, description, developer, publisher, releaseDate, price, platform);
        this.reviews = reviews;
    }

    public float getReviews() {
        return reviews;
    }

    public void setReviews(float reviews) {
        this.reviews = reviews;
    }

    public void informations(){
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⡤⠴⢾⣿⣿⣻⢿⣽⢿⣿⣿⡷⠦⢄⡀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⣠⣀⡀⠀⠀⠀⠀⠈⠙⠻⠟⠋⠁⠀⠀⠀⠀⢀⣀⣀⠀⠀⠀⠀");
        System.out.println("⠀⠀⢀⣴⣿⢿⡿⣷⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣾⣿⢿⡿⣧⡀⠀⠀");
        System.out.println("⠀⢀⣾⡿⣯⣿⣻⣽⣟⣿⠆⠀⠀⠀⠀⠀⠀⠰⣾⣿⢯⣿⣻⣽⡿⣷⡀⠀");
        System.out.println("⠀⣼⣿⢿⣽⡷⣟⣿⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣿⣳⡿⣯⣟⣿⣧⠀");
        System.out.println("⢰⣿⢯⣿⢷⣿⣻⠏⠀⠀⠀⠀⣠⣼⣧⣄⠀⠀⠀⠀⠙⣿⣽⡿⣽⣾⢿⡄");
        System.out.println("⢸⣯⣿⢯⣿⡾⠃⠀⠀⠀⣠⣾⣿⣻⣽⢿⣷⣄⠀⠀⠀⠘⢯⣿⣟⣾⢿⡃");
        System.out.println("⠈⣷⣿⣻⡷⠁⠀⠀⣠⣾⡿⣟⣷⡿⣯⣿⢾⣻⣷⣄⠀⠀⠈⢿⣾⣟⣿⠁");
        System.out.println("⠀⢻⣿⣽⠁⠀⢀⣴⣿⣯⢿⡿⣽⣻⣽⣾⢿⣯⣷⢿⣦⡀⠀⠈⣿⣾⡟⠀");
        System.out.println("⠀⠈⢿⡇⠀⢠⣾⣿⣻⣾⣟⣿⣻⣽⣟⣾⢿⣳⣿⣻⣟⣷⡄⠀⢸⡿⠁⠀");
        System.out.println("⠀⠀⠀⠧⢀⣿⣿⣳⣿⣳⡿⣽⣯⣷⢿⣯⣿⣻⢷⡿⣽⣯⣿⡀⠜⠁⠀");
        System.out.println("⠀⠀⠀⠀⠈⠻⣷⢿⣳⣿⣻⣯⣷⢿⣯⣷⣟⣯⣿⣟⣯⣷⠟⠁⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠙⠻⠷⣿⣳⡿⣯⣷⢿⣾⣻⠷⠛⠉⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠁⠉⠈⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        super.informations();
        System.out.println("Reviews: " + this.reviews);
    }
}
