package ar.edu.info.unlp.ejer1;

import java.util.ArrayList;
import java.util.List;

public class User {

    private List<Tweet> tweets;
    private List<Retweet> retweets;
    private String screenName;

    public User(String screenName) {
        this.screenName = screenName;
        this.tweets = new ArrayList<Tweet>();
        this.retweets = new ArrayList<Retweet>();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (screenName == null) {
            if (other.screenName != null)
                return false;
        } else if (!screenName.equals(other.screenName))
            return false;
        return true;
    }

    public boolean tweet(String text) {
        if (text == null)
            return false;

        Tweet tweet = new Tweet(text, this);
        return agregarTweet(tweet);
        
    }

    public boolean agregarTweet(Tweet tweet) {
        if (tweet == null || !tweet.isValid()) {
            return false;
        }
        return this.tweets.add(tweet);
    }
    

    

    public boolean retweet (Tweet originalTweet)
    {
        if (originalTweet == null)
            return false;
        Retweet rt = new Retweet(this, originalTweet);
        originalTweet.agregarRetweet(rt);
        return this.retweets.add(rt);
    }
    
    public void deleteAllTweetsAndRetweets() {
        this.tweets.stream().forEach(t -> t.deleteRetweets());
        this.tweets.clear();
        this.retweets.clear();
    }

    public String getScreenName() {
        return this.screenName;  }

    public void deleteRetweetsFrom(Tweet tweet) {
        this.retweets.removeIf(r -> r.getText().equals(tweet.getText()));

    }

    public List<Retweet> getRetweets() {
        return this.retweets;
    }

}
