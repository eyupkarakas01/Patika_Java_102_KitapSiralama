public class Book {
    private String bookName;
    private String author;
    private int pages;
    private int publicationYear;
    public Book(String bookName, String author, int pages, int publicationYear) {
        this.bookName = bookName;
        this.author = author;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
}
