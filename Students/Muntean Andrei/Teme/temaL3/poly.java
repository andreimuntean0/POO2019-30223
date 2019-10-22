package temaL3;

import java.io.File;
import java.util.Scanner;

public class poly {

	private  int[] coef;
	private int degree;

	public poly(int... coef) {
		this.coef = coef;
	}

	public int degree() {
		return degree;
	}

	public void reduce() {
		degree = -1;
		for (int i = coef.length - 1; i >= 0; i--) {
			if (coef[i] != 0) {
				degree = i;
				return;
			}
		}
	}

	public String afisare() {
		if (degree == -1)
			return "0";
		else if (degree == 0)
			return "" + coef[0];
		else if (degree == 1)
			return coef[1] + "x + " + coef[0];
		String s = coef[degree] + "x^" + degree;
		for (int i = degree - 1; i >= 0; i--) {
			if (coef[i] == 0)
				continue;
			else if (coef[i] > 0)
				s = s + " + " + (coef[i]);
			else if (coef[i] < 0)
				s = s + " - " + (-coef[i]);
			if (i == 1)
				s = s + "x";
			else if (i > 1)
				s = s + "x^" + i;
		}
		return s;
	}

	public poly add(poly that) {
		poly p = new poly(0, Math.max(this.degree, that.degree));
		for (int i = 0; i <= this.degree; i++)
			p.coef[i] += this.coef[i];
		for (int i = 0; i <= that.degree; i++)
			p.coef[i] += that.coef[i];
		p.reduce();
		return p;
	}

	public poly subtract(poly that) {
		poly p = new poly(0, Math.max(this.degree, that.degree));
		for (int i = 0; i <= this.degree; i++)
			p.coef[i] += this.coef[i];
		for (int i = 0; i <= that.degree; i++)
			p.coef[i] -= that.coef[i];
		p.reduce();
		return p;
	}

	public poly multiply(poly that) {
		poly p = new poly(0, Math.max(this.degree, that.degree));
		for (int i = 0; i <= this.degree; i++)
			for (int j = 0; j <= that.degree; j++)
				p.coef[i + j] += (this.coef[i] * that.coef[j]);
		p.reduce();
		return p;
	}

	public void mul_scal(poly that, int n) {
		poly p1 = new poly(0, this.degree);
		poly p2 = new poly(0, that.degree);
		for (int i = 0; i <= this.degree; i++)
			p1.coef[i] += this.coef[i] * n;
		for (int i = 0; i <= that.degree; i++)
			p2.coef[i] += that.coef[i] * n;
	}

	public int eval(int n) {

		int p = 0;
		for (int i = degree; i >= 0; i--)
			p = coef[i] + (n * p);
		return p;
	}

	public static void main(String[] args) throws Exception {

		// File f=new File("D:\\Facultate\\AC\\AN 2\\POO\\lab3\\src\\temaL3\\pol.txt");
		// Scanner in = new Scanner(f);
		poly p1= new poly(1, 3, -6, 8);
		
	
	}

}
