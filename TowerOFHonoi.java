package Recursive_Algorithm;

public class TowerOFHonoi {
	
	
	public static void towerofHonoi(int disk,char s, char h,char d ) {
		if(disk==1) {
			System.out.println("Moving the 1st disk from "+s+" to "+d);
			return;
		}
		
		towerofHonoi(disk-1,s,d,h);  // from the source using the destination to the helper
		System.out.println("Moving "+disk+"th from "+s+" to "+d);  
		towerofHonoi(disk-1,h,s,d); // from the helper to the destination using source
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerofHonoi(3,'s','h','d');
	}

}
