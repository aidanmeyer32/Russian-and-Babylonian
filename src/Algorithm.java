public class Algorithm {
    public Algorithm(){}
    public int russianMultiplication(int num1, int num2){
        int result = 0;
        while (num1 > 0) {
            if (num1 % 2 == 1) {
                result += num2;
            }
            num1 /= 2;
            num2 *= 2;
        }
        return result;
    }
    public double babylonianMethod(double num, double guess){
        double tolerance = 1e-8;
        double sqrt = guess;
        double lastGuess;

        do {
            lastGuess = sqrt;
            sqrt = (lastGuess + num / lastGuess) / 2;
            System.out.println(sqrt); // Print each iteration's result
        } while (Math.abs(sqrt - lastGuess) > tolerance);

        return sqrt;
    }
}
