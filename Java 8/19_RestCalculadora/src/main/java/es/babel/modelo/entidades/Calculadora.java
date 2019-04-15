package es.babel.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Entity
@Table(name="operaciones")
@XmlRootElement
@Component
public class Calculadora {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private double op1;
	private double op2;
	private String op;
	private double res;
	
	public Calculadora() {}
	
	public Calculadora(double op1, double op2,String op) {
		this.op1 = op1;
		this.op2 = op2;
		this.op = op;
		this.res = 0;
	}
	
	//public abstract void calcula(double op1,double op2);
	
	public double getOp1() {
		return op1;
	}
	public void setOp1(double op1) {
		this.op1 = op1;
	}
	public double getOp2() {
		return op2;
	}
	public void setOp2(double op2) {
		this.op2 = op2;
	}
	
	

	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}

	public double getRes() {
		return res;
	}
	public void setRes(double res) {
		this.res = res;
	}
	
	public void calcular() {
		switch(op) {
		case "suma":{this.res= op1+op2;};break;
		case "resta":{this.res= op1-op2;};break;
		case "division":{this.res= op1/op2;};break;
		case "multiplicacion":{this.res= op1*op2;};break;
		default:{
			 
			System.out.println("error");
		}
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Calculadora [id=" + id + ", op1=" + op1 + ", op2=" + op2 + ", op=" + op + ", res=" + res + "]";
	}

	
}
