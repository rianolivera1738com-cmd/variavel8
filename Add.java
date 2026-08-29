public class App {
public static void main(String[] args) throws Exception {
String nomeFuncionario = "Carlos Silva";
double valorHora = 35.50;
double horasTrabalhadas = 160.0; 
double salarioMensal = valorHora * horasTrabalhadas;
double salarioBruto = valorHora * horasTrabalhadas;
System.out.println("Funcionário: " + nomeFuncionario);
System.out.println("Valor da hora: R$ " + valorHora);
System.out.println("Horas trabalhadas: " + horasTrabalhadas);
System.out.println("Salário mensal: R$ " + salarioMensal);
System.out.println("Salário bruto: R$ " + salarioBruto);
}}
