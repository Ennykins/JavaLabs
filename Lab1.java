public class Lab1
{
    public static void main(String[] args) {
        System.out.println("\nOdd(10) is "+odd(10)+"\n\nTracing the function:\n");  //  \n is for printing a new line
        odd_traced(10); //Only given in the solution to help you with tracing the execution of code. Not to be done in the lab class


        System.out.println("\nAn approximation of pi after 1000 iterations gives "+leibniz(1000)+"\n");
        collaz(10);
        collaz_recursive(10);
    }
    static boolean odd(int n)
    {
//function to be completed


        if(n<=0){
            return false;
        }else{
            return !odd(n-1);
        }
    }
    static boolean odd_traced(int n) //Only given to help you with tracing the execution
    {
//function will be given to you later on in the solution
        return false;
    }

    static float leibniz(int n)
    {


//function to be completed


        float pi = 0;
        float denominator = 1;

        for (int x = 0; x < n; x++) {

            if (x % 2 == 0) {
                pi = pi + (1 / denominator);

            } else {
                pi = pi - (1 / denominator);

            }
            denominator = denominator + 2;
        }
        pi = pi * 4;


        return pi;  //statement so that code can compile
    }
    static void collaz(int n)
    {


//function to be completed


        while (n != 1)
        {
            System.out.print(n + " ");

            // If n is odd
            if ((n % 1) == 1) {
                n = 3 * n + 1;

                // If even
            }
            else{
                n = n / 2;
            }
            System.out.print(n);
            // Print 1 at the end
        }

    }

    static int collaz_recursive(int n)
    {


        //function to be completed


        System.out.print("\n" + n);

        if (n == 1){
            // n = 0;
            return 0;
        }
        else if (n % 2 == 0){
            return 1 + collaz_recursive(n/2);
        }
        else{
            return collaz_recursive(3*n + 1);
        }

        // System.out.print(n);
    }
}

// Data structure for a list of employees coded here:
