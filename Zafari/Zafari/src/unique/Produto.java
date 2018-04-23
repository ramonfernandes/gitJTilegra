package unique;

public class Produto {
	
	private double preco;
	private String nome;
	private String serial;
	
	public Produto(double preco, String nome, String serial){
		if(preco > 0){
			this.preco = preco;
		} else {
			this.preco = -1;
		}
		
		this.nome = nome;
		this.serial = serial;		
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}

}
