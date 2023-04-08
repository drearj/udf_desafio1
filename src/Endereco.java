public class Endereco {
    String logradouro;
    String numero;
    String complemento;
    String cidade;
    String bairro;
    String cep;

    public Endereco(String logradouro, String numero, String complemento, String cidade, String bairro, String cep) {
        this.setLogradouro(logradouro);
        this.setNumero(numero);
        this.setComplemento(complemento);
        this.setCidade(cidade);
        this.setBairro(bairro);
        this.setCep(cep);
    }

    public Endereco(String logradouro, String numero, String complemento) {
        this.setLogradouro(logradouro);
        this.setNumero(numero);
        this.setComplemento(complemento);
    }

    public Endereco(String logradouro, String numero) {
        this.setLogradouro(logradouro);
        this.setNumero(numero);
    }

    public Endereco (String logradouro) {
        this.setLogradouro(logradouro);
    }

    public String getFullAdress() {
        String logradouro = this.getLogradouro();
        String numero = this.getNumero();
        return logradouro + ", " + numero;
    }

    /*
     * GETS E SETS
     */
    public String getLogradouro() {
        return this.logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return this.numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return this.complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return this.cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return this.bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return this.cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
}