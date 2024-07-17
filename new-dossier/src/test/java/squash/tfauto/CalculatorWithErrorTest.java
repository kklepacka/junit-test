package squash.tfauto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithErrorTest {
    @Test
    public void addSuccess(){
        int a = 5;
        int b = 12;
        Assertions.assertTrue((a+b)==17, "Le résultat du calcul est incorrect. " + a + " + " + b + " n'est pas égal à 17");
    }

    @Test
    public void errorTest() throws Exception {
        throw new Exception("this is a self-generated error");
    }

}
