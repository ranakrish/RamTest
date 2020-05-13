package practice;

public class WorkOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String r = "You have no choice other than following me!";
	char[] s=r.toCharArray();
	int d=0;
	for(int i=0;i<s.length;i++) {
		if(s[i]=='O') {
			d=d+1;
			System.out.println(d);
			}
				
		}
	}
}
