import java.util.Scanner;
public class ModifySentence {
public static void main(String args[])
{
	int position,count=0;	
	String sentence=new String();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a sentence");
	sentence=sc.nextLine();
	System.out.println("Word to be deleted:");
	String wordDelete=new String();
	wordDelete=sc.nextLine();
	System.out.println("Word position in the sentence:");
	position=sc.nextInt();
	int len = sentence.length();
	for (int i = 0; i < len; i++) {
		if (sentence.charAt(i) == ' ')
			count++;
		if (count == position) {
			sentence = sentence.replace(wordDelete," ");
			break;
		}
	}
    sentence=sentence.replaceAll("( )+"," ");
    System.out.println(sentence);
}
}