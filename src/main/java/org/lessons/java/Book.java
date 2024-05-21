package org.lessons.java;

public class Book {

    private String title;
    private int pages;
    private String author;
    private String editor;

    public Book(String title, int pages, String author, String editor){
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
    
    @Override
    public String toString() {
        return  "Title: " + getTitle() + ", N° of Pages: " + getPages() + ", Author: " + getAuthor() + ", Editor: " + getEditor() + "\n";
    }
}
