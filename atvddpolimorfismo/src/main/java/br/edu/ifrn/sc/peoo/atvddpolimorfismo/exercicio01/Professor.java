/*
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos 
*/

package br.edu.ifrn.sc.peoo.atvddpolimorfismo.exercicio01;

public class Professor extends Funcionario {
	
    public Professor() {
        System.out.println("Professor");
    }
	
    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 3;
    }
}