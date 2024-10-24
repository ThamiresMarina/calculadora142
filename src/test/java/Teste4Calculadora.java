// pacote
 
//biblioteca


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import com.iterasys.Main;
//classe
public class Teste4Calculadora{
    //atributos

    private float  num1;
    private float  num2;

//funções e métodos
@Test
public void testeSomar(){
// AAA - Arrange / Act / Assert
//CEV - Configura /executa / valida

// configura
// dados de entrada
float num1 = 10;
float num2 = 8;
//dados de saída / resultado esperado
float resultadoEsperado = 18;

//executa
 float resultadoatual = Main.somar(num1, num2);

 //valida
 assertEquals(resultadoEsperado, resultadoatual);


    
    }
    @Test
    public void testeSubtrair(){
        float num1 = 25;
        float num2 = 14;
        float resultadoEsperado = 11;
//executa
float resultAdoatual = Main.subtrair(num1, num2);

// valida
assertEquals(resultadoEsperado, resultAdoatual);


    }

    
    @Test
        public void testeMultiplicar(){
            float num1 = 8;
            float num2 = 7;
            float resultadoEsperado = 56;

            float resultAdoatual = Main.multiplicar(num1, num2);
            
            assertEquals(resultadoEsperado, resultAdoatual);

        }

    @Test    

        public void testeDividir(){
        int num1 = 27;
        int num2 = 3;
        String resultadoEsperado = "9";

        String resultAdoatual = Main.dividirTry(num1, num2);

        assertEquals (resultadoEsperado, resultAdoatual);


  }
  
  @Test

  public void testeDividirPorZero(){

    int num1 = 7;
    int num2 = 0;
    String resultadoEsperado = "Não é possível dividir por zero";

    String resultadoAtual = Main.dividirTry(  num1, num2);

    assertEquals(resultadoEsperado, resultadoAtual);
  }

  //DDT : Data Driving testing --> Teste direcionado a dados 
  //Popular: Teste com massa ( teste que lê um conjunto de informações)

  @ParameterizedTest
  @CsvSource(value = {

    "15, 25, 40.0",
    "0, 12, 12.0",
    "-5, 9, 4.0",
    "-7, -8, -15",
    "0.5, 3.7, 4.2"

  }, delimiter = ',')

  public void testeSomarDDT(float num1, float num2, float resultadoEsperado){
    // AAA - Arrange / Act / Assert
    //CEV - Configura /executa / valida
    
    // configura
    // Os dados de entrada e o resultado esperado são lidos da massa de teste acima
  
    
    //executa
     float resultadoatual = Main.somar(num1, num2);
    
     //valida
     assertEquals(resultadoEsperado, resultadoatual);

  }

  @ParameterizedTest
  @CsvFileSource(resources = "csv/somar.csv", numLinesToSkip = 1, delimiter = ',')

  public void testeSomarCSV(float num1, float num2, float resultadoEsperado){
    // AAA - Arrange / Act / Assert
    //CEV - Configura /executa / valida
    
    // configura
    // Os dados de entrada e o resultado esperado são lidos da massa de teste acima
  
    
    //executa
     float resultadoatual = Main.somar(num1, num2);
    
     //valida
     assertEquals(resultadoEsperado, resultadoatual);

  }

}
