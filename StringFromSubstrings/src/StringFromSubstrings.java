import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class StringFromSubstrings {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> myStack = new Stack<Integer>();
		int num;
		String answer = "";
		
		String source = scan.nextLine();
		source = source.replace(']', '[');
		String[] subs = source.split("\\[");
		for(String sub:subs) {
			System.out.println(sub);
			Boolean flag = sub.chars().allMatch(Character::isDigit);
			if(flag) {
				num = Integer.parseInt(sub);
				// String.valueOf(sub.charAt(i)));
				myStack.push(num);
				System.out.println("The stack elements are: " + myStack);
				} else {
					answer = answer + sub;
					if(!myStack.isEmpty()) {
						num = myStack.pop();
						// char[] chars = new char[num];
						// Arrays.fill(chars, sub.charAt(i));
						// System.out.println(String.valueOf(chars));
						answer  = String.join("", Collections.nCopies(num, sub));
					}
					System.out.println(answer);

				}
				
			}
		System.out.println(Arrays.toString(subs));
		scan.close();
	}

}
