import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int sum = 0;
		for(int i=0;i<9;i++) {
			list.add(sc.nextInt()); // 난쟁이 키를 입력받고 동시에 합 계산
			sum+=list.get(i);
		}
		outer : for(int i=0;i<8;i++) {
			for(int j=1;j<9;j++) {
				if(list.get(i)+list.get(j) == sum-100) { // 전체 난쟁이 중 2명을 골라서 그 합이 100에서 초과된 값과 일치하면 리스트에서 제거
					list.remove(i);
					list.remove(j-1);
					break outer;
				}
			}
		}
		Collections.sort(list);  //정렬
		for(int i=0;i<list.size();i++) {  // 난쟁이 키 출력
			System.out.println(list.get(i));
		}
	}

}