/*
 * Gabrielly Beatriz Brandão Nogueira
 * Tiago Rodrigues dos Santos 
 */

package br.edu.ifrn.sc.peoo.atvddpolimorfismo.exercicio01;

public class Funcionario {
        private String nome;
	private String cpf;
	private double salario;
	
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
	
	public Funcionario() {
            System.out.println("Funcionario\n");
	}
	
	public double calcularSalario() {
            return 2000;
        }
}
