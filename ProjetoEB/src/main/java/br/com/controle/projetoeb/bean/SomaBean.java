package br.com.controle.projetoeb.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="somaBean")
@SessionScoped
public class SomaBean {
	double valor1;
	double valor2;
	double total;

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public void somar() {
		this.total = this.valor1 + this.valor2;
	}

	public void subtrair() {
		this.total = this.valor1 - this.valor2;
	}

	public void dividir() {
		this.total = this.valor1 / this.valor2;
	}

	public void multiplicar() {
		this.total = this.valor1 * this.valor2;
	}
	
}
