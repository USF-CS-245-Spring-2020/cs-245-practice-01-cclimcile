public class Practice01MathRecursive implements Practice01Math {

    public int fib (int n) throws Exception{

        if(n < 0){
            throw new Exception();
        }

        if(n == 0) {
            return 0;
        }

        if(n == 1){
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }

    public int fact (int n) throws Exception{

        if(n < 0){
            throw new Exception();
        }

        if(n == 1){
            return 1;
        }

        return n * fact(n-1);
    }
}
