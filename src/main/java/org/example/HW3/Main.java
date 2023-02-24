package org.example.HW3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Властелин колец", "Толкиен", 1000, 2010, 1500);
        Books book2 = new Books("Преступление и наказание", "Достоевский", 800, 2009, 300);
        Books book3 = new Books("Мастер и маргарита", "Булгаков", 1300, 2011, 811);
        Books book4 = new Books("Богатый папа", "Кийосаки", 1100, 2011, 300);
        Books book5 = new Books("Сапиенс", "Харари", 1200, 2009, 617);

        List<Books> allBooks = new ArrayList<>();
        List<Books> result = new ArrayList<>();

        allBooks.add(book1);
        allBooks.add(book2);
        allBooks.add(book3);
        allBooks.add(book4);
        allBooks.add(book5);

        for (Books book : allBooks) {
            if (strAuthorWord(book.getAuthor(), "а") && releaseYear(book.getYear()) && simple(book.getPages())) {
                result.add(book);
            }
        }
        System.out.println(result);
    }
    public static boolean strAuthorWord(String strName, String findLetter) {
        strName.contains(findLetter);
        return true;
    }
    public static boolean releaseYear(Integer intYear) {
        if (intYear > 2010) return true;
        return false;
    }
    public static boolean simple(int pages) {
        if (pages < 2) {
            return false;
        }
        for (int k = 2; k <= Math.sqrt(pages); k++) {
            if (pages % k == 0) {
                return false;
            }
        }
        return true;
    }
}


