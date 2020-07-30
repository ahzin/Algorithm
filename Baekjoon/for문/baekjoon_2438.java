/*
별 찍기 -1
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*/


import java.util.Scanner;

class baekjoon_2438{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        if (N >= 1 && N <= 100){
            for(int i = 0; i < N ; i++){
                for(int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}