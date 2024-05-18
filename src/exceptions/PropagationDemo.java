package exceptions;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class PropagationDemo {

    private static final Logger logger = Logger.getLogger(PropagationDemo.class.getName());

    public void doMoreStuff() throws ArithmeticException {
        logger.info("doMoreStuff() method");
        int a = 10;
        int b = 0;
        try {
            logger.info("Calculating a/b");
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            logger.log(Level.ERROR, "Arithmetic Exception occurred", ae);
            throw ae; // Propagate the exception
        }
    }

    public void doStuff() {
        try {
            doMoreStuff();
        } catch (ArithmeticException ae) {
            logger.log(Level.ERROR, "Caught Arithmetic Exception in doStuff() method", ae);
        }
        logger.info("doStuff() method");
    }

    public static void main(String[] args) {
        PropagationDemo pdemo = new PropagationDemo();
        pdemo.doStuff();
        logger.info("Main method");
    }
}
