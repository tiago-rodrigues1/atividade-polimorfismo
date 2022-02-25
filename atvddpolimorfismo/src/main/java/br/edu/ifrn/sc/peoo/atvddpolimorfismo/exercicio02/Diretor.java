package br.edu.ifrn.sc.peoo.atvddpolimorfismo.exercicio02;

public class Diretor extends Funcionario {

    public Diretor() {
        System.out.println(this.getClass().toString());
    }

    @Override
    public double calcularSalario() {
        return super.salarioBase * 5;
    }
    
}
