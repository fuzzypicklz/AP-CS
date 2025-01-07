package UsefulPractice.Inheritance.Book4;

public class Book4 {
    public int pages, photos;

    public Book4(int numPages, int numphotos) {
        pages = numPages;
        photos = numphotos;
    }

    public void pageMessage() {
        System.out.println("Number of pages: " + pages);
    }

    public void photoMessage() {
        System.out.println("Number of pages: " + photos);
    }
}
