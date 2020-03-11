public class MoodAnalysisException extends Exception
{
    enum ExceptionType
    {
        EMPTY, NULL, EMPTY_FIELD;
    }
    ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String message)
    {
        super(message);
        this.type=type;
    }
}
