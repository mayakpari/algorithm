import java.util.Scanner;

public class Main_2563 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int paper = sc.nextInt();
		int[][] map = new int[100][100];
		// 사분면 설정
		for(int i=0;i<paper;i++) {
			int side = sc.nextInt();
			int bottom = sc.nextInt();
			for(int j=90-bottom;j<100-bottom;j++) { //색종이 좌상단 꼭지점
				for(int k=side;k<side+10;k++) {     //색종이 우하단 꼭지점
					if(map[j][k] == 0) {  // 덮여있지 않으면 
						map[j][k] = 1;    // 덮기
						cnt++;			  // 색종이에 의해 덮인 면적
					}
				}
			}
		}
		System.out.println(cnt);
	}

}
