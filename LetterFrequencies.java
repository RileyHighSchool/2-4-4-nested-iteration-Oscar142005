/*
 * Activity 2.4.4
 */
import java.util.Scanner;

public class LetterFrequencies
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a string ");

		String letters = "abcdefghijklmnopqrstuvwxyz"; 
		String phrase = sc.nextLine();

		phrase = phrase.toLowerCase();

		System.out.println("The following shows the letter frequencies for the phrase");

    /* your code here */
	for (int i = 0; i < 26 ; i++){
		String letter = letters.substring(i, i+1);

	int count = 0;
	for (int inner = 0; inner < phrase.length(); inner++){
		String phraseLet = phrase.substring(inner, inner +1);

		if (letter.equals(phraseLet)){
			count++;
		}
	}
	System.out.println(letter + " appers " + count + " time(s); ");


	}
	//Loop to iterate through the alphabet (the outer loop)
	//Loop to iterate through all the letters of a phrase (the inner loop)
	//Counter variable to count the number of times a letter is in the phrase
	//Print statement to display the frequencies
	}
}
