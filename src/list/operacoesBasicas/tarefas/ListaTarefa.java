package list.operacoesBasicas.tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String discricao) {
        tarefaList.add(new Tarefa(discricao));
    }

    public void removerTarefa(String discricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(discricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricao(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {


        ListaTarefa listaTarefa =  new ListaTarefa();
        System.out.println("O numero de tarefas é? " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O numero de tarefas é? " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O numero de tarefas é? " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricao();

    }
}


