/*
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
1부터 n까지 합을 출력한다.
*/

import java.util.Scanner;

class baekjoon_8393 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int sum =0;
        if(n < 1 || n > 10000){
            return;
        }

        for(int i = 1 ; i <= n ; ++i) {
            sum = sum + i;           
        }
        System.out.println(sum);
    }
}