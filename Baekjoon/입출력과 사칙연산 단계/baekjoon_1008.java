/*
두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10^-9 이하이면 정답이다.
*/
import java.util.Scanner;


class baekjoon_1008 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble(); 
        double B = input.nextDouble(); 

        if ( 0 < A || B < 10) {
        System.out.println(A / B);
        }
        else
        return;
    }
}