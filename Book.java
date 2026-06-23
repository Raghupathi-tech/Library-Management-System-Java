public class Book {

    int id;
    String name;
    boolean issued;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
        this.issued = false;
    }

    @Override
    public String toString() {
        return "Book ID: " + id +
               ", Name: " + name +
               ", Issued: " + issued;
    }
}
