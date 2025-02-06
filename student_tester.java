package School;

public class student_tester {
    public static void main(String[] args) {
        student acct = new student("Sam");
        System.out.println(acct);
        acct.name_change("Gerald");
        System.out.println(acct);
        student acct2 = new student("Frank");
        System.out.println(acct.precedesByID(acct2));
    }
}
