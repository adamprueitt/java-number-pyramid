public class pyramid {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int numLines = scan.nextInt();;
		for (int i = 1; i <= numLines; i++) {
			System.out.print(new String(new char[(numLines-i)]).replace("\0", "."));
			System.out.print(new String(new char[(i)]).replace("\0", i+""));
			System.out.println();
		}
	}
}
