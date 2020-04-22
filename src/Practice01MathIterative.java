public class Practice01MathIterative implements Practice01Math {

    public int fib (int n) throws Exception{
        // fib_num is the num at index n
        int fib_num = 0;
        // prev_num starts at 1 with the assumption that n > 1
        int prev_num = 1;
        // prevprev_num starts at 0 with the assumption that n > 1
        int prevprev_num = 0;

        // StackOverflowError if n < 0
        if(n < 0){
            throw new Exception();
        }
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        for(int i = 2; i <= n; i++){
            // fib_num stores current num for index n
            fib_num = prev_num + prevprev_num;
            // prevprev_num is shifted to the next num
            prevprev_num = prev_num;
            // prev_num is shifted to the next num
            prev_num = fib_num;
        }

        return fib_num;
    }

    public int fact (int n) throws Exception{
        // fact_sum is 1 with the assumption that n > 0
        int fact_sum = 1;

        // StackOverflowError if n < 0
        if(n < 0){
            throw new Exception();
        }

        for(int i = n; i >= 1; i--){
            fact_sum *= i;
        }

        return fact_sum;
    }
}
