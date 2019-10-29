package lab4;

import java.awt.Color;

public class Autovehicul {
	
	private String marca;
	private Color color;
	private int vitezaCurenta;
	private int treaptaVitezaCurenta;
	private int vitezaMaxima;
	
	private static int maxtreapta=8;
	public Autovehicul(String nmarca, Color ncolor, int nvitezaCurenta, int ntreaptaVitezaCurenta, int nvitezaMaxima)
	{
		marca=nmarca;
		color=ncolor;
		vitezaCurenta=nvitezaCurenta;
		treaptaVitezaCurenta=ntreaptaVitezaCurenta;
		vitezaMaxima=nvitezaMaxima;	
	}
	
	public Autovehicul()
	{
		setMarca(null);
		setColor(null);
		setVitezaCurenta(0);
		setTreaptaVitezaCurenta(0);
		setVitezaMaxima(0);	
	}
	
	public static void accelerare(Autovehicul a,int vitezaCurenta,int vitezaMaxima ,int vitezaPlus) 
	{
		if(vitezaCurenta+vitezaPlus>=vitezaMaxima )
		{
			a.vitezaCurenta=vitezaMaxima;
			schimbareTrepteViteza(a,maxtreapta);
		}
		else
			a.vitezaCurenta=vitezaCurenta+vitezaPlus;
	}
	public static void decelerare(Autovehicul a,int vitezaCurenta,int vitezaMinus,int treaptaVitezaCurenta) 
	{
		if(vitezaCurenta-vitezaMinus<=0)
		{
			a.vitezaCurenta=0;
			schimbareTrepteViteza(a, 0);
		}
		else
			a.vitezaCurenta=vitezaCurenta-vitezaMinus;
	}
	public static void schimbareTrepteViteza(Autovehicul a, int nouaTreapta) 
	{
		a.treaptaVitezaCurenta=nouaTreapta;
	}
	public static void oprire(Autovehicul a) 
	{
		a.vitezaCurenta=0;
		a.treaptaVitezaCurenta=0;
	}
		
	public static void afisare(Autovehicul a) {
		System.out.println("  ");
		System.out.println("Marca: "+ a.getMarca());
		System.out.println("Culoare: "+ a.getColor());
		System.out.println("Viteza curenta: "+ a.getVitezaCurenta() + " km/h");
		System.out.println("Treapta de viteza curenta: "+ a.getTreaptaVitezaCurenta());
		System.out.println("Viteza maxima: "+ a.getVitezaMaxima() + " km/h");
	}	
	
	public static void afisaresoferauto(Sofer s) {
		System.out.println("Nume: " + s.getNume());
		System.out.println("Prenume: " + s.getPrenume());
		System.out.println("Varsta: " + s.getVarsta());
		System.out.println("Numar permis: " + s.getNrPermis());
		System.out.println("Autovehicul condus:");
		afisare(s.getAcondus());
	}	
	
	private static void afiseazaTot(Sofer s1, IstoricAuto ist1, Asigurare asg1) {
		afisaresoferauto(s1);
		System.out.println("Accident: " + ist1.isAccident());
		System.out.println("Kilometrii: " + ist1.getKm());
		System.out.println("Numar Proprietari: " + ist1.getNrProprietari());

		System.out.println("Tip Asigurare: " + asg1.getTipAsigurare());
		System.out.println("Valabilitate: " + asg1.isValabil());
		System.out.println("Data expirarii: " + asg1.getDataExpirarii());		
	}
	
	public static void main(String[] args) {
		
		Autovehicul a1= new Autovehicul("AUDI", Color.BLACK , 90, 6, 250);
		Autovehicul a2= new Autovehicul("BMW", Color.BLUE, 100, 6, 250);
		Autovehicul a3= new Autovehicul("DACIA", Color.RED, 50, 3, 140);
		Autovehicul a4= new Autovehicul("VOLKSWAGEN", Color.WHITE, 80, 7, 240);
		Autovehicul a5= new Autovehicul();
		
		//afisari
		afisare(a1);
		System.out.println("  ");
		
		accelerare(a1,a1.vitezaCurenta,a1.vitezaMaxima, 100);
		schimbareTrepteViteza(a1,a1.treaptaVitezaCurenta+2);
		System.out.println("Viteza curenta: " + a1.vitezaCurenta);
		System.out.println("Treapta viteza curenta: " + a1.treaptaVitezaCurenta);
		
		decelerare(a1,a1.vitezaCurenta,120,a1.treaptaVitezaCurenta);
		schimbareTrepteViteza(a1,a1.treaptaVitezaCurenta-3);
		System.out.println("Viteza curenta: " + a1.vitezaCurenta);
		System.out.println("Treapta viteza curenta: " +a1.treaptaVitezaCurenta);
		
		oprire(a1);
		System.out.println("Viteza curenta: " + a1.vitezaCurenta);//0
		System.out.println("Treapta viteza curenta: " +a1.treaptaVitezaCurenta);//0
		
		accelerare(a1,a1.vitezaCurenta,a1.vitezaMaxima, 100);
		schimbareTrepteViteza(a1,a1.treaptaVitezaCurenta+7);
		System.out.println("Viteza curenta: " + a1.vitezaCurenta);
		System.out.println("Treapta viteza curenta: " +a1.treaptaVitezaCurenta);
		
	
		afisare(a2);
		afisare(a3);		
		afisare(a4);
		afisare(a5);
		
		Sofer s1=new Sofer("A", "B", 20, 263637, a1);
		afisaresoferauto(s1);
		
		IstoricAuto ist1=new IstoricAuto(a1,s1,false,130000,2);
		
		Asigurare asg1= new Asigurare(a1,s1,"CASCO",true,"12.12.2020");
		
		afiseazaTot(s1,ist1,asg1);
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getTreaptaVitezaCurenta() {
		return treaptaVitezaCurenta;
	}
	public void setTreaptaVitezaCurenta(int treaptaVitezaCurenta) {
		this.treaptaVitezaCurenta = treaptaVitezaCurenta;
	}
	public int getVitezaCurenta() {
		return vitezaCurenta;
	}
	public void setVitezaCurenta(int vitezaCurenta) {
		this.vitezaCurenta = vitezaCurenta;
	}
	public int getVitezaMaxima() {
		return vitezaMaxima;
	}
	public void setVitezaMaxima(int vitezaMaxima) {
		this.vitezaMaxima = vitezaMaxima;
	}
}
