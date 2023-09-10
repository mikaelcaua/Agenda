public class Contato {


    private String nome;
    private String endereco;
    private String email;



    //pessoa fisica
    private int cpf;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private String estadoCivil;



    //pessoa juridica
    private int cnpj;
    private int inscricaoEstadual;



    //verificar se é juridica ou fisica
    private boolean pessoaFisica;



    //construtor
    public Contato() {
        this.pessoaFisica = false;
    }






    public int getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(int inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public boolean isPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(boolean pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }

    public int getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(int CNPJ) {
        this.cnpj = CNPJ;
    }

    public int getCPF() {
        return cpf;
    }

    public void setCPF(int CPF) {
        this.cpf = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }





}
