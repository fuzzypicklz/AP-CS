package UsefulPractice.Inheritance.Book4;

public class Dictionary4 extends Book4 {
    private int definitions;

    public Dictionary4(int numPages, int pictures, int numDefinitions) {
        super(numPages, pictures);
        definitions = numDefinitions;
    }

    public void definitionMessage() {
        System.out.println("Number of definitions: " + definitions);
        System.out.println("Photos per book: " + photos);
        System.out.println("Definitions per page: " + definitions / pages);
    }
}