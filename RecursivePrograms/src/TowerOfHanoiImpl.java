
public class TowerOfHanoiImpl {

	public void TOH(int n, char fr, char to, char aux) {
		if(n==1) {
			System.out.println("Move disk 1 from" + fr +" to "+ to);
			return;
		}
		TOH(n-1, fr, aux, to);
		System.out.println("Move disk  from" + fr +" to "+ to);
		TOH(n-1, aux, to, fr);
	}
}
