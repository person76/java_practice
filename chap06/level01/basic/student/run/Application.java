package com.ohgiraffers.level01.basic.student.run;
import com.ohgiraffers.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO [] student =new StudentDTO[10];
        for(int i=0; i<10; i++){
            student[i] = new StudentDTO();
        }
        Scanner scanner = new Scanner(System.in);
        int cnt=0;
        while(true){
            System.out.print("학년 : ");
            student[cnt].setGrade(scanner.nextInt());
            System.out.print("반 : ");
            student[cnt].setClassroom(scanner.nextInt());
            System.out.print("이름 : ");
            student[cnt].setName(scanner.next());
            System.out.print("국어점수 : ");
            student[cnt].setKor(scanner.nextInt());
            System.out.print("영어점수 : ");
            student[cnt].setEng(scanner.nextInt());
            System.out.print("수학점수 : ");
            student[cnt].setMath(scanner.nextInt());

            System.out.println("계속 추가할 겁니까?(y/n): ");
            char ch = scanner.next().charAt(0);
            cnt++;
            if(ch=='n') break;
        }

        for(int i=0; i<cnt; i++){
            System.out.println(student[i].getInformation());
        }
    }

}
