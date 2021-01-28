
//Create a Custom Class
public class VideoGames {

    //Create 3 private instance variables
    private String genre;
    private String console;
    private String type;
    private boolean isViolent;

    //An Empty Constructor
    public VideoGames() {
    }

    //A Constructor That Uses 2/3 Variables
    public VideoGames(String genre, String type) {
        this.genre = genre;
        this.type = type;
    }

    //A Constructor That Uses All Variables
    public VideoGames(String genre, String console, String type) {
        this.genre = genre;
        this.console = console;
        this.type = type;
    }

    //Get Methods For All 3 Variables
    public String getGenre() {
        return genre;
    }

    public String getConsole() {
        return console;
    }

    public String getType() {
        return type;
    }

    //Set Methods For All 3 Variables
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public void setType(String type) {
        this.type = type;
    }

    //A Method That Returns A Boolean
    public boolean isViolent() {
        return isViolent;
    }

    //A Method That Returns A String
    public void getAll(String genre, String type, String console) {
        System.out.println("This will return " + genre + " and " + type + " and " + console + "." );
    }

}
