package FrogRace;

import java.util.Scanner;

public class Frog {
	
		private int location;
		private int direction;
		
		public Frog (int theloc,int thedire)
		{
			this.direction=thedire;
			this.location=theloc;
		}
		
		public int getloc()
		{
			return this.location;
		}
		
		public int getdire()
		{
			return this.direction;
		}
		
		public void setloc(int theloc)
		{
			this.location=theloc;
		}
		
		public void setdire(int thedire)
		{
			this.direction=thedire;
		}
		
	
}
