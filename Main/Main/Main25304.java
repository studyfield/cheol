package Main;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main25304 {
    // 문제 제목 : 영수증
    // 알고리즘 분류 : 수학, *구현, 사칙연산
   public static void main(String[] args) throws IOException {

        // 총액 x, 종류수 n, (가격 a - 개수 b) n개,,,,
        // x = (a*b)n

//        Scanner sc = new Scanner(System.in);
//
//        int x = sc.nextInt();
//        sc.nextLine();
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        int c = 0;      // 총액과 비교할, 물건들 가격 * 개수의 합
//
//        for(int i=0; i<n; i++){
//
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            sc.nextLine();
//
//            c += a * b;
//        }
//
//        if(x == c){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }
//
//        -------------------------------

        BufferedReader bfreader = new BufferedReader(new InputStreamReader(System.in));
        String str = bfreader.readLine();
        StringTokenizer strtoken = new StringTokenizer(str," ");

        int x = Integer.parseInt(strtoken.nextToken());

        int n = Integer.parseInt(strtoken.nextToken());


        int c = 0;

        for(int i=0; i<n; i++){

            int a = Integer.parseInt(strtoken.nextToken());
            int b = Integer.parseInt(strtoken.nextToken());
            bfreader.readLine();

            c += a * b;
        }

        BufferedWriter bfwriter = new BufferedWriter(new OutputStreamWriter(System.out));

        if(x == c){
            bfwriter.write("Yes");

        }else{
            bfwriter.write("No");
        }
        bfwriter.flush();

    }
}
