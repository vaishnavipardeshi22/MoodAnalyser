import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    MoodAnalyser moodAnalyser=new MoodAnalyser();
    String message;

    @Test
    public void givenMessage_WhenMatchSad_ThenReturnSad()
    {
        message="I am in Sad mood";
        String mood=moodAnalyser.analyseMood(message);
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenUnmatchSad_ThenReturnHappy()
    {
        message="I am in Any mood";
        String mood=moodAnalyser.analyseMood(message);
        Assert.assertEquals("HAPPY", mood);
    }
}
