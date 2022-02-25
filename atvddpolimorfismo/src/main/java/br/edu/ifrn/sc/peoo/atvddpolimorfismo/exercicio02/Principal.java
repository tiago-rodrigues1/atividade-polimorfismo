
package br.edu.ifrn.sc.peoo.atvddpolimorfismo.exercicio02;

public class Principal {
    
    public static void main(String[] args) {
        Estagiario e1 = new Estagiario();
        Professor p1 = new Professor();
        Diretor d1 = new Diretor();
    
        Funcionario[] funcionarios = {e1, p1, d1};
        
        System.out.println();
        
        for(Funcionario funcionario : funcionarios) {
            String nomeCompleto = funcionario.getClass().toString().split(" ")[1];
            String[] nomesPacote = nomeCompleto.split("\\.");
            String nomeClasse = nomesPacote[nomesPacote.length - 1];
            
            System.out.println("Salário do " + nomeClasse + ": R$" + funcionario.calcularSalario());
        }
    }
}
