import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyserFactory
{
    public static MoodAnalyser createMoodAnalyser(String message) throws MoodAnalysisException
    {
        try
        {
            Class<?> moodAnalyserClass = Class.forName("MoodAnalyser");
            Constructor<?> moodConstructor = moodAnalyserClass.getConstructor(String.class);
            return (MoodAnalyser) moodConstructor.newInstance(message);
        }
        catch (ClassNotFoundException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS, "No such class found.");
        }
        catch (NoSuchMethodException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD, "No such method found.");
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static MoodAnalyser createMoodAnalyser() throws MoodAnalysisException
    {
        try
        {
            Class<?> moodAnalyserClass = Class.forName("MoodAnalyser");
            Constructor<?> moodConstructor = moodAnalyserClass.getConstructor(Integer.class);
            return (MoodAnalyser) moodConstructor.newInstance();
        }
        catch (ClassNotFoundException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_CLASS, "No such class found.");
        }
        catch (NoSuchMethodException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD, "No such method found.");
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static Object invokedMethod(MoodAnalyser moodAnalyser, String analyseMood) throws MoodAnalysisException
    {
        try
        {
            return moodAnalyser.getClass().getMethod(analyseMood).invoke(moodAnalyser);
        }
        catch (NoSuchMethodException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_METHOD, "No such method found.");
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    public static Object setFieldValue(MoodAnalyser moodAnalyser, String message, String i_am_in_happy_mood) throws MoodAnalysisException
    {
        Field field;
        try
        {
            field=moodAnalyser.getClass().getDeclaredField(message);
            field.setAccessible(true);
            field.set(moodAnalyser,"I am in Happy Mood");
            return true;
        }
        catch (NoSuchFieldException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NO_SUCH_FIELD, "No such field found.");
        }
        catch (IllegalAccessException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ILLEGAL_ACCESS, "No access available.");
        }
    }
}
