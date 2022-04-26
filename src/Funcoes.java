public class Funcoes {

    //um Programa que mostre a mensagem “Olá mundo" na tela;
    public static String HelloWorld(){
        return "Olá, Mundo!";
    }

    //um Programa que peça um número e então mostre a mensagem 'O número informado foi [número].';
    public static String RetornaNumero(int numero){
        return "O número informado foi "+numero+".";
    }

    //um Programa que peça as 4 notas bimestrais e mostre a média.
    public static int CalculaMedia(int n1, int n2, int n3, int n4){
        int soma = n1+n2+n3+n4;
        return soma/4;
    }

    //um Programa que peça dois números e imprima a soma;
    public static int SomaNumeros(int n1, int n2){
        return n1+n2;
    }

    //um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário;
    public static Double CalculaArea(Double lado){
        return lado*lado;
    }

    //um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário;
    public static Double RetornaDobroArea(Double quadrado){
        return quadrado*2;
    }

    //um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
    public static Double CelsiusFahrenheit(Double celsius){
        return celsius*1.8+32;

    }

    //um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre em graus Celsius.
    public static Double FahrenheitCelsius(Double fahrenheit){
        return 5*((fahrenheit-32)/9);
    }

    //um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
    public static Double ValorHora(Double valor_hora, int horas_trabalhadas){
        return valor_hora*horas_trabalhadas;
    }
}
