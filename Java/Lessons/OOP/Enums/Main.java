package OOP;

enum AILevel {
    EASY, MEDIUM, HARD
}
enum PHCurrency {
    PISO(1.00f), LIMANGPISO(5.00f), SAMPONGPISO(10.00f);
    float value;
    PHCurrency(float value) {
        this.value=value;
    }
}
public class Main {

    public static void main(String[] args) {
        AILevel level = AILevel.MEDIUM;
        if (level == AILevel.EASY) {
            System.out.println("WEAK");
        } else if (level == AILevel.HARD) {
            System.out.println("ATRONGEST");
        } else if (level == AILevel.MEDIUM) {
            System.out.println("MID");
        }
        
        PHCurrency m = PHCurrency.PISO;
        System.out.println(m);
        System.out.println(m.value);
        
        PHCurrency arrM[] = new PHCurrency[5];
        arrM[0] = PHCurrency.PISO;
        arrM[1] = PHCurrency.LIMANGPISO;
        arrM[2] = PHCurrency.SAMPONGPISO;
        arrM[3] = PHCurrency.SAMPONGPISO;
        arrM[4] = PHCurrency.LIMANGPISO;
        
        float sum = 0;
        for (PHCurrency arrValue : arrM){
            sum = sum + arrValue.value;
        }
        System.out.println(sum);
    }
}
