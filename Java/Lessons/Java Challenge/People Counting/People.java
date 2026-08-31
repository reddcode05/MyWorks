import practive2.*;

public class People {
    public static void main(String[] args) {
        PeopleReader limit = new PeopleReader();        
        String[] update = {"IN","OUT","IN","IN","OUT","IN","IN","IN","IN","OUT","IN","OUT","IN"};
        limit.InOut(update);
    }
}
