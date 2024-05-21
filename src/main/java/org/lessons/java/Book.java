package org.lessons.java;

public class Book {

    private String title;
    private int pages;
    private String author;
    private String editor;

    public Book(String title, int pages, String author, String editor) throws InvalidNumberException, InvalidStringException {
            checkValidString(title);
            checkNoOfPages(pages);
            checkValidString(editor);
            checkValidString(author);
    
            this.title = title;
            this.pages = pages;
            this.author = author;
            this.editor = editor;
    }
    
    String getTitle(){
        return title;
    }

    int getPages(){
        return pages;
    }

    String getAuthor(){
        return author;
    }

    String getEditor(){
        return editor;
    }

    public void checkNoOfPages(int number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Number of pages can't be 0 or below! \n");
        }
    }

    public void checkValidString(String validString) throws InvalidStringException {
        if (validString.isEmpty()) {
            throw new InvalidStringException("Don't forget writing title, author and editor! \n");
        }
    }
    
    @Override
    public String toString() {
        return  "Title: " + getTitle() + ", N° of Pages: " + getPages() + ", Author: " + getAuthor() + ", Editor: " + getEditor() + "\n";
    }
}
