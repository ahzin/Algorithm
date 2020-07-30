/*
별 찍기 -2
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*/


import java.util.Scanner;

class baekjoon_2439{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        input.close();

        if (N >= 1 && N <= 100){
            for(int i = 0; i < N ; i++){
                for(int j = i+1 ; j <= N; j++) {
                    System.out.print(" ");
                }
                for(int k = N-i; k <= N; k++){
                    System.out.printf("*");
                }
                System.out.println();
            }
            
        }
    }
}