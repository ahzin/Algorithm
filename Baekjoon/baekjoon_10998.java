/*
두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
첫째 줄에 A×B를 출력한다.
*/
import java.util.Scanner;


class baekjoon_10998 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt(); 
        int B = input.nextInt(); 

        if ( 0 < A || B < 10) {
        System.out.println(A * B);
        }
        else
        return;
    }
}