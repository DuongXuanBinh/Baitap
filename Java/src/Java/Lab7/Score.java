package Java.Lab7;

import java.util.Scanner;

public class Score {
    int score[][];
    int student = 0;

    public Score() {
        this.score = new int[3][3];
        this.student = 0;
    }

    void addStudent() {
        Scanner input = new Scanner(System.in);
        if (student < score.length) {
            System.out.println("Enter Student ID: ");
            score[student][0] = input.nextInt();
            System.out.println("Enter the mark of English: ");
            score[student][1] = input.nextInt();
            System.out.println("Enter the mark of Japanese: ");
            score[student][2] = input.nextInt();
            student++;
        } else {
            System.out.println("Cannot add more student");
        }
    }

    void displayStudent() {
        if (student > 0) {
            System.out.println("\nID \t\tEnglish \t\tJapanese");
            System.out.println("================================");
            for (int i = 0; i < student; i++) {
                System.out.printf("%d\t\t", score[student][0]);
                System.out.printf("%d\t\t", score[student][1]);
                System.out.printf("%d\n", score[student][2]);
            }
        } else
            System.out.println("No student to display");
    }

    void searchByID() {
        boolean studentFound = false;
        if (student > 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Student ID you want to search for: ");
            int searchID = input.nextInt();
            System.out.println("\nID \t\tEnglish \t\tJapanese");
            System.out.println("================================");
            for (int i = 0; i < score.length; i++) {
                if (score[i][0] == searchID) {
                    System.out.printf("%d\t\t", score[i][0]);
                    System.out.printf("%d\t\t", score[i][1]);
                    System.out.printf("%d\n", score[i][2]);
                    studentFound = true;
                    break;
                }
            }
            if (!studentFound) {
                System.out.println("Student not found");
            }
        } else
            System.out.println("No student to search");
    }

    void searchByEnglish() {
        boolean studentFound = false;
        if (student > 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the score of English you want to search for: ");
            int searchScore = input.nextInt();
            System.out.println("\nID \t\tEnglish \t\tJapanese");
            System.out.println("================================");
            for (int i = 0; i < student; i++) {
                if (score[i][1] == searchScore) {
                    System.out.printf("%d\t\t", score[i][0]);
                    System.out.printf("%d\t\t", score[i][1]);
                    System.out.printf("%d\n", score[i][2]);
                    studentFound = true;
                }
            }
            if (!studentFound) {
                System.out.println("Student not found");
            }
        } else
            System.out.println("No student to search");
    }
}

