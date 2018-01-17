package FrogRace;

public class TestFrog {
	
	public static void main(String[] args) {
		
	Frog[] Fim= new Frog[5];
	int[] N= new int[Fim.length];
	for (int i=0; i<Fim.length; i++)
	{
		Fim[i]= new Frog (0,0);
	}
	for (int i=0; i<10; i++)
	{
		for(int l=0; l<N.length; l++)
		{
			N[l]=(int)(Math.random()*10);
		}
		for (int k=0; k<Fim.length; k++)
		{
			Fim[k].setloc(Fim[k].getloc()+N[k]);
		}
		int maxi=0;
		int num=0;
		for (int m=0; m<Fim.length; m++)
		{
			maxi=Math.max(maxi, Fim[m].getloc());
			if (maxi==Fim[m].getloc()) num=m;

		}
	for (int b=0; b<Fim.length; b++)
	{
		System.out.print(Fim[b].getloc()+" ");
	}
	System.out.println();
	System.out.println ("the leading frog is frog number "+(num+1)+" and his location is "+maxi);
	


	}
	
	}
	
							    	        	  
							    	          
}
