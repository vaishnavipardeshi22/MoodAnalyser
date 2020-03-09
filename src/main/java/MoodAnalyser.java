public class MoodAnalyser
{
    public static void main(String[] args)
    {
        System.out.println("******************** WELCOME TO MOOD ANALYSER ********************");
    }

    //METHOD TO ANALYZE MOOD
    public String analyseMood(String message)
    {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
