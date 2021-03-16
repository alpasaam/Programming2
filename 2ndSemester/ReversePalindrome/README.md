Using the isPalindrome method from Section 13.2 and a recursive reverse method from
Exercise • E13.6, write a program to address the following mathematical hypothesis.

It is believed (but not proven) that, given any decimal number, adding the number and its reversal, will eventually reach a palindrome.
For example,
89 + 98 = 187
187 + 781 = 968
968 + 869 = 1837
. . .
1801200002107 + 7012000021081 = 8813200023188

Write a program that follows this process, starting with a random big integer

new BigInteger(16, new java.util.Random())

Implement a recursive solution by removing the first character, reversing the remaining text, and combining the two.
