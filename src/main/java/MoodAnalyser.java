public class MoodAnalyser
{
    private String message;

    //DEFAULT CONSTRUCTOR
    public MoodAnalyser()
    {

    }

    //PARAMETERISED CONSTRUCTOR
    public MoodAnalyser(String message)
    {
        this.message=message;
    }

    public static void main(String[] args)
    {
        System.out.println("******************** WELCOME TO MOOD ANALYSER ********************");
    }

    //METHOD TO ANALYZE MOOD
    public String analyseMood()
    {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
