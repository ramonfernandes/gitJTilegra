package unique;

import java.util.ArrayList;
import java.util.List;

public class Nota {
	
	private Cliente cliente;
	private List<ItemVenda> itensVenda;
	private double valorFinal;
	
	public Nota(){
		//aa atributo calculado
		//valorFinal = 0;	
		cliente = null;
		itensVenda = new ArrayList<ItemVenda>();
	}
	
	public boolean incluirItemVenda(ItemVenda itemvenda){
		if(itemvenda!=null){
			itensVenda.add(itemvenda);
			// valorFinal += itemvenda.getValorTotal();
			return true;
		}
		return false;		
	}
	
	public boolean removerItemVenda(ItemVenda itemvenda){
		for(ItemVenda a : itensVenda){
			if(a.equals(itemvenda)){
				// valorFinal = valorFinal - a.getValorTotal();
				itensVenda.remove(a);
				return true;
			}			
		}
		return false;
	}
	
	public void setCliente(Cliente cliente){
		this.cliente = cliente;
	}
	
	public Cliente getCliente(){
		return cliente;
	}
	
	public double getValorTotal() {
       double total = 0;
       for (ItemVenda itemVenda : itensVenda) {
    	   total += itemVenda.getValorItem();
	   }
       return total;
	}
	
	public String imprimirNota(){
		StringBuilder notaStr = new StringBuilder();
		
		for (ItemVenda a : itensVenda)
		{
			notaStr.append(a.toString());
			notaStr.append("\n");			
		}		
		
		
		notaStr.append("\nTotal:	R$ ");
		notaStr.append(this.getValorTotal());
		notaStr.append("\n");
		
		//if(cliente==null){
		//	return listaItensVenda;
		//} else{
		//	listaItensVenda += "CPF do comprador:	" + cliente.getCpf();
		//	return listaItensVenda;
	
		if(cliente !=null){
			notaStr.append("\nCPF do comprador:	");
			notaStr.append(cliente.getCpf());
		}
		return notaStr.toString();
			
	}	
}
