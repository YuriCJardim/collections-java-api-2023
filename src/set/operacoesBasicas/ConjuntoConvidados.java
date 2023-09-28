package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    // Função que adiciona convidados ao conjunto Set da Classe Convidado
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerCanvidatoPorCodigoDeConvite(int codigoConvite) {
        Convidado convidadoRemover = null;
        if (!convidadoSet.isEmpty()) {
            for (Convidado c : convidadoSet) {
                if (c.getCodigoConvite() == codigoConvite) {
                    convidadoRemover = c;
                    break;
                }
            }
            if (convidadoRemover == null) {
                throw new RuntimeException("Não existe conbvidado com este código de convite ");
            } else
                convidadoSet.remove(convidadoRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    //Função que exibe o número de convidados dentro do Set da Classe Conviado
    public int contarConvidados() {

        return convidadoSet.size();
    }

    public void exibirConvidados() {
        if (!convidadoSet.isEmpty()) {
            System.out.println(convidadoSet);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }

    }

    public static void main(String[] args) {

       //Criando uma instância da Classe ConjuntoConvidados
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();


        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");


        conjuntoConvidados.adicionarConvidado("Alice", 1234);
        conjuntoConvidados.adicionarConvidado("Bob", 1235);
        conjuntoConvidados.adicionarConvidado("Charlie", 1235);
        conjuntoConvidados.adicionarConvidado("David", 1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");


        conjuntoConvidados.exibirConvidados();
        System.out.println();
        conjuntoConvidados.removerCanvidatoPorCodigoDeConvite(1234);

        conjuntoConvidados.exibirConvidados();

    }
}

