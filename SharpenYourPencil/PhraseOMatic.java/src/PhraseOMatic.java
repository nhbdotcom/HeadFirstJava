public class PhraseOMatic {
    public static void main(String[] args) {
        String[] firstWordList = {"Ace", "Buddy", "Champ", "Sunny", "Cookie", "Bear", "Sparky", "Tiny", "Shadow", "Rocket"};

        String[] secondWordList = {"compasionate", "adventurous", "creative", "honest", "emphatic", "determined", "optimistic", "charismatic", "resilient", "loyal", "curious"};

        String[] thirdWordList = {"Spirit", "Heart", "Soul", "Energy", "Vibe", "Essence", "Style", "Character", "Aspect", "Nature", "Quality"};

        int firstListLength = firstWordList.length;
        int secondListLength = secondWordList.length;
        int thirdListLength = thirdWordList.length;

        int rand1 = (int) (Math.random() * firstListLength);
        int rand2 = (int) (Math.random() * secondListLength);
        int rand3 = (int) (Math.random() * thirdListLength);

        String phrase = firstWordList[rand1] + " " + secondWordList[rand2] + " " + thirdWordList[rand3] + ".";

        System.out.println("What we need is a " + phrase.toLowerCase());
    }
}
