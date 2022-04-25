import java.util.Scanner;

public class Main {

    public static int SelecaoTexto(){
        int selecao = 0;
        while(true){
            try{
                System.out.println("1\t\t=>\t\tMensagem 'Olá Mundo!'\n" +
                    "2\t\t=>\t\tRetorna número digitado pelo usuário\n" +
                    "3\t\t=>\t\tSoma dois números\n" +
                    "4\t\t=>\t\tCalcula média de 4 números\n" +
                    "5\t\t=>\t\tCalcula área de um quadrado pelo valor do lado\n" +
                    "6\t\t=>\t\tCalcula área de um quadrado pelo valor do lado e retorna o dobro desse valor\n" +
                    "7\t\t=>\t\tConverte Celsius para Fahrenheit\n" +
                    "8\t\t=>\t\tConverte Fahrenheit para Celsius\n" +
                    "9\t\t=>\t\tCalcula Salário por horas trabalhadas no mês\n" +
                    "0\t\t=>\t\tFECHA O PROGRAMA\n\n");

                System.out.print("Digite sua opção: ");
                selecao = new Scanner(System.in).nextInt();

                if (selecao < 0) {
                    System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                    continue;
                } else if (selecao > 9) {
                    System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                    continue;
                }else{
                    break;
                }


            } catch (Exception e) {
                System.out.println("\n\nDigite uma opção VÁLIDA!\n\n");
                continue;
            }
        }
        return selecao;

    }


    public static void main(String[] args) {
        System.out.println("Atividade SENAI 19/4/2022 - Básico de Java 1 - Curso: Desenvolvedor Java Vespertino\n\n");

            int num1 = 0;
            int num2 = 0;
            int num3 = 0;
            int num4 = 0;
            Double num1_double;

            Boolean run = true;
            while(run){
                int selecionado = SelecaoTexto();

                switch (selecionado) {
                    case 1:
                        System.out.println("\n\n" + Funcoes.HelloWorld() + "\n\n");
                        continue;
                    case 2:
                        System.out.println("\n\nDigite um número");
                        int numero = new Scanner(System.in).nextInt();
                        System.out.println("Seu número: "+Funcoes.RetornaNumero(numero) + "\n\n");
                        continue;
                    case 3:
                        System.out.println("\n\nDigite dois números:");
                        System.out.print("Num1 = ");
                        num1 = new Scanner(System.in).nextInt();
                        System.out.print("Num2 = ");
                        num2 = new Scanner(System.in).nextInt();
                        System.out.println("Soma dos números = "+Funcoes.SomaNumeros(num1, num2) + "\n\n");
                        continue;
                    case 4:
                        System.out.println("\n\nDigite 4 números:");
                        System.out.print("Num1 = ");
                        num1 = new Scanner(System.in).nextInt();
                        System.out.print("Num2 = ");
                        num2 = new Scanner(System.in).nextInt();
                        System.out.print("Num3 = ");
                        num3 = new Scanner(System.in).nextInt();
                        System.out.print("Num4 = ");
                        num4 = new Scanner(System.in).nextInt();
                        System.out.println("Calcula média = "+ Funcoes.CalculaMedia(num1,num2,num3,num4));
                        continue;
                    case 5:
                        System.out.println("\n\nDigite o lado do Quadrado:");
                        num1_double = new Scanner(System.in).nextDouble();
                        System.out.println("Calcula área = "+Funcoes.CalculaArea(num1_double));
                        continue;
                    case 6:
                        System.out.println("\n\nDigite o lado do Quadrado:");
                        num1_double = new Scanner(System.in).nextDouble();
                        System.out.println("Calcula a área do quadrado multiplicado por 2 = "+Funcoes.RetornaDobroArea(Funcoes.CalculaArea(num1_double)));
                        continue;
                    case 7:
                        System.out.println("\n\nDigite o valor em Fahrenheit:");
                        num1_double = new Scanner(System.in).nextDouble();
                        System.out.println("Fahrenheit para Celsius = "+Funcoes.FahrenheitCelsius(num1_double));
                        continue;
                    case 8:
                        System.out.println("\n\nDigite o valor em Celsius:");
                        num1_double = new Scanner(System.in).nextDouble();
                        System.out.println("Celsius para Fahrenheit = "+Funcoes.CelsiusFahrenheit(num1_double));
                        continue;
                    case 9:
                        System.out.println("\n\nDigite o quanto ganha por hora e a quantidade de horas trabalhadas:");
                        System.out.print("Valor = ");
                        num1_double = new Scanner(System.in).nextDouble();
                        System.out.print("Horas trabalhadas = ");
                        num1 = new Scanner(System.in).nextInt();

                        System.out.println("Quanto por hora trabalhada você ganha = "+Funcoes.ValorHora(num1_double,num1)+ "\n\n");
                        continue;
                    case 0:
                        run = false;
                        break;
                }

            }

            /*




            String scan = new Scanner(System.in).nextLine();


            }
        }
*/

    }
}
