public class SimpleArraySum{

	static int simpleArraySum(int[] ar){
		int sum = 0;
		for(int a: ar) sum += a;
		return sum;
	}
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		int arCount = Integer.parseInt(sc.nextLine().trim());
		int ar[] = new int[arCount];
		
		String[] arItems = scanner.nextLine().split(" ");
		
		for(int i = 0; i < arCount; i++){
			ar[i] = Integer.parseInt(arItems[arItr].trim());
		}
		
		int result = simpleArraySum(ar);
		
		bw.write(String.valueOf(result));
		bw.newLine();
		
		bw.close();
		
		System.out.println(result);
	}
}
