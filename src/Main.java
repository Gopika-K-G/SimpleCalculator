public class Main {
    public static void main(String[] args) {
        // Assign values to the variables
        int num1 = 5;
        int num2 = 6;
        char operation = '*';

        // Variable to store the result
        int result;

        // Perform the operation based on the value of 'operation'
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error! Division by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation!");
                return;
        }

        // Print the result
        System.out.println("The product of "+num1+" and "+num2+" is: " + result);
    }
}
