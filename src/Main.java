
import java.util.function.DoubleUnaryOperator;
import java.lang.CharSequence;

/**
 * Created by kshegolev on 18.11.2017.
 */
public class Main {
    public static void main(String[] args) {

    }

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        //ваш код
        return f.applyAsDouble(a);
    }

    CharSequence buff = new CharSequence() {
        @Override
        public int length() {
            return 0;
        }

        @Override
        public char charAt(int index) {
            return 0;
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return null;
        }
    };
}