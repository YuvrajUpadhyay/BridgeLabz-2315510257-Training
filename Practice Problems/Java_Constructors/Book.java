public class Book {
    private static String libraryName ="Central Library";
    private String title;
    private String author;
    private final String isbn;
    public Book(String title,String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public static void displayLibraryName(){
        System.out.println("Library Name "+libraryName);
    }
    void displaybookdetails(){
        if(this instanceof Book) {
            System.out.println("Book Title " + title);
            System.out.println("Book Author " + author);
            System.out.println("ISBN " + isbn);
        }
        else{
            System.out.println("Invalid Book Object");
        }
    }

    public static void main(String[] args) {
        Book a = new Book("Tom Sawyer","Mark Twain","1");
        displayLibraryName();
        a.displaybookdetails();
    }
}
