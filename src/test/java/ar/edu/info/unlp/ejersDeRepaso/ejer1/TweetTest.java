package ar.edu.info.unlp.ejersDeRepaso.ejer1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class TweetTest {
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
    public void testGetText() {
        assertEquals("tweet", tweet.getText());
    }

    @Test
    public void testGetUser() {
        assertEquals(user, tweet.getUser());
    }

    @Test
    public void testGetRetweets() {
        assertEquals(2, tweet.getRetweets().size());
    }
    
    @Test
    public void deleteRetweets() {
        assertEquals(2, tweet.getRetweets().size());
        assertEquals(1, user.getRetweets().size());
        assertEquals(1, user2.getRetweets().size());
        tweet.deleteRetweets();
        assertEquals(0, tweet.getRetweets().size());
        assertEquals(0, user.getRetweets().size());
        assertEquals(0, user2.getRetweets().size());
    }



}
