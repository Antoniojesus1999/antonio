package cadenas;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith (value = Parameterized.class)

public class Parametrizado {

String texto1;
String texto2;
String expResult;

public Parametrizado(String texto1, String texto2, String expResult) {
this.texto1 = texto1;
this.texto2 = texto2;
this.expResult = expResult;
}

@Parameters
public static Collection<Object[]> data() {
Object[][] data = new Object[][] { {"fi","lete","filete"}, {"ho","la","hola"}, {"p","p","pp" }} ;
return Arrays.asList(data);
} 

@Test
    public void testConcatenaCadena() {
        System.out.println("concatenaCadena");
        String result = Cadenas2.concatenaCadena(texto1, texto2);
        assertEquals(expResult, result);

    }

}