package com.eomcs.lms;

import java.util.Scanner;

public class App3 {
  public static void main (String[] args) {
    java.io.InputStream keyboard = System.in;
    Scanner keyScan = new Scanner(keyboard);
    
    System.out.print("번호: ");
    String no = keyScan.nextLine();
    System.out.print("내용: ");
    String contents = keyScan.nextLine();
    System.out.print("작성일: ");
    String writeDate = keyScan.nextLine();
    System.out.print("조회수: ");
    String viewNumber = keyScan.nextLine();
    
    System.out.println("번호: " + no);
    System.out.println("내용: " + contents);
    System.out.println("작성일: " + writeDate);
    System.out.println("조회수: " + viewNumber);
  }

}
