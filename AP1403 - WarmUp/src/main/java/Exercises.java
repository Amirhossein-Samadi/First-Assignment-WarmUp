public class Exercises {

    /*
        complete this function to check if the input number is prime or not
     */
    public boolean isPrime(long n) {
        // todo
        if (n <= 1)
        {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    /*
        implement an algorithm to find out the index of input number in a fibonacci sequence starting from 0, 1
        e.g. 0, 1, 1, 2, 3, 5, ...
        indices start from 0, e.g. 3 is the index 4 of this sequence
        if the input is not a fibonacci number with description above, return -1
     */
    public long fibonacciIndex(long n) {
        // todo
        if (n < 0)
        {
            return -1;
        }

        if (n == 0)
        {
            return 0;
        }

        int previous_number = 0;
        int current_number = 1;
        int index_counter = 1;

        while (current_number < n)
        {
            int temp = current_number;
            current_number = current_number + previous_number;
            previous_number = temp;
            index_counter++;
        }

        if (current_number == n)
        {
            return index_counter;
        }
        else
        {
            return -1;
        }
    }

    /*
        you should create a triangle with "*" and return a two-dimensional array of characters based on that
        the triangle's area is empty, which means some characters should be " "

        example 1, input = 3:
        *
        **
        ***

        example 2, input = 5:
        *
        **
        * *
        *  *
        *****

        the output has to be a two-dimensional array of characters, so don't just print the triangle!
     */
    public char[][] generateTriangle(int n) {
        // todo
        char[][] triangle_array = new char [n][];

        for (int i = 0; i < n; i++)
        {
            triangle_array[i] = new char[i + 1];
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < (i + 1); j++)
            {
                if (j == 0 || j == (i + 1))
                {
                    triangle_array[i][j] = '*';
                }
                else
                {
                    triangle_array[i][j] = ' ';
                }
            }
        }

        return triangle_array;
    }

    public static void main(String[] args) {
        // you can test your code here, but then it should be checked with test cases
        System.out.println("Hello World");
    }
}