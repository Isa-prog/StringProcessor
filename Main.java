public class Main {

    /**
     * Main method for testing purposes.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Test cases for isStrongPassword method
        System.out.println("Test Cases for isStrongPassword:");
        System.out.println("Case 1: " + new StringProcessor().isStrongPassword("StrongP@ssword1"));  // Should return true
        System.out.println("Case 2: " + new StringProcessor().isStrongPassword("Weakpassword"));      // Should return false
        System.out.println("Case 3: " + new StringProcessor().isStrongPassword("OnlyLowerCase"));    // Should return false
        System.out.println("Case 4: " + new StringProcessor().isStrongPassword("OnlyUPPERCASE"));    // Should return false
        System.out.println("Case 5: " + new StringProcessor().isStrongPassword("12345678"));         // Should return false

        // Test cases for calculateDigits method
        System.out.println("\nTest Cases for calculateDigits:");
        System.out.println("Case 1: " + new StringProcessor().calculateDigits("123abc456"));  // Should return 6
        System.out.println("Case 2: " + new StringProcessor().calculateDigits("NoDigitsHere"));  // Should return 0
        System.out.println("Case 3: " + new StringProcessor().calculateDigits("12345"));       // Should return 5
        System.out.println("Case 4: " + new StringProcessor().calculateDigits("abc"));         // Should return 0
        System.out.println("Case 5: " + new StringProcessor().calculateDigits("1a2b3c"));      // Should return 3

        // Test cases for calculateWords method
        System.out.println("\nTest Cases for calculateWords:");
        System.out.println("Case 1: " + new StringProcessor().calculateWords("This is a test."));  // Should return 4
        System.out.println("Case 2: " + new StringProcessor().calculateWords(""));                 // Should return 0
        System.out.println("Case 3: " + new StringProcessor().calculateWords("SingleWord"));       // Should return 1
        System.out.println("Case 4: " + new StringProcessor().calculateWords(" Multiple Words ")); // Should return 2
        System.out.println("Case 5: " + new StringProcessor().calculateWords("123 456"));           // Should return 2

        // Test cases for calculateExpression method
        System.out.println("\nTest Cases for calculateExpression:");
        System.out.println("Case 1: " + new StringProcessor().calculateExpression("3 + 5 * 2"));       // Should return 13.0
        System.out.println("Case 2: " + new StringProcessor().calculateExpression("(8 - 4) / 2"));     // Should return 2.0
        System.out.println("Case 3: " + new StringProcessor().calculateExpression("2.5 * (3 + 4)"));  // Should return 17.5
        System.out.println("Case 4: " + new StringProcessor().calculateExpression("10 / 2 + 3"));      // Should return 8.0
        System.out.println("Case 5: " + new StringProcessor().calculateExpression("1.5 + 2.5 * 4"));   // Should return 11.5
    }
}
