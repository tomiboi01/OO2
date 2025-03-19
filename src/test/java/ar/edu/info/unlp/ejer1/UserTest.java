package ar.edu.info.unlp.ejer1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
    Tweet tweet;
    User user;
    Retweet retweet;

    @BeforeEach
    void setUp() throws Exception {
        user = new User("user");
        tweet = new Tweet("tweet", user);
        retweet = new Retweet(user, tweet);
        user.agregarTweet(tweet);
        user.retweet(tweet);
    }

    @Test
    public void deleteRetweetsFrom() {
        assertEquals(1, user.getRetweets().size());
        user.deleteRetweetsFrom(tweet);
        assertEquals(0, user.getRetweets().size());


   
    }




    
}
