
public class Iterate300 {
	
	public static void CompleteTask() {
		
		for(int Counter = 0;Counter<300;) {
			
			if(Counter<100) {
				Counter += 7;
			}
			else if (Counter>=100 && Counter<200) {
				Counter += 8;
			}
			else if (Counter>=200) {
				Counter += 9;
			}
			System.out.print(Counter + "  ");
		}
	}
	public static void main(String args[]) {
		CompleteTask();
		
	}
}
