package list.operacoesBasicas.tarefas.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;


    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemRemover = new ArrayList<>();
        if (!itemList.isEmpty()){
        for (Item i :
                itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemRemover.add(i);
            }
            itemList.removeAll(itemRemover);
        }
    }else {
            System.out.println("A lista está vazia!");
        }
    }

    public Double calcularValorTotal(String nome) {
        if (!itemList.isEmpty()) {
            Double valorTotal = 0.0;
            for (Item i : itemList) {
                if (nome.equalsIgnoreCase(i.getNome())) {
                    valorTotal = i.getPreco() * i.getQuantidade();
                }
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {

        for (Item item : itemList) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        CarrinhoDeCompras itemList = new CarrinhoDeCompras();

        itemList.adicionarItem("Leite", 2.99, 3);

        itemList.exibirItens();
        System.out.println(itemList.calcularValorTotal("Leite"));

        itemList.adicionarItem("cafe", 3.99, 1);
        System.out.println(itemList.calcularValorTotal("Cafe"));

        itemList.exibirItens();

        itemList.removerItem("Leite");

        itemList.exibirItens();


    }

}
