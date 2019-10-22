package temaL3;
import java.math.*;
import java.util.Scanner;

public class matrixOP {

	/*public static BigDecimal[][] matrix (int m,int n)
	{
		BigDecimal[][] a= new BigDecimal[m][n];
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
				a[i][j]=(0.0,20.0);
		
		return a;
	}
	*/
	
	private static Scanner din;
	private static Scanner din2;


	public static void citire(BigDecimal [][] a, int m,int n)
	{
		din = new Scanner(System.in);
		System.out.println("Valori de introdus in matrice:");
		for(int i=0;i<m;i++)
			for(int j=0;j<n;j++)
			{
				BigDecimal x= din.nextBigDecimal();
				a[i][j]=x;
			}
	}
	
	public static BigDecimal[][] add(BigDecimal[][] a, BigDecimal[][] b) {
        int m = a.length;
        int n = a[0].length;
        BigDecimal[][] c = new BigDecimal[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                c[i][j] = a[i][j].add(b[i][j]);
        return c;
    }
	
	public static BigDecimal[][] subtract(BigDecimal[][] a, BigDecimal[][] b) {
        int m = a.length;
        int n = a[0].length;
        BigDecimal[][] c = new BigDecimal[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                c[i][j] = a[i][j].subtract(b[i][j]);
        return c;
    }
	
	public static BigDecimal[][] multiply(BigDecimal[][] a,int m,int n, BigDecimal[][] b,int mb,int nb) {
        if ((n!=mb)&&(m!=nb)) 
        	throw new RuntimeException("Inmultirea nu se poate realiza, una dintre matrici nu are suficienti termeni");
        BigDecimal[][] c = new BigDecimal[m][nb];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    c[i][j] = c[i][j].add(a[i][k].multiply(b[k][j])); //aici nu calculeaza corect
        return c;
    }
	
	public static BigDecimal[][] multiplyScalar(BigDecimal[][] a, BigDecimal x) {
        int m = a.length;
        int n = a[0].length;
        BigDecimal[][] c = new BigDecimal[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
            	c[i][j] = a[i][j].multiply(x);
        return c;
    }
	
	
	
	/*public static BigDecimal determinant(BigDecimal[][] a) throws Exception {
        int m = a.length;
        int n = a[0].length;
        BigDecimal s;
        int sign;
        if (m!=n)
        	throw new Exception("Matricea nu e patratica");
        if (n==0) {
        	return a[0][0];
        }
        if (n==2)
        	return a[0][0].multiply(a[1][1]).subtract(a[0][1].multiply(a[1][0]));
        for (int i=0; i<n; i++) {
            if(i%2==0)
            	sign=1;
            else
            	sign=-1;
            
        //	s=s.add(a[0][i].multiply(determinant(createsubmatrix(a,0,i)).multiply(sign)));
        }
        return s;
    }
	 */
	 public static int areEqual(BigDecimal[][] a, BigDecimal[][] b) {
	        int m = a.length;
	        int n = a[0].length;
	        int sem=1;//true
	        for (int i = 0; i < m; i++)
	            for (int j = 0; j < n; j++)
	                if(a[i][j].equals(b[i][j]))
	                	sem=1;
	                else
	                	sem=0;
	        return sem;
	    }
	 
	 public static int isZeroMatrix(BigDecimal[][] a) {
	        int m = a.length;
	        int n = a[0].length;
	        int sem=1;//true
	        for (int i = 0; i < m; i++)
	            for (int j = 0; j < n; j++)
	                if(a[i][j].equals(0))
	                	sem=1;
	                else
	                	sem=0;
	        return sem;
	    }
	 
	 public static int isidentityMatrix(BigDecimal[][] a,int m,int n) {
		 int sem=1;//true
		 for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++)
			{
				if(a[i][j].equals(0))
					sem=1;
				else
					sem=0;
				if((a[i][j].equals(1))&&(i==j))
					sem=1;
				else
					sem=0;	
			}
		return sem;
	 }	
	 
	 public static float fillDegree(BigDecimal[][] a) {
	        int m = a.length;
	        int n = a[0].length;
	        int ct=0;
	        for (int i = 0; i < m; i++)
	            for (int j = 0; j < n; j++)
	                if(a[i][j].equals(0))
	                	ct++;
	        float x=ct/(m+n);
	        return x*100;
	    }
	 
	 
	public static void main(String[] args) {
		
		int m,n;
		din2 = new Scanner(System.in);
		System.out.println("m=");
		int x= din2.nextInt();
		m=x;
		System.out.println("n=");
		x= din2.nextInt();
		n=x;
		BigDecimal[][] a= new BigDecimal[m][n];
		
		citire(a,m,n);
		  
		int mb,nb;
        System.out.println("mb=");
        x= din2.nextInt();
		mb=x;
		System.out.println("nb=");
		x= din2.nextInt();
		nb=x;
		BigDecimal[][] b= new BigDecimal[mb][nb];
		
		citire(b,mb,nb);
		
		//afisari
		System.out.println("Matricea a:");
        for(int i=0;i<m;i++)
			System.out.println(a[i][n-3]+" "+a[i][n-2]+" "+a[i][n-1]);
		System.out.println("Matricea b:");
        for(int i=0;i<mb;i++)
			System.out.println(b[i][nb-3]+" "+b[i][nb-2]+" "+b[i][nb-1]);
        
		System.out.println("");
        //ADD
        System.out.println("ADD");
        BigDecimal[][] suma=add(a,b);
        for(int i=0;i<m;i++)
			System.out.println(suma[i][n-3]+" "+suma[i][n-2]+" "+suma[i][n-1]);
       
		System.out.println("");
        //SUBTRACT
        System.out.println("SUBTRACT");
        BigDecimal[][] dif=subtract(a,b);
        for(int i=0;i<m;i++)
			System.out.println(dif[i][n-3]+" "+dif[i][n-2]+" "+dif[i][n-1]);
        
		System.out.println("");
        //MULTIPLY
        System.out.println("MULTIPLY");
		//BigDecimal[][] mul=multiply(a,m,n,b,mb,nb);
        //for(int i=0;i<m;i++)
			//System.out.println(mul[i][n-3]+" "+mul[i][n-2]+" "+mul[i][n-1]);
        //NU functioneaza
        
		System.out.println("");
        //MULTIPLY w SCALAR
        System.out.println("MULTIPLY w SCALAR");
        BigDecimal q=new BigDecimal("2");
		BigDecimal[][] muls=multiplyScalar(a,q);
        for(int i=0;i<m;i++)
			System.out.println(muls[i][n-3]+" "+muls[i][n-2]+" "+muls[i][n-1]);
        
        //DETERMINANT
        //System.out.println("DETERMINANT");
		//Nu e terminat (nu functioneaza)
        
        //areEQUAL
		int egal=areEqual(a,b);
		if(egal==1)
	        System.out.println("Matricile sunt egale");
		else
	        System.out.println("Matricile nu sunt egale");

		System.out.println("");
        //isZeroMatrix
		int zero=isZeroMatrix(a);
		if(zero==1)
	        System.out.println("Zero ");
		else
	        System.out.println("Nu e zero");
        
        //isIdentityMatrix
		System.out.println("");
		int iden=isidentityMatrix(a,m,n);
		if(iden==1)
	        System.out.println("Matricea identitate");
		else
	        System.out.println("Nu e matricea identitate");
        
        //fillDegree
		System.out.println("");
        System.out.println(fillDegree(a) + "%");
	}

}
