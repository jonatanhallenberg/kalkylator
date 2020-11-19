/**
 * Calculator
 */

 public class Calculator {

    public static void main(String[] args) {
        System.out.println("Vad vill du räkna ut?");
        String calculation = System.console().readLine();
        
        if (calculation.indexOf('+') > -1) {
            String[] splitCalc = calculation.split("\\+");
            int sum = Integer.parseInt(splitCalc[0]) + Integer.parseInt(splitCalc[1]);
            System.out.println("Svaret är: " + sum);
        }

        if (calculation.indexOf('-') > -1) {
            String[] splitCalc = calculation.split("\\-");
            int sum = Integer.parseInt(splitCalc[0]) - Integer.parseInt(splitCalc[1]);
            System.out.println("Svaret är: " + sum);
        }

        if (calculation.indexOf('*') > -1) {
            String[] splitCalc = calculation.split("\\*");
            int sum = Integer.parseInt(splitCalc[0]) * Integer.parseInt(splitCalc[1]);
            System.out.println("Svaret är: " + sum);
        }

        Person person = new Person();
        System.out.println(person.x);
        
    }
 }