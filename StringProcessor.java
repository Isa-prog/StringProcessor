import java.util.Stack;

public class StringProcessor {

    /**
     * Checks if a password is strong, containing at least one uppercase letter,
     * one lowercase letter, one digit, and one special symbol.
     *
     * @param password The password to be checked.
     * @return true if the password is strong, false otherwise.
     */
    public boolean isStrongPassword(String password) {
        boolean hasUppercase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialSymbol = false;

        for (int i = 0; i < password.length(); i++) {
            char temp = password.charAt(i);

            if (Character.isLowerCase(temp)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(temp)) {
                hasUppercase = true;
            } else if (Character.isDigit(temp)) {
                hasDigit = true;
            } else {
                hasSpecialSymbol = true;
            }
        }

        return hasUppercase && hasLowerCase && hasDigit && hasSpecialSymbol;
    }

    /**
     * Counts the number of digits in a given sentence.
     *
     * @param sentence The sentence to count digits from.
     * @return The number of digits in the sentence.
     */
    public int calculateDigits(String sentence) {
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char temp = sentence.charAt(i);

            if (Character.isDigit(temp)) {
                count++;
            }
        }

        return count;
    }

    /**
     * Counts the number of words in a given sentence.
     *
     * @param sentence The sentence to count words from.
     * @return The number of words in the sentence.
     */
    public int calculateWords(String sentence) {
    // Remove leading and trailing whitespaces, then split by any sequence of whitespace characters
        String[] words = sentence.trim().split("\\s+");

        // Count the non-empty words
        int count = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        return count;
    }

    /**
     * Evaluates a mathematical expression and returns the result.
     *
     * @param expression The mathematical expression to be evaluated.
     * @return The result of the expression.
     * @throws IllegalArgumentException If the expression contains invalid characters.
     */
    public static double calculateExpression(String expression) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (Character.isDigit(c)) {
                // If the character is a digit, extract the whole number
                StringBuilder numStr = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    numStr.append(expression.charAt(i));
                    i++;
                }
                i--; // Move back one position to correct for the extra increment in the loop
                numbers.push(Double.parseDouble(numStr.toString()));
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                // Evaluate expressions within parentheses
                while (!operators.isEmpty() && operators.peek() != '(') {
                    evaluateTop(numbers, operators);
                }
                operators.pop(); // Remove '(' from the stack
            } else if (isOperator(c)) {
                // Process operators based on precedence
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) {
                    evaluateTop(numbers, operators);
                }
                operators.push(c);
            }
        }

        // Evaluate remaining operators in the stacks
        while (!operators.isEmpty()) {
            evaluateTop(numbers, operators);
        }

        // The result should be the only number left in the 'numbers' stack
        return numbers.pop();
    }

    private static void evaluateTop(Stack<Double> numbers, Stack<Character> operators) {
        char operator = operators.pop();
        double operand2 = numbers.pop();
        double operand1 = numbers.pop();
        double result = applyOperator(operand1, operand2, operator);
        numbers.push(result);
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    private static double applyOperator(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
