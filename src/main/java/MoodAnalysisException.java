public class MoodAnalysisException extends Exception
{
    enum ExceptionType
    {
        EMPTY, NULL, NO_SUCH_CLASS, NO_SUCH_METHOD, NO_SUCH_FIELD, ILLEGAL_ACCESS;
    }
    ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String message)
    {
        super(message);
        this.type=type;
    }
}
