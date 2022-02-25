package br.edu.ifrn.sc.peoo.atvddpolimorfismo.exercicio02;

public class Professor extends Funcionario {

    public Professor() {
        System.out.println(this.getClass().toString());
    }
    
    @Override
    public double calcularSalario() {
        return super.salarioBase * 3;
    }
    
}
