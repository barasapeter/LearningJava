public class RandomPhraseGenerator {

    public static void main(String[] args) {
        String[] wordListOne = { "man", "woman", "child", "aunt", "monkey" };

        int randomIndex = (int)(Math.random()*wordListOne.length);
        
        System.out.println(wordListOne[randomIndex]);
        
    }

}
