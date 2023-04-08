class Pessoa {
    String nome;
    String dataNascimento;
    Endereco endereco;

    public Pessoa(String nome, String dataNascimento, Endereco endereco) {
        this.setNome(nome);
        this.setDataNascimento(dataNascimento);
        this.setEndereco(endereco);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}