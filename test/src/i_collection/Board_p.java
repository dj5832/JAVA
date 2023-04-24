package i_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class Board_p {

	public static void main(String[] args) {
		ArrayList<HashMap<String, String>> table = new ArrayList<>();
		HashMap<String, String> boardWritting = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd a hh:mm");
		String day = sdf.format(today);
		while(true) {
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("번호\t제목\t작성자\t작성일");
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			for(int i = 0; i < table.size(); i++) {
				System.out.print(i+1 + "\t");
				if(table.get(i) != null) {
					System.out.print(table.get(i).get("제목") + "\t");
					System.out.print(table.get(i).get("작성자") + "\t");
					System.out.println(table.get(i).get("작성일"));
				}
			}
			System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
			System.out.println("1. 조회\t2. 글쓰기\t3. 종료");
			int input = Integer.parseInt(sc.nextLine());
			switch (input) {
			case 1:
				System.out.println("조회할 글 번호를 입력해주세요>");
				input = Integer.parseInt(sc.nextLine());
				if(table.get(0) == null) {
					System.out.println("조회할 수 있는 글이 없습니다.");
				}else {
					System.out.println("조회한 글의 내용 : " + table.get(input - 1).get("내용"));
					System.out.println("1. 수정\t2. 삭제\t3. 뒤로가기");
					int input2 = Integer.parseInt(sc.nextLine());
					switch (input2) {
					case 1:
						System.out.println("글쓰기 내용 : " + table.get(input - 1).get("내용"));
						boardWritting.remove("내용");
						System.out.println("수정 할 내용을 입력 해주세요>");
						String modify = sc.nextLine();
						boardWritting.put("제목", table.get(input - 1).get("제목"));
						boardWritting.put("작성자", table.get(input - 1).get("작성자"));
						boardWritting.put("내용", modify);
						boardWritting.put("작성일", day);
						table.set(input - 1, boardWritting);
						boardWritting = new HashMap<>();
						break;
					case 2:
						ArrayList<HashMap<String, String>> temp = new ArrayList<>();
						System.out.println("현재 글을 삭제하시겠습니까? 1. 예\t2. 아니요");
						int input3 = Integer.parseInt(sc.nextLine());
						if(input3 == 1) {
							for(int i = input; i < table.size(); i++) {
								temp.add(table.get(i));
							}
							for(int i = table.size() - 1; i >= input - 1; i--) {
								table.remove(i);
							}
							for(int i = 0; i < temp.size(); i++) {
								table.add(temp.get(i));
							}
						}else break;
						break;
					case 3:
						
						break;

					default:
						break;
					}
				}
				break;
			case 2:
				System.out.println("제목을 입력하세요>");
				String inputStr = sc.nextLine();
				boardWritting.put("제목", inputStr);

				System.out.println("작성자를 입력하세요>");
				inputStr = sc.nextLine();
				boardWritting.put("작성자", inputStr);
				
				System.out.println("내용을 입력하세요>");
				inputStr = sc.nextLine();
				boardWritting.put("내용", inputStr);
				
				boardWritting.put("작성일", day);
				
				table.add(boardWritting);
				
				System.out.println("글쓰기를 완료했습니다.");
				boardWritting = new HashMap<>();
				
				break;
			case 3:
				System.out.println("게시판을 종료합니다.");
				System.exit(3);
				break;

			default:
				break;
			}
			
		}
	}

}
