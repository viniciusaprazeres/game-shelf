package games.model;

public class XboxGames  extends Games{

    private float reviews;

    public XboxGames(String name, String description, String developer, String publisher, String releaseDate, float price, float reviews) {
        super(name, description, developer, publisher, releaseDate, price);
        this.reviews = reviews;
    }

    public float getReviews() {
        return reviews;
    }

    public void setReviews(float reviews) {
        this.reviews = reviews;
    }

    public void informations(){
        super.informations();
        System.out.println("Reviews: " + this.reviews);
    }
}
