# Prime-Number-Checker

This purpose of this program is to check if a number is prime or not.

Numbers that are equal to 1 or less than 1 will never be prime numbers, so if the user inputs such a number, they will be force to input a number greater than 1.
Ex: 2, 3, 5, etc

Set a reference number "i" to the value 2

If the reference number is the same as the number the user inputs, their input will be a prime number. (We know that 2 is prime,
so if i == n and i = 2, that means n = 2, which is prime.

If we do the following: "n % i", or "n MOD i" and we get a 0, the input is a composite number.

If both of the above cases are false, we need to increment the reference number by 1.

This process needs to continue until the reference number equals the input number.





