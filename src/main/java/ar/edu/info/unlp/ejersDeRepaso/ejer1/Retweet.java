package ar.edu.info.unlp.ejersDeRepaso.ejer1;

public class Retweet extends Post{
    private Tweet originalTweet;    

    public Retweet(User user, Tweet originalTweet) {
        super(user);
        this.originalTweet = originalTweet;
    }

    public String getText()
    {
        return this.originalTweet.getText();
    }

    public Tweet getOriginal()
    {
        return this.originalTweet;
    }

    public boolean originalTweetIs(Tweet originalTweet)
    {
        return this.originalTweet.equals(originalTweet);
    }





    
}
