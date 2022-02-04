Feature: FizzBuzz
  Print a sequence of N numbers,
  but for multiples of 3 print Fizz
  and for multiples of 5 print Buzz
  and for multiples of 3 and 5 print FizzBuzz

Scenario: FizzBuzz a number
  Given the user selected the number 2
  When the user clicked the FizzBuzz button
  Then the program prints 2