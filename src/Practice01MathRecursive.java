public class Practice01MathRecursive implements Practice01Math {

    public int fib (int n) throws Exception{
        // StackOverflowError if n < 0
        if(n < 0){
            throw new Exception();
        }

        // Base case 1
        if(n == 0) {
            return 0;
        }
        // Base case 2
        if(n == 1){
            return 1;
        }
        // Recursive case
        return fib(n-1) + fib(n-2);
    }

    public int fact (int n) throws Exception{
        // StackOverflowError if n < 0
        if(n < 0){
            throw new Exception();
        }
        
        // Base case
        if(n == 1){
            return 1;
        }
        // Recursive case
        return n * fact(n-1);
    }
}
