public class Book {

    private final String isbn;
    private final String title;
    private boolean borrowed;

    private static int totalBooks = 0;
    private static int borrowedBooks = 0;

    public static final int MAX_BOOKS = 100;

    public Book(String isbn, String title){

        if (isbn == null || isbn.isBlank()){
            throw new IllegalArgumentException("Invalid isbn!");
        }

        if (title == null || title.isBlank()){
            throw new IllegalArgumentException("Invalid Title!");
        }

        if (totalBooks >= MAX_BOOKS){
            throw new IllegalArgumentException("Total of books are out of range!");
        }

        this.isbn = isbn;
        this.title = title;
        borrowed = false;
        totalBooks++;

    }

    public boolean borrow(){

        if (borrowed){
            return false;
        }
        borrowed = true;
        borrowedBooks++;
        return true;
    }

    public boolean returnBook(){

        if (!borrowed){
            return false;
        }
        borrowed = false;
        borrowedBooks --;
        return true;

    }

    public static int getTotalBooks(){
        return totalBooks;
    }

    public static int getBorrowedBooks(){
        return borrowedBooks;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getTitle(){
        return title;
    }

    public boolean isBorrowed(){
        return borrowed;
    }

    public void showInfo(){
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Title: " + getTitle());
        System.out.println("Borrowed: " + borrowed);

    }

    public static void main(String[] args){

        Book book1 = new Book("ISBN-1001", "Effective Java");

        Book book2 = new Book("ISBN-1002", "Clean Code");

        Book book3 = new Book("ISBN-1003", "Java Concurrency");

        book1.borrow();
        book2.borrow();
        book2.returnBook();

        System.out.println("========== Book 1 ==========");
        book1.showInfo();
        System.out.println();

        System.out.println("========== Book 2 ==========");
        book2.showInfo();
        System.out.println();

        System.out.println("========== Book 3 ==========");
        book3.showInfo();
        System.out.println();

        System.out.println("========== Library Statistics ==========");
        System.out.println("Total Books: " + getTotalBooks());
        System.out.println("Borrowed Books: " + getBorrowedBooks());
        System.out.println("Maximum Capacity: " + MAX_BOOKS);
        System.out.println("========================================");
    }
}
