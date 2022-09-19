import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerMethodReference {
    public static void main(String[] args) {
        TimerMethod c = new TimerMethod();
        // When action occurs, method produce an instance of functional interface. A
        // single abstract method of
        // the functional interface will be override to call the body of the method
        // reference or the lambda expression.
        // Note that the method signature of the method reference or the lambda
        // expression must match the method
        Timer timer = new Timer(1000, c::print);
        timer.start();
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
