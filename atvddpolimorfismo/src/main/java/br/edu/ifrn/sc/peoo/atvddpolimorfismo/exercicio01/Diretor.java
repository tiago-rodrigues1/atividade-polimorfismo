/*
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos 
*/

package br.edu.ifrn.sc.peoo.atvddpolimorfismo.exercicio01;

public class Diretor extends Funcionario {
	
    public Diretor() {
        System.out.println("Diretor");
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 5;
    }
        
}
