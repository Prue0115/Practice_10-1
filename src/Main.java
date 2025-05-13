public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 1000; i++ ) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("1부터 1000까지의 짝수의 합" + sum);
    }

} //입력 N까지의 홀수의 합을 계산하는 프로그램