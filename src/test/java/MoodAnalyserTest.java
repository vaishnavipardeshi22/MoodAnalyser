import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    @Test
    public void givenMessage_WhenMatchSad_ThenReturnSad()
    {
        MoodAnalyser moodAnalyzer=new MoodAnalyser("I am in Sad Mood");
        String mood=moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenMatchHappy_ThenReturnHappy()
    {
        MoodAnalyser moodAnalyzer=new MoodAnalyser("I am in Happy Mood");
        String mood=moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMessage_WhenMatchNull_ThenReturnHappy()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser(null);
        String mood=moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY", mood);
    }
}
