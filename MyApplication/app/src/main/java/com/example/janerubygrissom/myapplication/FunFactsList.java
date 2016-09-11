package com.example.janerubygrissom.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class FunFactsList extends AppCompatActivity {

    ListView funList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts_list);

        funList = (ListView) findViewById(R.id.facts_list);




        FunFactAdapter adapter = new FunFactAdapter(this,getFactsList());

        funList.setAdapter(adapter);



    }

    public ArrayList<FunFacts> getFactsList(){
        // let's make a list
        ArrayList<FunFacts> FactsList = new ArrayList<>();

        FunFacts factoid = new FunFacts("1. Diamond worked in the family business growing up", "The son of Jewish immigrants, he helped out at the family’s dry goods store in Brooklyn’s Coney Island neighborhood. His parents thought that working in the store would keep young Neil out of trouble and away from gangs. “I had to come home from school and go to the shop and work until it closed, which limited the amount of exposure I had to bad elements in the street,” he told the Financial Times. “It probably saved me.");
        FunFacts factoid1 = new FunFacts("2. Diamond went to high school with Barbra Streisand.", "The two were both students at Brooklyn’s Erasmus Hall High School. Years later, the pair shared a number-one hit with their duet “You Don’t Bring Me Flowers” in 1978. He joined the school’s chorus because “I thought it was a great place to meet girls,” he told Billboard. Other famous attendees of Erasmus Hall include actor Eli Wallach, opera singer Beverly Sills and author Mickey Spillane. Diamond later transferred to another school in Brooklyn, graduating from Abraham Lincoln High School in 1958.");
        FunFacts factoid2 = new FunFacts("3. Instead of being a pop star, Diamond could have been a fencer or a doctor.", "He earned a fencing scholarship to New York University where he took pre-med courses. Diamond told Rolling Stone that “I suppose if I were able to earn a living through fencing, I might have chosen that, because that also had its way to vent the emotional side of me.” But fortunately for the rest of the world, Diamond discovered that he expressed his feelings better through song.");
        FunFacts factoid3 = new FunFacts("4. Diamond considered using a different name.", "Born Neil Leslie Diamond, he toyed with two other names for his stage persona. He wrote on Reddit that he thought his real name was “pretty boring” and his first name “was the one the kids around the street made fun of.” The two other contenders were “Noah Kaminsky” because Diamond thought it “had biblical underpinings and great character” and “Ice Charry” because it was “pure rock & roll.” He was later given the nickname “the Jewish Elvis” for his performance style. ");
        FunFacts factoid4 = new FunFacts("5. “Sweet Caroline” isn’t really an ode to Caroline Kennedy.", "The story goes that Diamond penned the song with President John F. Kennedy’s daughter in mind. But someone closer to him actually spurred him on to write one of his most popular songs. Diamond told Today that \"I was writing a song in Memphis, Tennessee, for a session. I needed a three-syllable name. The song was about my wife.” His wife at the time was named Marcia, which just wasn’t as catchy of a name as Caroline in the songwriter’s mind.");
        FunFacts factoid5 = new FunFacts("6. Diamond is one of pop’s most melancholy souls.", "He once told a reporter for the Telegraph that “I make this journey, for the most part, alone.” In the song, “I Am . . . I Said,” which he told Rolling Stone was “autobiographical,” he described himself as having “an emptiness deep inside” and being “lost between two shores.” An interviewer with the Guardian newspaper even once described him as “the Eeyore of the slide guitar,” comparing him to Winnie the Pooh’s perennially glum pal. The trice-married Diamond may know a lot about “Love on the Rocks,” but he seems much more upbeat since tying the knot with third wife Katie McNeil in 2012. “I’ve found the woman of my dreams,” he told Parade magazine.");
        FunFacts factoid6 = new FunFacts("7. Despite all of his enduring popularity, Diamond has only won one Grammy Award.", "He picked up the honor in 1973 for best original score for the soundtrack to Jonathan Livingston Seagull, a film based on the Richard Bach book. While the movie was largely panned, the soundtrack proved to be a huge success. The soundtrack earned $12 million, easily surpassing the roughly $2 million the film made at the box office, according to Rolling Stone magazine.");


        FactsList.add(factoid);
        FactsList.add(factoid1);
        FactsList.add(factoid2);
        FactsList.add(factoid3);
        FactsList.add(factoid4);
        FactsList.add(factoid5);
        FactsList.add(factoid6);

        return FactsList;
    }


}
