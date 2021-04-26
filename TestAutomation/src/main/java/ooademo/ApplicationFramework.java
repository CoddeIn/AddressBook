package ooademo;

public class ApplicationFramework {
    public static void main (String[] args){
        final Logger logger = new Logger(
                new SeverityMessageFilter(2),
                new FileMessagePrinter("out.log")
        );
        logger.log("Str",0);
        logger.log("Str",1);
        logger.log("Str",2);
    }

}
