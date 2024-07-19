import java.util.Scanner;

public class CalculoDeSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o salário do funcionário:");
        double salarioBruto = scanner.nextDouble();

        double descontoInss;
        double descontoIr;
        double salarioLiquido;


        if (salarioBruto <= 1212.00) {
            descontoInss = salarioBruto * 0.075;
        } else if (salarioBruto <= 2427.35) {
            descontoInss = (1212.00 * 0.075) + ((salarioBruto - 1212.00) * 0.09);
        } else if (salarioBruto <= 3641.03) {
            descontoInss = (1212.00 * 0.075) + ((2427.35 - 1212.00) * 0.09) + ((salarioBruto - 2427.35) * 0.12);
        } else if (salarioBruto <= 7087.22) {
            descontoInss = (1212.00 * 0.075) + ((2427.35 - 1212.00) * 0.09) + ((3641.03 - 2427.35) * 0.12) + ((salarioBruto - 3641.03) * 0.14);
        } else {
            descontoInss = (1212.00 * 0.075) + ((2427.35 - 1212.00) * 0.09) + ((3641.03 - 2427.35) * 0.12) + ((7087.22 - 3641.03) * 0.14) + ((salarioBruto - 7087.22) * 0.14);
        }

        double salarioBaseIr = salarioBruto - descontoInss;


        if (salarioBaseIr <= 1903.98) {
            descontoIr = 0;
        } else if (salarioBaseIr <= 2826.65) {
            descontoIr = (salarioBaseIr - 1903.98) * 0.075;
        } else if (salarioBaseIr <= 3751.05) {
            descontoIr = (salarioBaseIr - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
        } else if (salarioBaseIr <= 4664.68) {
            descontoIr = (salarioBaseIr - 3751.05) * 0.225 + (3751.05 - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
        } else {
            descontoIr = (salarioBaseIr - 4664.68) * 0.275 + (4664.68 - 3751.05) * 0.225 + (3751.05 - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
        }

        salarioLiquido = salarioBaseIr - descontoIr;

        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Valor pago ao INSS: R$ " + descontoInss);
        System.out.println("Valor pago de Imposto de Renda: R$ " + descontoIr);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}

