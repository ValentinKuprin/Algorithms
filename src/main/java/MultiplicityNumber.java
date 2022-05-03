/**
 * Учитывая целое число M, выполните следующие условные действия:
 * Если M кратно 3 и 5, то верните "Хорошее число".
 * Если M кратно только 3, а не 5, то верните "Неверное число".
 * Если M кратно только 5, а не 3, то верните "Плохое число".
 * Если M не удовлетворяет ни одному из вышеуказанных условий, то верните "-1"
 */
public class MultiplicityNumber {

    public String getMultipleNumber(int m) {

        if (m % 3 == 0 && m % 5 != 0) {

            return "Incorrect number";
        } else if (m % 5 == 0 && m % 3 != 0) {

            return "Bad number";
        } else if (m % 3 == 0 && m % 5 == 0) {

            return "Good number";
        } else {

            return "-1";
        }
    }

 //  public static void main(String[] args) {
 //      System.out.println("Если м = " + getMultipleNumber( 0));
 //      System.out.println(getMultipleNumber(3));
 //      System.out.println(getMultipleNumber(5));
 //      System.out.println(getMultipleNumber(6));
 //      System.out.println(getMultipleNumber(9));
 //      System.out.println(getMultipleNumber(12));
 //      System.out.println(getMultipleNumber(15));
 //      System.out.println(getMultipleNumber(18));
 //      System.out.println(getMultipleNumber(21));


 //  }
}
