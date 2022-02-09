import java.util.Scanner;
public class Solution_3499 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 1;test_case<=T;test_case++) {
			int num = sc.nextInt();
			String[] arr = new String[num];
			for(int i=0;i<num;i++) {
				arr[i] = sc.next();
			}
			System.out.print("#"+test_case+" ");
			if(num % 2 == 0) {                      // 카드의 개수가 홀수일 때와 짝수일 때 구분
				for(int j=0;j<num/2;j++) {          // 두 뭉치에서 하나씩 출력 ~개수/2 만큼 횟수 반복
					System.out.print(arr[j]+" ");
					System.out.print(arr[j+num/2]+" ");
				}
			}else {
				for(int j=0;j<num/2;j++) {          // 두 뭉치에서 하나씩 출력 ~개수/2 만큼 횟수 반복 - 짝수와 동일
					System.out.print(arr[j]+" ");
					System.out.print(arr[j+num/2+1]+" ");
					}
				System.out.print(arr[num/2]);  // 가운데 카드 추가 출력
				}
			System.out.println();
			}
		}
}