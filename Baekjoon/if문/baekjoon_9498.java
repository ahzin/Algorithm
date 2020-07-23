/*
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
*/
import java.util.Scanner;


class baekjoon_9498 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt(); 

        if (score > 100){
            System.out.println("점수를 다시 입력하세요!");
        }
        else if( 90 <= score ) {
            System.out.println("A");
        }
        else if ( 80 <= score){
            System.out.println("B");
        }
        else if ( 70 <= score){
            System.out.println("C");
        }
        else if ( 60 <= score){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
        return;
    }
}