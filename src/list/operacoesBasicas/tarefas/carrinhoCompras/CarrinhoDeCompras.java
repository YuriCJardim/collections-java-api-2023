package list.operacoesBasicas.tarefas.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoDeCompras;


    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemRemover = new ArrayList<>();
        for (Item i :
                carrinhoDeCompras) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemRemover.add(i);
            }
            carrinhoDeCompras.removeAll(itemRemover);
        }
    }

    public Double calcularValorTotal(String nome) {
        Double valorTotal = 0.0;
        for (Item i : carrinhoDeCompras) {
            if (nome.equalsIgnoreCase(i.getNome())) {
                valorTotal = i.getPreco() * i.getQuantidade();
                ;

            }
        }
        return valorTotal;
    }

    public void exibirItens() {

        for (Item item : carrinhoDeCompras) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Leite", 2.99, 3);

        carrinhoDeCompras.exibirItens();
        System.out.println(carrinhoDeCompras.calcularValorTotal("Leite"));

        carrinhoDeCompras.adicionarItem("cafe", 3.99, 1);
        System.out.println(carrinhoDeCompras.calcularValorTotal("Cafe"));

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Leite");

        carrinhoDeCompras.exibirItens();


    }

}
