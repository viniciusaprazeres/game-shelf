package games.model;

public abstract class Games {

    private String name;
    private String description;
    private String developer;
    private String publisher;
    private String releaseDate;
    private float price;

    private String platform;

    public Games(String name, String description, String developer, String publisher, String releaseDate, float price, String platform) {
        this.name = name;
        this.description = description;
        this.developer = developer;
        this.publisher = publisher;
        this.releaseDate = releaseDate;
        this.price = price;
        this.platform = platform;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void informations(){

        System.out.println("************************");
        System.out.println("    GAME INFORMATION    ");
        System.out.println("************************");
        System.out.println("Name: " + this.name);
        System.out.println("Description: " + this.description);
        System.out.println("Developer: " + this.developer);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("Release Date: " + this.releaseDate);
        System.out.println("Price: " + this.price);
        System.out.println("Platform: " + this.platform);

    }
}
