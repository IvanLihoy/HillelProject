

public class HillelTask3Multiples {
    public static void main(String[] args) {
            System.out.println(returnSumOfMultiples(15));
        }

        private static long returnSumOfMultiples(long N){
            long sum = 0;
            for(int i = 3; i < N; i++){
                if (i%3 == 0 || i%5 == 0)
                    sum += i;
            }
            return sum;
        }
    }
