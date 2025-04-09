package ar.edu.info.unlp.ejersDeRepaso.ejer1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
    Tweet tweet;
    User user;
    User user2;
    Retweet retweet;

    @BeforeEach
    void setUp() throws Exception {
        user = new User("user");
        tweet = user.tweet("tweet");
        retweet = new Retweet(user, tweet);
        user.retweet(tweet);
        user2 = new User("user2");
        user2.retweet(tweet);
    }

    @Test
    public void testDeleteRetweetsFrom() {
        assertEquals(1, user.getRetweets().size());
        user.deleteRetweetsFrom(tweet);
        assertEquals(0, user.getRetweets().size());
   
    }

    @Test
    public void testDeleteAllTweetsAndRetweets() {
        assertEquals(1, user.getTweets().size());
        assertEquals(1, user.getRetweets().size());
        user.deleteAllTweetsAndRetweets();
        assertEquals(0, user.getRetweets().size());
        assertEquals(0, user.getTweets().size());
    }

    @Test
    public void testDeleteTweet()
    {
        assertEquals(1, user.getRetweets().size());
        assertEquals(1, user2.getRetweets().size());
        assertEquals(1, user.getTweets().size());
        user.deleteTweet(tweet);
        assertEquals(0, user.getTweets().size());
        assertEquals(0, user.getRetweets().size());
        assertEquals(0, user2.getRetweets().size());

    }

    @Test
    public void testRetweet()
    {
        assertEquals(1, user.getRetweets().size());
        assertEquals(1, user2.getRetweets().size());
        assertEquals(2, tweet.getRetweets().size());
        user.retweet(tweet);
        assertEquals(3, tweet.getRetweets().size());
        assertEquals(2, user.getRetweets().size());
        assertEquals(1, user2.getRetweets().size());
    }




    
}
