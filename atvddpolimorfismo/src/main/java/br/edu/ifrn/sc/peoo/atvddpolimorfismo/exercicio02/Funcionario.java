package br.edu.ifrn.sc.peoo.atvddpolimorfismo.exercicio02;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salario;
    
    protected final double salarioBase = 2000.00;
    
    public abstract double calcularSalario();
    
    public Funcionario() {
        System.out.println(this.getClass().toString());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
