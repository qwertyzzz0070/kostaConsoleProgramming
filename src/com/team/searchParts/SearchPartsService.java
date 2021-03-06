package com.team.searchParts;

import java.util.Map;
import java.util.Scanner;

import com.team.util.Service;

public class SearchPartsService implements Service {

	@Override
	public void exec(Scanner scan, String id , Map<Integer,Integer> map) {
		// TODO Auto-generated method stub
		Service service = null;
		boolean check = true;
		while (check) {
			System.out.println("--------------------");
			System.out.println("1. 가격으로 검색 ");
			System.out.println("2. 제조사별 검색 ");
			System.out.println("3. 제품이름으로 검색 ");
			System.out.println("4. 뒤로가기");
			System.out.println("--------------------");
			System.out.print("선택 : ");
			int select = scan.nextInt();
			scan.nextLine();

			switch (select) {
			case 1:
				service = new SearchOfPriceService();
				service.exec(scan, id , map);
				break;
			case 2:
				service = new SearchOfCompanyService();
				service.exec(scan, id, map);
				break;
			case 3:
				service = new SearchOfNameService();
				service.exec(scan, id, map);
				break;

			case 4:
				check = false;
				break;

			default:
				System.out.println("잘못된 숫자를 입력하셨습니다 .\n다시입력해 주세요");
				
				break;
			}
			System.out.println();
		}
	}

}
