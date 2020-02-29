package ReviewSession;

public class CalculatorTest {
    public static void main(String[] args){
        System.out.println(ReviewSession.addition(2,5 ));
        ReviewSession.multiply(4,5);

        ReviewSession object = new ReviewSession();
        System.out.println(object.division(12, 4));

        ReviewSession object1 = new ReviewSession();
        System.out.println(object1.subtraction(12, 10));
    }
}

