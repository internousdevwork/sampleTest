package codeGolf;

public class CodeGolf {

	/*
	 * コードの内容
	 * 1～100の数字をコンソールに出力するソースコードを作成して下さい。
	 * ただし3の倍数はFizzを5の倍数はBuzzを表示してください
	 */
	public static void main(String[] args) {
		for (int i=1; i<=100; i++) {
			if(i % 3 == 0 && i % 5 == 0){
				System.out.println("FizzBuzz");
			}else if(i % 3 == 0){
				System.out.println("Fizz");
			}else if(i % 5 == 0){
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
		}
	}
}
