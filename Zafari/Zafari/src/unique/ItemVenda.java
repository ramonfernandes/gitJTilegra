package unique;

import java.util.Iterator;

public class ItemVenda {
	
	private Produto produto;
	private int quantidade;

	//aa este é um atributo calculado e então não vamos armazenar
	//private double valorTotal;
	
	public ItemVenda(Produto produto){		
		this.produto = produto;
		this.quantidade = 1;
		
		//aa apenas olhando esta parte do código não fica claro o 
		//   que faz o método
		//calculaValorTotal();
	}
	
	public ItemVenda(Produto produto, int quantidade){
		this.produto = produto;		
		this.quantidade = quantidade;
		//aa calculaValorTotal();
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
		//aa calculaValorTotal();
	}
	
	public double getValorItem() {
		double valorUnitario = produto.getPreco();		
		return  valorUnitario * quantidade;
	}
	
	
	//public void setValorTotal(double valorTotal) {
	//	this.valorTotal = valorTotal;
	//}
	
	//public void calculaValorTotal(){
	//	double valorUnitario = produto.getPreco();		
	//	valorTotal = valorUnitario * quantidade;
	//}
	
	public String toString (){
		//aa concatenação de strings é caro, melhor usar a classe StringBuilder ou String.format
		
		//String aux = "";
		//aux += produto.getNome() + "	  srl: "+ produto.getSerial() + "   |   qnt: " + quantidade + 
		//		"	Valor: R$" + this.getValorTotal();
		//return aux;
		return String.format("%5s %-15s\t  PU: %5.2f\t quant: %2d \tValorItem: %5.2f" ,
				produto.getSerial(), produto.getNome(), produto.getPreco(),
				this.getQuantidade(), this.getValorItem());
	}

}
