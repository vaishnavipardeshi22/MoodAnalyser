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

    @Test
    public void givenMoodAnalyserClass_WhenProper_ThenReturnObject()
    {
        try
        {
            MoodAnalyser moodAnalyser=MoodAnalyserFactory.createMoodAnalyser();
            Assert.assertEquals(new MoodAnalyser(), moodAnalyser);
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }

    @Test
    public void givenMoodAnalyserClass_WhenClassNotFound_ThenThrowException()
    {
        try
        {
            MoodAnalyser moodAnalyser=MoodAnalyserFactory.createMoodAnalyser("I am in Happy Mood");
        }
        catch (MoodAnalysisException e)
        {
            Assert.assertEquals("No such class found.", e.getMessage());
        }
    }

    @Test
    public void givenMoodAnalyserClass_WhenMethodNotFound_ThenThrowException()
    {
        try
        {
            MoodAnalyser moodAnalyser=MoodAnalyserFactory.createMoodAnalyser();
        }
        catch (MoodAnalysisException e)
        {
            Assert.assertEquals("No such method found.", e.getMessage());
        }
    }
}
