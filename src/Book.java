public class Book extends Product{
    private String author;

    public Book(String name, double price, String description, String author) {
        super(name, price, description);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String getDescription() {
        return "This is a book by " + author;
    }
}
