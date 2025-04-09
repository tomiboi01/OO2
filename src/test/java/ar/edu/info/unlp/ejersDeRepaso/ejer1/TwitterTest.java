package ar.edu.info.unlp.ejersDeRepaso.ejer1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TwitterTest {
Tweet tweet;
    User user;
    User user2;
    Retweet rt;
    Retweet rt2;
    Twitter twitter;

    @BeforeEach
    void setUp() throws Exception {
        String a = null;
        twitter = new Twitter();
        twitter.addUser("user");
        twitter.addUser("user2");
        user = twitter.getUser("user");
        user2 = twitter.getUser("user2");
        tweet = user.tweet("a");
        rt = user.retweet(tweet);
        rt2 = user2.retweet(tweet);
        
    }

    @Test
    public void TestDeleteUser() {
        assertEquals(2, twitter.getUsers().count());
        assertEquals(1, user.getTweets().size());
        assertEquals(1, user.getRetweets().size());
        assertEquals(1, user2.getRetweets().size());
        twitter.deleteUser("user");
        assertEquals(1, twitter.getUsers().count());
        assertEquals(0, user.getTweets().size());
        assertEquals(0, user.getRetweets().size());
        assertEquals(0, user2.getRetweets().size());
    }

    @Test
    public void testAddValidUser()
    {
        assertEquals(2, twitter.getUsers().count());
        twitter.addUser("user3");
        assertEquals(3, twitter.getUsers().count());
    }

    @Test
    public void testAddInvalidUser()
    {
        assertEquals(2, twitter.getUsers().count());
        twitter.addUser("user");
        assertEquals(2, twitter.getUsers().count());
        
        String a = null;
        System.out.println(a += "2");
    }


    
}
