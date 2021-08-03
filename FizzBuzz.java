public class FizzBuzz {
    public String fizzBuzz(int number) {
        if(number%15==0){
            return "FizzBuzz";
        } else if (number%5==0){
            return "Buzz";
        } else if (number%3==0){
            return "Fizz";
        } else {
            return "" + number;
        }
        // fizzbuzz logic here - returns "Fizz", "Buzz", "FizzBuzz"
        // or a String cast of the number itself.
        // Hint: You can use a String method to cast the int to a String.
    }
}