package pz19;

public class MathUtil {
    public static<T extends Number> Number sum(Math<T> number) throws Exception{
        T num1 = number.getNumber1();
        T num2 = number.getNumber2();
        if(num1 instanceof  Integer){
            return num1.intValue() + num2.intValue();
        }
        else if (num1 instanceof Double){
            return num1.doubleValue() + num2.doubleValue();
        }
        else if (num1 instanceof Float){
            return num1.floatValue() + num2.floatValue();
        }
        throw new Exception("Bull");
    }
//    Math <Integer> obj = new Math<>(2,3);
//    public MathUtil(Number number1, Number number2) {
//        super(number1, number2);
//    }
//
//    public static <T extends Number> Math sum(Math number1, Math number2){
//        return intValue().number1 + number2;
//    }
}
