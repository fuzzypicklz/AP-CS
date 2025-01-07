package UsefulPractice.Inheritance.Book4;

import UsefulPractice.Inheritance.Book23.Dictionary2;

public class Words4 {
    public static void main(String[] args) {
        Dictionary2 webster = new Dictionary2(3000, 60000);
        Dictionary4 Oxford = new Dictionary4(1000, 10000, 500);

        webster.pageMessage();
        webster.definitionMessage();

        Oxford.pageMessage();
        Oxford.definitionMessage();
    }
}
