package squash.tfauto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class CalculatorWithDisabledTest {

    @Test
    public void addSuccess(){
        int a = 5;
        int b = 12;
        Assertions.assertTrue((a+b)==17, "Le résultat du calcul est incorrect. " + a + " + " + b + " n'est pas égal à 17");
    }

    @Disabled
    @Test
    public void firstDisabledTest(){
        int a = 5;
        int b = 12;
        Assertions.assertTrue((a+b)==17, "Le résultat du calcul est incorrect. " + a + " + " + b + " n'est pas égal à 17");
    }

    @Disabled
    @Test
    public void secondDisabledTest(){
        int first = 2;
        int second = 4;
        Assertions.assertTrue((first*second)==6, "Le résultat du calcul est incorrect. " + first + " * " + second + " n'est pas égal à 6");
    }

}
