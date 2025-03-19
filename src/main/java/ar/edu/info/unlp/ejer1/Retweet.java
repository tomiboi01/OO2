package ar.edu.info.unlp.ejer1;

public class Retweet{
    private Tweet originalTweet;
    private User user;

    public Retweet(User user, Tweet originalTweet) {
        this.originalTweet = originalTweet;
        this.user = user;
    }

    public String getText()
    {
        return this.originalTweet.getText();
    }

    public Tweet getOriginal()
    {
        return this.originalTweet;
    }

    public User getUser()
    {
        return this.user;
    }


    
}
