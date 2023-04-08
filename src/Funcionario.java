public class Funcionario extends Pessoa {
    String cargo;
    int salario;

    public Funcionario(String nome, String dataNascimento, Endereco endereco, String cargo, int salario) {
        super(nome, dataNascimento, endereco);
        this.setCargo(cargo);
        this.setSalario(salario);
    }

    public String getCargo() {
        return this.cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return this.salario;
    }
    public double getFormatedSalario() {
        double formatedSalario = this.salario / 100;
        return formatedSalario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

}