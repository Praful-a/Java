public class PhraseOMatic {
	public static void main (String[] args) {
		// make three sets of words to choose from. Add your own!
		String[] wordListOne = {"24/7", "multitier", "30,000 foot", 
			"B-to-B", "win-win", "front-end", "web-based", "pervise",
			"smart", "six-sigma", "critical-path", "dynamic"};

		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented",
				"centric", "distributed", "clustered", "branded", "outside-th-box",
				"positioned", "networked", "focused", "leveraged", "aligned",
				"targeted", "shared", "cooprative", "accelerated"};
		String[] wordListThree = {"process", "tipping-point", "solution", "architecture", 
				"core competency", "strategy", "mindshare", "portal", "space", "vision", 
				"paradigm", "mission"};

		// find out how many words are in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLenth = wordListThree.length;
		
		// generate three random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLenth);

		// now build a phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
	
		// print out the phrase
		System.out.println("What we need is a " + phrase);
	}
}