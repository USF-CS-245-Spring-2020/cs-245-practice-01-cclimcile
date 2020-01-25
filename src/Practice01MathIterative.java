public class Practice01MathIterative implements Practice01Math {

    public int fib (int n) throws Exception{

        int fib_num = 1;
        int num1, num2 = 0;

        if(n < 0){
            throw new Exception();
        }

        if(n == 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        for(int i = 1; i < n; i++){
            num1 = num2;
            num2 = fib_num;
            fib_num = num1 + num2;
        }

        return fib_num;
    }

    public int fact (int n) throws Exception{

        int fact_sum = 1;

        if(n < 0){
            throw new Exception();
        }

        if(n == 1){
            return 1;
        }

        for(int i = n; i > 1; i--){
            fact_sum *= i;
        }

        return fact_sum;
    }
}
