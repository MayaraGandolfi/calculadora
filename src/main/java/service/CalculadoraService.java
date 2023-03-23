package service;

import model.Quadrado;
import model.Triangulo;

public class CalculadoraService {

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double calcularArea(Triangulo triangulo) {
        return (triangulo.getBase() * triangulo.getAltura()) / 2.0;
    }

    public double calcularArea(Quadrado quadrado) {
        return quadrado.getLado() * quadrado.getLado();
    }

    public Triangulo trianguloDeMenorArea(Triangulo triangulo1, Triangulo triangulo2) {
        double areaTriangulo1 = calcularArea(triangulo1);
        double areaTriangulo2 = calcularArea(triangulo2);
        if (areaTriangulo1 < areaTriangulo2) {
            return triangulo1;
        } else if (areaTriangulo1 > areaTriangulo2) {
            return triangulo2;
        } else {
            return null;
        }
    }

    public Quadrado quadradoDeMenorArea(Quadrado quadrado1, Quadrado quadrado2) {
        double areaQuadrado1 = calcularArea(quadrado1);
        double areaQuadrado2 = calcularArea(quadrado2);
        if (areaQuadrado1 < areaQuadrado2) {
            return quadrado1;
        } else if (areaQuadrado1 > areaQuadrado2) {
            return quadrado2;
        } else {
            return null;
        }
    }
}
