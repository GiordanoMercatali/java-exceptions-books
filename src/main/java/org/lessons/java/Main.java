package org.lessons.java;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private final static int ARRAY_SIZE = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book array[] = new Book[ARRAY_SIZE];

        for (int i = 0; i < array.length; i++) {
            
            

            

            

            
            
            try {
                System.out.print("Book title: ");
                String title = scanner.nextLine();
                checkValidString(title);

                System.out.print("Book number of pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
                checkNoOfPages(pages);

                System.out.print("Book author: ");
            String author = scanner.nextLine();
                checkValidString(author);

                System.out.print("Book editor: ");
            String editor = scanner.nextLine();
                checkValidString(editor);
                array[i] = new Book(title, pages, author, editor);
            } catch (InvalidNumberException | InvalidStringException e) {
                System.out.print(e.getMessage());
            }
            
        } System.out.println(Arrays.toString(array));
        
        scanner.close();
    }

    public static void checkNoOfPages(int number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Number of pages can't be 0 or below! \n");
        }
    }

    public static void checkValidString(String validString) throws InvalidStringException {
        if (validString.isEmpty()) {
            throw new InvalidStringException("Don't forget writing title, author and editor \n");
        }
    }
}