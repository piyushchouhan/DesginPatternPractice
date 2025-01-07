package ResponsibilityDesignPattern;

public class Responsibility {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor( new DebugLogProcessor( new ErrorLogProcessor(null)));
        logObject.log(LogProcessor.ERROR, "Exception occurred");
        logObject.log(LogProcessor.DEBUG, "Debugging information");
        logObject.log(LogProcessor.INFO, "Information message");
    }
}
