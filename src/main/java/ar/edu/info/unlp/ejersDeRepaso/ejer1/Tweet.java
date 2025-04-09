package ar.edu.info.unlp.ejersDeRepaso.ejer1;

import java.util.ArrayList;
import java.util.List;

public class Tweet extends Post{
    private String text;
    private List<Retweet> retweets;
    
    public Tweet(String text, User user) {
        super(user);
        this.text = text;
        this.retweets = new ArrayList<Retweet>();
    }

    private boolean isTextLengthInBetween(int x, int y) {
        return this.text.length() >= x && this.text.length() <= y;
    }

    public boolean isValid() {
        return this.isTextLengthInBetween(1, 280);
    }

    public String getText()
    {
        return this.text;
    }
    

    public User getUser()
    {
        return this.user;
    }

    public List<Retweet> getRetweets()
    {
        return this.retweets;
    }

    public void agregarRetweet(Retweet retweet)
    {
        this.retweets.add(retweet);
    }

    public void deleteRetweets()
    {
        this.retweets.stream().forEach(rt->rt.getUser().deleteRetweetsFrom(this)); //mando mensaje a usuario que elimine el retweet de su lista
        this.retweets.clear(); //borro todos los retweets de la lista del tweet original
    }

    
}
