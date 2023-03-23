package service;

import model.Quadrado;
import model.Triangulo;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraServiceTest {
    CalculadoraService calculadoraService;

    @Before
    public void instanciaCalculadoraService() {
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void deveRetornarOValorCorretoAoSomarDoisNumeros() {
        //Given
        int numero1 = 2;
        int numero2 = 2;

        //When
        int resultado = calculadoraService.somar(numero1, numero2);

        //Then
        Assert.assertEquals(4, resultado);
    }

    @Test
    public void deveRetornarOValorCorretoAoSubtrairDoisNumeros() {
        //Given
        int numero1 = 2;
        int numero2 = 2;

        //When
        int resultado = calculadoraService.subtrair(numero1, numero2);

        //Then
        Assert.assertTrue(resultado == 0);
    }

    @Test
    public void deveRetornarOValorCorretoAoMultiplicarDoisNumeros() {
        //Given
        int numero1 = 2;
        int numero2 = 2;

        //When
        int resultado = calculadoraService.multiplicar(numero1, numero2);

        //Then
        Assert.assertSame(4, resultado);
    }

    @Test
    public void deveRetornarOValorCorretoAoDividirDoisNumeros() {
        //Given
        int numero1 = 2;
        int numero2 = 2;

        //When
        int resultado = calculadoraService.dividir(numero1, numero2);

        //Then
        Assert.assertEquals(1, resultado);
    }

    @Test
    public void trianguloDeMenorAreadeveRetornarNullQuandoDoisTriangulosComAMesmaArea() {
        //Given
        Triangulo triangulo1 = new Triangulo(10, 10);
        Triangulo triangulo2 = new Triangulo(10, 10);

        //When - Then
        Assert.assertNull(calculadoraService.trianguloDeMenorArea(triangulo1, triangulo2));
   }

    @Test
    public void trianguloDeMenorAreadeveRetornarCorretamente() {
        //Given
        Triangulo triangulo1 = new Triangulo(10, 15);
        Triangulo triangulo2 = new Triangulo(10, 10);

        //When
        Triangulo trianguloMenorArea = calculadoraService.trianguloDeMenorArea(triangulo1, triangulo2);

        //Then
        Assert.assertSame(triangulo2, trianguloMenorArea);
    }

    @Test
    public void quadradoDeMenorAreadeveRetornarNullQuandoDoisQuadradosIguais() {
        //Given
        Quadrado quadrado1 = new Quadrado(10);
        Quadrado quadrado2 = new Quadrado(10);

        //When - Then
        Assert.assertNull(calculadoraService.quadradoDeMenorArea(quadrado1, quadrado2));

    }

    @Test
    public void quadradoDeMenorAreaNaodeveRetornarNullParaQuadradosDiferentes() {
        //Given
        Quadrado quadrado1 = new Quadrado(15);
        Quadrado quadrado2 = new Quadrado(20);

        //When

        //Then
        Assert.assertNotNull(calculadoraService.quadradoDeMenorArea(quadrado1, quadrado2));
    }

    @Test
    public void quadradoDeMenorAreaDeveRetornarCorretamente() {
        //Given
        Quadrado quadrado1 = new Quadrado(20);
        Quadrado quadrado2 = new Quadrado(2);

        //When
        Quadrado quadradoMenorArea = calculadoraService.quadradoDeMenorArea(quadrado1, quadrado2);

        //Then
        Assert.assertSame(quadrado2, quadradoMenorArea);
    }

    @Test
    public void calculoAreaDeveRetornarCorretamenteQuandoInformadoTriangulo() {
        //Given
        Triangulo triangulo = new Triangulo(20, 10);
        double areaEsperada = 100;

        //When
        //Then
        Assert.assertEquals(areaEsperada, calculadoraService.calcularArea(triangulo), 0);
    }

    @Test
    public void calculoAreaDeveRetornarCorretamenteQuandoInformadoQuadradp() {
        //Given
        Quadrado quadrado = new Quadrado(20);

        //When
        double area = calculadoraService.calcularArea(quadrado);
        double areaEsperada = 400;

        //Then
        Assert.assertTrue(areaEsperada==area);
    }

}