import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest
{
    @Test
    public void givenMessage_WhenMatchSad_ThenReturnSad()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Sad Mood");
        String mood= null;
        try
        {
            mood = moodAnalyser.analyseMood();
        }
        catch (MoodAnalysisException e)
        {
            e.printStackTrace();
        }
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenMatchHappy_ThenReturnHappy()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Happy Mood");
        String mood= null;
        try
        {
            mood = moodAnalyser.analyseMood();
        }
        catch (MoodAnalysisException e)
        {
            e.printStackTrace();
        }
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMessage_ThrowCustomException_ReturnMood()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        try
        {
            moodAnalyser.analyseMood(null);
        }
        catch (MoodAnalysisException e)
        {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.NULL, e.type);
        }
    }

    @Test
    public void givenEmptyMessage_ThrowCustomException_ReturnMood()
    {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        try
        {
            moodAnalyser.analyseMood("");
        }
        catch (MoodAnalysisException e)
        {
            Assert.assertEquals(MoodAnalysisException.ExceptionType.EMPTY, e.type);
        }
    }
}
