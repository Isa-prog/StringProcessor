Testing Report Summary

Date: 11.26.2023

Project: StringProcessor

Test Cases for isStrongPassword:
Case 1: StrongP@ssword1

Expected Result: true
Actual Result: true
Status: Passed
Case 2: Weakpassword

Expected Result: false
Actual Result: false
Status: Passed
Case 3: OnlyLowerCase

Expected Result: false
Actual Result: false
Status: Passed
Case 4: OnlyUPPERCASE

Expected Result: false
Actual Result: false
Status: Passed
Case 5: 12345678

Expected Result: false
Actual Result: false
Status: Passed
Test Cases for calculateDigits:
Case 1: 123abc456

Expected Result: 6
Actual Result: 6
Status: Passed
Case 2: NoDigitsHere

Expected Result: 0
Actual Result: 0
Status: Passed
Case 3: 12345

Expected Result: 5
Actual Result: 5
Status: Passed
Case 4: abc

Expected Result: 0
Actual Result: 0
Status: Passed
Case 5: 1a2b3c

Expected Result: 3
Actual Result: 3
Status: Passed
Test Cases for calculateWords:
Case 1: This is a test.

Expected Result: 4
Actual Result: 4
Status: Passed
Case 2: ``

Expected Result: 0
Actual Result: 0
Status: Passed
Case 3: SingleWord

Expected Result: 1
Actual Result: 1
Status: Passed
Case 4: Multiple Words

Expected Result: 2
Actual Result: 2
Status: Passed
Case 5: 123 456

Expected Result: 2
Actual Result: 2
Status: Passed
Test Cases for calculateExpression:
Case 1: 3 + 5 * 2

Expected Result: 13.0
Actual Result: 13.0
Status: Passed
Case 2: (8 - 4) / 2

Expected Result: 2.0
Actual Result: 2.0
Status: Passed
Case 3: 2.5 * (3 + 4)

Expected Result: 17.5
Actual Result: 17.5
Status: Passed
Case 4: 10 / 2 + 3

Expected Result: 8.0
Actual Result: 8.0
Status: Passed
Case 5: 1.5 + 2.5 * 4

Expected Result: 11.5
Actual Result: 11.5
Status: Passed
Summary:
All test cases passed successfully. No issues were encountered during testing. The functionality of the StringProcessor class appears to be correct based on the defined test cases. It's recommended to perform additional testing in various scenarios to ensure the robustness of the code, especially in cases not covered by the current test suite.