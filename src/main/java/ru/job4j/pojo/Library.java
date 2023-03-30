package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 100);
        Book java2 = new Book("Java2", 200);
        Book java3 = new Book("Java3", 200);
        Book java4 = new Book("Java4", 200);
        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = java2;
        books[2] = java3;
        books[3] = java4;
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            System.out.println(bo.getName() + ", " + bo.getPages());
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            System.out.println(bo.getName() + ", " + bo.getPages());
        }
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book bo = books[index];
            if (bo.getName() == "Clean code") {
                System.out.println(bo.getName() + ", " + bo.getPages());
            }
        }
    }
}
