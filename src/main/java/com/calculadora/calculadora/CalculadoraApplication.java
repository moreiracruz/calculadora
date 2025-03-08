package com.calculadora.calculadora;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraApplication  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CalculadoraApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Calculadora soma = (a, b) -> a + b;
        Calculadora subtracao = (a, b) -> a - b;

        System.out.printf("Soma: %d\n", soma.calcular(5, 3)); // Saída: 8
        System.out.printf("Subtração: %d\n", subtracao.calcular(5, 3)); // Saída: 2
    }

}
