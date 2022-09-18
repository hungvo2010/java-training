import java.util.Date;

import p2.Football;

public class BreakEncapsulation {
    public static void main(String[] args) {
        Football barca = new Football();   
        // System.out.println("Before: " + barca.getStartDate().getSeconds());
        // Return a mutable field: Date
        final Date startDate = barca.getStartDate();
        startDate.setSeconds(100);
        // Change object field without setter method will break encapsulation
        // So return a copy of the field instead of the field itself
        System.out.println("After: " + barca.getStartDate().getSeconds());
    }    
}