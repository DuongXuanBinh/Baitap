package example3.bookisbn;

import java.util.Scanner;

public class Book {
    int[] isbn;

    public Book(){
        this.isbn = new int[5];
    }

    void getIsbn() {

        for(int i = 0;i<isbn.length;i++) {
            System.out.println(isbn[i]);
        }
        System.out.println();
    }

    void setIsbn(){
        Scanner input = new Scanner(System.in);
        for(int i = 0;i<isbn.length;i++){
            isbn[i]=input.nextInt();
        }
        System.out.println();
    }
    void sortIsbn(){
        int sync = 0;
        for(int i = 0;i<isbn.length-1;i++){
            for(int j=i+1;j<isbn.length;j++){
                if(isbn[i]>isbn[j]){
                    sync = isbn[i];
                    isbn[i] = isbn[j];
                    isbn[j]=sync;
                }
            }
        }
        getIsbn();
    }
}

