package ws2021.section_f.simple_functions_2;

import java.util.Scanner;

// This works in an IDE; but not in moodle, for some reason.

public class Hangman {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word to guess: ");
		String word = sc.next();
		word = addSpaces(word);
		for(int i = 0; i<20; i++) System.out.println();

		String guessedChars = " ";
		String hidden = hideCharacters(word, guessedChars);
		int turns = 0;
		int lives = 7;
		
		while(lives > 0 && hidden != word) {
			System.out.println(hidden);
			System.out.println("Lives left: " + lives);
			System.out.println("GuessedCharacters:" + guessedChars);
			
			String guess = getGuess(sc, guessedChars).toLowerCase();
			guessedChars += getUpperLower(guess);
			if(!word.toLowerCase().contains(guess)) lives--;
			hidden = hideCharacters(word, guessedChars);
			turns++;
		}
		printEndMessage(word, turns, lives);


		sc.close();
		
	}

    public static String addSpaces(String word) {
        return word.replaceAll(".", " $0");
    } 

    public static String hideCharacters (String word, String guessedChars) {
        return word.replaceAll("([^" + guessedChars + "])", "_");
    }

    public static String getGuess(Scanner sc, String guessedChars) {
        System.out.printf("Guess: ");
        String character = sc.next();

        while (character.length() > 1 || (guessedChars != " " && guessedChars.contains(character)) ) {
            System.out.printf("Guess again: ");
            character = sc.next();
        }

        return character;
    }


    public static String getUpperLower(String character){
        String result = character.toUpperCase() + character.toLowerCase();
        return result;
    }

    public static void printEndMessage(String word, int turns, int lives) {
        if(lives > 0) {
            System.out.printf("You WON in %d turns with %d lives left!\n", turns, lives);
        } else {
            System.out.printf("You LOSE! No lives are left.\n");
        }
        
        System.out.printf("The word was:%s", word);
    }
}
