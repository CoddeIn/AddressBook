package ooademo;

public class Logger {
    private static MessageFilter filter;
    private static MessagePrinter printer;

    public Logger(SeverityMessageFilter filter, FileMessagePrinter printer) {
        this.filter = filter;
        this.printer = printer;
    }

    public static void log(String message, int severity){
        if (filter.filter(message, severity)){
            printer.print(message);
        }
    }


}
