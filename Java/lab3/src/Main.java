package lab3.src;

import lab3.src.based.*;
import lab3.src.creatures.Devil;
import lab3.src.creatures.Monster;
import lab3.src.creatures.Phantom;
import lab3.src.enums.Adjectives;
import lab3.src.enums.Climate;
import lab3.src.enums.Relations;
import lab3.src.helper.Printer;
import lab3.src.locations.*;


public class Main {

    public static void main(String[] args) {


        Sight sight = new Sight(Adjectives.SCARY);

        Impression impression = new Impression(sight);
        impression.setDescribed(false);

        Printer.print(impression, sight);


        Nature nature = new Nature();
        nature.generateLaws();
        Devil devil = new Devil(nature);
        devil.destroyLaws();

        Printer.print(devil);


        Humanity humanity = new Humanity(1000);
        humanity.setAppeared(false);
        Time BeforeHumans = new Time(500000, Relations.BEFORE.text(), humanity);

        StoneJungles stoneJungles = new StoneJungles(Adjectives.ARTIFICAL);

        Plateau plateau = new Plateau.PlateauBuilder()
                .description(Adjectives.ANCIENT, Adjectives.COLD)
                .fromTime(BeforeHumans)
                .height(20000)
                .innerPlace(stoneJungles)
                .unit("feet at sea level")
                .climate(Climate.NOT_FOR_LIVE)
                .build();

        Printer.print(plateau);
        plateau.hasInsideStoneJungles();


        Nature notCreator = new Nature();
        MedievalBuildings buildings = new MedievalBuildings("Cubes and castle's Walls", notCreator);
        Thought thought = new Thought(buildings);
        humanity.setThought(thought);
        Time before = new Time(0, Relations.BEFORE.text() );
        humanity.think(before);


        Continent continent = new Continent("Continent", Climate.FOREVER_COLD);
        Time whenColdhasStarted = new Time(Relations.WHEN.text(), continent);
        humanity.isSimilarSpecificTime(whenColdhasStarted);

        Thing powerOfMind = new Thing("Power Of Mind");
        Thought thoughtAboutPowerOfMind = new Thought(powerOfMind);
        thoughtAboutPowerOfMind.setDoubts(true);



        Nature trueNature = new Nature();
        trueNature.setTruth(true);
        Maze maze = new Maze("Maze", trueNature, Adjectives.GIANT);
        maze.generate();

        System.out.println(maze.giveOpinion());


        Thought thoughtAboutMaze = new Thought(maze);


        Town oldTown = new Town(Adjectives.SCARY, Adjectives.OLD);
        Time oldTimes = new Time(Relations.BEFORE.text(),oldTown);
        Town townNow = new Town(Adjectives.SCARY);
        oldTimes.getObject().equals(townNow);
        Thing reality = new Thing("Reality", Adjectives.OBJECTIVE,Adjectives.INESCAPABLE);


        Thing justification = new Thing("Justification", Adjectives.OBJECTIVE);
        Thought obsession = new Thought("obsession", justification);
        Thing dust = new Thing("Dust", Adjectives.COLD);
        Cloud clouds = new Cloud("clouds", dust);
        Monster monster = new Monster("Monster", Adjectives.STONE, Adjectives.OLD);

        monster.beNoticedInSpesificPlace(new MountainRange("Mountains"));


        Phantom strangePhantom = new Phantom("Strange Phantom");

        Phantom originalPhantom = new Phantom("Original Phantom");

        strangePhantom.equals(originalPhantom);

        //reality > dream (scariest)
        Dream dream = new Dream("dream");
        // dream is less scariest   is less dangerous
        dream.DifferenceSpecificThing(reality);

    }
}
