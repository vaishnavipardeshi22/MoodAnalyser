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

   public boolean equals(Object another)
   {
       if (this.message.equals(((MoodAnalyser)another).message))
           return true;
       return false;
   }

   //MAIN METHOD
    public static void main(String[] args)
    {
        System.out.println("******************** WELCOME TO MOOD ANALYSER ********************");
    }
}
