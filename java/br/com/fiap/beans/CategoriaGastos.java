package br.com.fiap.beans;

import java.util.ArrayList;
import java.util.List;


public class CategoriaGastos {

	public float IdGastos;
	private float agua;
	private float luz;
	private float mercado;
	private float cartao;
	private float besteiras;
	private float outros;
	private float gastosgeral;
	private List<CategoriaGastos> gastos = new ArrayList<>();

	public CategoriaGastos() {
			
	}
	
	

	public float getIdGastos() {
		return IdGastos;
	}



	public void setIdGastos(float IdGastos) {
		this.IdGastos = IdGastos;
	}



	public float getAgua() {
		return agua;
	}

	public void setAgua(float agua) {
		this.agua = agua;
	}

	public float getLuz() {
		return luz;
	}

	public void setLuz(float luz) {
		this.luz = luz;
	}

	public float getMercado() {
		return mercado;
	}

	public void setMercado(float mercado) {
		this.mercado = mercado;
	}

	public float getCartao() {
		return cartao;
	}

	public void setCartao(float cartao) {
		this.cartao = cartao;
	}

	public float getBesteiras() {
		return besteiras;
	}

	public void setBesteiras(float besteiras) {
		this.besteiras = besteiras;
	}

	public float getOutros() {
		return outros;
	}

	public void setOutros(float outros) {
		this.outros = outros;
	}

	public float getGastosgeral() {
		return gastosgeral;
	}

	public void setGastosgeral(float gastosgeral) {
		this.gastosgeral = gastosgeral;
	}

	public List<CategoriaGastos> getGastos() {
		return gastos;
	}

	public void setGastos(List<CategoriaGastos> gastos) {
		this.gastos = gastos;
	}
}






