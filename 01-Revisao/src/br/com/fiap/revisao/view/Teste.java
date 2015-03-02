package br.com.fiap.revisao.view;

import br.com.fiap.revisao.bean.Combustivel;
import br.com.fiap.revisao.bean.Veiculo;

public class Teste {

	public static void main(String[] args) {
		//Instanciar a classe veiculo
		Veiculo veiculo = new Veiculo();
		veiculo.setModelo("Fusca");
		veiculo.setCombustivel(Combustivel.GASOLINA);
		
		//Verificar se o carro é movido a gasolina
		if (veiculo.getCombustivel() == Combustivel.GASOLINA || 
				veiculo.getCombustivel() == Combustivel.FLEX){
			System.out.println("Carro movido a gasolina");
		}else{
			System.out.println("Carro não movido a gasolina");
		}
		
		System.out.println("Carro movido a " + veiculo.getCombustivel());
		
	}
	
}




