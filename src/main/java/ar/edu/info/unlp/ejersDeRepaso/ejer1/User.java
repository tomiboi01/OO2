package ar.edu.info.unlp.ejersDeRepaso.ejer1;

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
        } 
        else if (!screenName.equals(other.screenName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((screenName == null) ? 0 : screenName.hashCode());
        return result;
    }

    public Tweet tweet(String text) {
        if (text == null)
            return null;
        Tweet tweet = new Tweet(text, this);
        agregarTweet(tweet);
        return tweet;
        
    }

    private boolean agregarTweet(Tweet tweet) {
        if (tweet == null || !tweet.isValid()) {
            return false;
        }
        return this.tweets.add(tweet);
    }
    

    

    public Retweet retweet (Tweet originalTweet)
    {
        if (originalTweet == null)
            return null;
        Retweet rt = new Retweet(this, originalTweet);
        originalTweet.agregarRetweet(rt);
        this.retweets.add(rt);
        return rt;
    }
    
    public void deleteAllTweetsAndRetweets() {
        this.tweets.stream().forEach(t -> t.deleteRetweets());
        this.tweets.clear();
    }

    public String getScreenName() {
        return this.screenName;  }

    public void deleteRetweetsFrom(Tweet tweet) {
        this.retweets.removeIf(r -> r.originalTweetIs(tweet));

    }

    public List<Retweet> getRetweets() {
        return this.retweets;
    }

    public boolean deleteTweet(Tweet tweet) {
        if (tweet == null)
            return false;
        if (!this.tweets.contains(tweet))
            return false;
        tweet.deleteRetweets();
        return this.tweets.remove(tweet);
    }

    public List<Tweet> getTweets() {
        return this.tweets;
    }

}
