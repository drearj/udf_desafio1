public class ExecuteTest {
    public static void main(String args[]) {

        Endereco endereco = new Endereco("Mané Garrincha", "B3");
        Funcionario funcionario = new Funcionario("André Araujo", "15/07/1999", endereco, "Engenheiro de Software", 100000);

        System.out.println("-- DADOS DO FUNCIONÁRIO --");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Data de nascimento: " + funcionario.getDataNascimento());
        System.out.println("Endereço: " + funcionario.endereco.getFullAdress());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Salário: R$" + funcionario.getFormatedSalario());
        ;    }
}