import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the calculator");

        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String[] line = in.nextLine().split(" ");

            String command = line[0];
            Calculator calc = new Calculator();

            Set<String> binaryOps = new HashSet<>(Arrays.asList("add", "subtract", "multiply", "divide"));
            Integer arg1 = Integer.parseInt(line[1]);
            Integer arg2 = binaryOps.contains(command) ? Integer.parseInt(line[2]) : 0;

            Integer res = null;
            if (command.equals("add")) {
                res = calc.add(arg1, arg2);
            } else if (command.equals("subtract")) {
                res = calc.subtract(arg1, arg2);
            } else if (command.equals("multiply")) {
                res = calc.multiply(arg1, arg2);
            } else if (command.equals("divide")) {
                res = calc.divide(arg1, arg2);
            } else if (command.equals("fibonacci")) {
                res = calc.fibonacciNumberFinder(arg1);
            } else if (command.equals("binary")) {
                System.out.println(calc.intToBinaryNumber(arg1));
            }
            if (res != null) {
                System.out.println(res);
            }
        }

    }
}
