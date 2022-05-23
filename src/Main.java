public class Main {

    public static void main(String[] args) {

        System.out.println("1 ve 100 arasındaki asal sayılar : ");
        for (int i = 2; i <= 100; i++) {
            int countOfDivisors = 2;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    countOfDivisors++;
                }
                if(countOfDivisors != 2){
                    break;
                }
            }
            if (countOfDivisors == 2) {
                System.out.print(i + " ");
            }

        }
    }
}
