package h_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		/*
		 * 정규표현식 : 문자열의 패턴을 검사하는 표현식
		 * 
		 * ^	: 뒷 문자로 시작
		 * $	: 앞 문자로 종료
		 * .	: 임의의 문자(줄바꿈 제외)
		 * *	: 앞 문자가 0개 이상
		 * +	: 앞 문자가 1개 이상
		 * ?	: 앞 문자가 없거나 1개
		 * []	: 문자의 집합이나 범위([a-z] : a부터 z까지. [^a-z] : a부터 z가 아닌 것)
		 * {}	: 앞 문자의 개서({2} : 2개, {2,4} : 2개 이상 4개 이하)
		 * ()	: 그룹화(1개의 문자처럼 인식)
		 * |	: OR 연산
		 * \s	: 공백, 탭, 줄바꿈
		 * \S	: 공백, 탭, 줄바꿈이 아닌 문자
		 * \w	: 알파벳이나 숫자
		 * \W	: 알파벳이나 숫자가 아닌 문자
		 * \d	: 숫자
		 * \D	: 숫자가 아닌 문자
		 * (?!)	: 뒷 문자의 대소문자 구분 안함
		 * \	: 정규표현식에서 사용되는 특수문자 표현
		 */

		
//		String str = "abc123";
////		String regex = "[a-z]{3}[0-9]{1,3}";
////		String regex = "[a-z0-9]+";
////		String regex = "\\w*";
//		String regex = ". *";
//		
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(str);
//		System.out.println(m.matches());
		
		// 아이티, 전화번호, 이메일주소, 비밀번호의 유효성을 검사하는 정규표현식을 만들어주세요.
		String id = "ddsfj5832";
		String pwd = "qasAqds12!";
		String phone = "010-1234-5678";
		String email = "ehdehdwn131@gmail.com";
		
		String idRegex = "[a-zA-Z0-9]{6,10}[\\S]";
		String pwdRegex = "(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*<>])[a-zA-Z\\d!@#$%^&*<>]{8,}";  // ?= 전방 탐색 기호
		String phoneRegex = "[0-1]{3}-[0-9]{3,4}-[0-9]{4}";
		String emailRegex = "[a-zA-Z0-9]+@[\\w]+.[\\w]+";
		
		Pattern idPtn = Pattern.compile(idRegex);
		Matcher idMch = idPtn.matcher(id);
		System.out.println(idMch.matches());
	
		Pattern pwdPtn = Pattern.compile(pwdRegex);
		Matcher pwdMch = pwdPtn.matcher(pwd);
		System.out.println(pwdMch.matches());
		
		Pattern phonePtn = Pattern.compile(phoneRegex);
		Matcher phoneMch = phonePtn.matcher(phone);
		System.out.println(phoneMch.matches());
		
		Pattern emailPtn = Pattern.compile(emailRegex);
		Matcher emailMch = emailPtn.matcher(email);
		System.out.println(emailMch.matches());
		
		
		
		
		
		
		
		
	}

}
