import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    @Test
    public void givenMessage_whenMatchSad_theReturnMood()
    {
        MoodAnalyser moodAnalyzer=new MoodAnalyser("I am in Sad Mood");
        String analyzeMood=moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD",analyzeMood);
    }

    @Test
    public void givenMessage_whenMatchHappy_thenReturnMood()
    {
        MoodAnalyser moodAnalyzer=new MoodAnalyser("I am in Happy Mood");
        String analyzeMood=moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",analyzeMood);
    }
}
