import java.util.Objects;

public class MoodAnalyser<equals, equal>
{
    private String message;

    //DEFAULT CONSTRUCTOR
    public MoodAnalyser()
    {

    }

    //PARAMETERISED CONSTRUCTOR
    public MoodAnalyser(String message)
    {
        this.message = message;
    }

    //PARAMETERISED METHOD TO ANALYSE MOOD
    public String analyseMood(String message) throws MoodAnalysisException
    {
        this.message=message;
        return analyseMood();
    }

    //METHOD TO ANALYSE MOOD
    public String analyseMood() throws MoodAnalysisException
    {
        try
        {
            if(message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.EMPTY, "Please enter valid mood.");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (NullPointerException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.NULL, "Please enter valid mood.");
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoodAnalyser that = (MoodAnalyser) o;
        return Objects.equals(message, that.message);
    }

    //MAIN METHOD
    public static void main(String[] args)
    {
        System.out.println("******************** WELCOME TO MOOD ANALYSER ********************");
    }
}
