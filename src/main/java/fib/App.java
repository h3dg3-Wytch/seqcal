package fib;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if(args.length != 3){
            System.out.println("ERROR: Please enter the correct amount of paramters!");
            return;
        }else {

            int[] convertedNumbers = new int[3];
            int counter = 0;

            for (String input : args) {

                try {
                    int integer = Integer.parseInt(input);
                    convertedNumbers[counter] = integer;
                    counter++;
                } catch (NumberFormatException e) {
                    System.err.println("ERROR: Please only enter digits!");
                }
            }
            Solution.fib(convertedNumbers[0], convertedNumbers[1], convertedNumbers[2]);
        }
    }

}
