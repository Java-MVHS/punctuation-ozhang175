/* Olivia Zhang
 * 12/10/24
 * Punctuation.java
 * 
 * This program takes in a paragraph and prints out all the words that have punctuation in it.
 * 
 * psudeocode:
 * main:
 * 	create instance of punctuation
 * 	call searchIt
 * 
 * searchIt():
 * 	declare result
 * 	set answer (call getPunctuationWords)
 * 	printWords(answer)
 * 
 * getPunctuationWords():
 * 	set paragraph as the paragraph !
 * 	declare punctWords, currentWord, currentChar
 *  for ..
 * 		set currentChar as the current character (charAt(i))
 * 		add the current character into the word
 * 			if the current character is a space 
 * 				if the word has punctuation, add it to the paragraph with just words with punctuation
 * 					currentWord = ""
 * 	return punctWords
 * 
 * checkForPunctuation(wordIn)
 * 	char c
 * 	for ..
 * 		c = current character
 * 		if c is punctuation
 * 			return wordIn
 * 	return empty string
 * 
 * printWords(answerIn)
 * 	print three lines
 * 	print the paragraph
 * 	print three lines
 * 	
 */
 
public class Punctuation
{
	public static void main (String[] args)
	{
		Punctuation p = new Punctuation(); // make instance of punctuation called p
		p.searchIt(); // use p to call searchIt
	}
	
	public void searchIt()
	{
		String answer; // result
		answer = getPunctuationWords(); // set answer as the paragraph with punctuation words
		printWords(answer); // print the result
	}
	
	public String getPunctuationWords()
	{
		String paragraph = new String("Blood, Sweat, and Tears by Winston Churchill " +
"May 13, 1940" +
"Mr. Speaker:" +
"On Friday evening last I received His Majesty’s commission to form a new " +
"Administration. It was the evident wish and will of Parliament and the nation that this should be conceived on the broadest possible basis and that it should include all parties, both those who supported the late Government and also the parties of the Opposition." +
"I have completed the most important part of this task. A War Cabinet has been formed of five Members, representing, with the Liberal Opposition, the unity of the nation. The three party Leaders have agreed to serve, either in the War Cabinet or in high executive office. The three Fighting Services have been filled. It was necessary that this should be done in one single day, on account of the extreme urgency and rigour of events. A number of other key positions were filled yesterday, and I am submitting a further list to His Majesty tonight. I hope to complete the appointment of the principal Ministers during tomorrow. The appointment of the other Ministers usually takes a little longer, but I trust that, when Parliament meets again, this part of my task will be completed, and that the Administration will be complete in all respects." +
"Sir, I considered it in the public interest to suggest that the House should be summoned to meet today. Mr. Speaker agreed and took the necessary steps, in accordance with the powers conferred upon him by the Resolution of the House. At the end of the proceedings today, the Adjournment of the House will be proposed until Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The business to be considered during that week will be notified to Members at the earliest opportunity. I now invite the House, by the Resolution which stands in my name, to record its approval of the steps taken and to declare its confidence in the newGovernment." +
"Sir, to form an Administration of this scale and complexity is a serious undertaking in itself, but it must be remembered that we are in the preliminary stage of one of the greatest battles in history, that we are in action at many points in Norway and in Holland, that we have to be prepared in the Mediterranean, that the air battle is continuous and that many preparations have to be made here at home. In this crisis I hope I may be pardoned if I do not address the House at any length today. I hope that any of my friends and colleagues, or former colleagues, who are affected by the political reconstruction, will make all allowances for any lack of ceremony with which it has been necessary to act. I would say to the House, as I said to those who’ve joined this government: \"I have nothing to offer but blood, toil, tears and sweat.\"" +
"We have before us an ordeal of the most grievous kind. We have before us many, many long months of struggle and of suffering. You ask, what is our policy? I will say: It is to wage war, by sea, land and air, with all our might and with all the strength that God can give us; to wage war against a monstrous tyranny, never surpassed in the dark and lamentable catalogue of human crime. That is our policy. You ask, what is our aim? I can answer in one word: victory. Victory at all costs, victory in spite of all terror, victory, however long and hard the road may be; for without victory, there is no survival. Let that be realised; no survival for the British Empire, no survival for all that the British Empire has stood for, no survival for the urge and impulse of the ages, that mankind will move forward towards its goal. " +
"But I take up my task with buoyancy and hope. I feel sure that our cause will not be suffered to fail among men. At this time I feel entitled to claim the aid of all, and I say, \"Come then, let us go forward together with our united strength.\""); 
		// set paragraph as the paragraph !
		String punctWords = new String(""); // paragraph of words w/ punctuation
		String currentWord = new String(""); // current word searched through
		char currentChar = 'l'; // current character

		for (int i = 0; i < paragraph.length(); i++)
		{
			currentChar = paragraph.charAt(i); // set currentChar as the current character 
			currentWord += currentChar; // add the character into the current word
			
			if (currentChar == ' ') // if the character is a space, that's the end of the word !
			{
				punctWords += checkForPunctuation(currentWord); // if the word has punctuation, add it to punctWords
				currentWord = ""; // reset currentword
			}
		}
		return punctWords; // return the paragraph w just words w punctuation
	}
	
	public String checkForPunctuation(String wordIn)
	{
		char c; // current character
		for (int i = 0; i < wordIn.length(); i++) // sift through the current word and check for punctuation
		{
			c = wordIn.charAt(i); 
			if (c == '.' || c == ',' || c == ';' || c == ':' || c == '!' || c == '?' || c == '\'' || c == '"' || c == '(' || c == ')' || c == '-')
			{
				return wordIn; // if the current character is punctuation, return the word
			}
		}
		return ""; // if no punctuation, return an empty string
	}
	
	public void printWords (String answerIn)
	{
		System.out.print("\n\n\n");
		System.out.println(answerIn); // print the pagagraph
		System.out.print("\n\n\n");
	}
}
