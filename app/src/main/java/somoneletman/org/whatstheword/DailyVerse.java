package somoneletman.org.whatstheword;

import java.util.Random;

public class DailyVerse {

    private String[] dailyVerse = new String[]{
            "The Lord is not slow in keeping his promise, as some understand slowness. Instead he is patient with you, not wanting anyone to perish, but everyone to come to repentance. - 2 Peter 3:9",
            "Many are the plans in a person’s heart,but it is the Lord’s purpose that prevails. - Proverbs 19:21",
            "Commit your work to the Lord, and your plans will be established. - Proverbs 16:3",
            "For I know the plans I have for you,” declares the LORD, “plans to prosper you and not to harm you, plans to give you hope and a future. - Jeremiah 29:11",
            "I can do all this through him who gives me strength. - Philippians 4:13",
            "For God so loved the world that he gave his one and only Son, that whoever believes in him shall not perish but have eternal life. - John 3:16",
            "And we know that in all things God works for the good of those who love him, who have been called according to his purpose. - Romans 8:28",
            "So do not fear, for I am with you; do not be dismayed, for I am your God. I will strengthen you and help you; I will uphold you with my righteous right hand. - Isaiah 41:10",
            "Trust in the LORD with all your heart and lean not on your own understanding; in all your ways submit to Him, and he will make your paths straight. - Proverbs 3:5-6",
            "Start children off on the way they should go, and even when they are old they will not turn from it. - Proverbs 22:6",
            "But the fruit of the Spirit is love, joy, peace, forbearance, kindness, goodness, faithfulness - Galations 5:22"


    };

    public String getVerse(){
        String verse = "";
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(dailyVerse.length);
        verse = dailyVerse[randomNumber];

        return verse;
    }


}
