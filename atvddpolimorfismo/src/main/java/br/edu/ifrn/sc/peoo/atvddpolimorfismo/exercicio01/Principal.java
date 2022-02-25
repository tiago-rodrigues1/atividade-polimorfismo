/*
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos 
*/

package br.edu.ifrn.sc.peoo.atvddpolimorfismo.exercicio01;

public class Principal {
    
    public static void main(String[] args) {
		
        Estagiario e = new Estagiario();
        System.out.println(e.calcularSalario());

        System.out.println();

        Professor p = new Professor();
        System.out.println(p.calcularSalario());

        System.out.println();

        Diretor d = new Diretor();
        System.out.println(d.calcularSalario());

    } 
}
