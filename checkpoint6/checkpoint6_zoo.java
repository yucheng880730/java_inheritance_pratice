//package animal;
import java.util.ArrayList;
import java.io.*;

public class checkpoint6_zoo {

    public static void main(String[] args){
        //Description: Name of the csv file.
        //String DATA = args[0];

        ArrayList<checkpoint6_terrestrialAnimals> land = new ArrayList<>();
        ArrayList<checkpoint6_aquatilia> water = new ArrayList<>();

        /*********************************The TODO This Time (Checkpoint3) ********************************
         * 
         * TODO(1): This time, you have to read in a csv file, then use checkans() method to check answer.
         * !!!IMPORTANT!!! Noted that if you change the name of a file, you may also need to check if the code that isn't marked as TODO 
         * needs to be modified as well. !!!IMPORTANT!!!
         * 
         **********************************The End of the TODO**************************************/

        /********************************************************************************************
         START OF YOUR CODE
         ********************************************************************************************/

        String filename = "C:\\Users\\yucheng\\Desktop\\java\\java_05\\creatures.csv";

        import_csv(filename, land, water);

        checkans(land, water);


        /********************************************************************************************
         END OF YOUR CODE
         ********************************************************************************************/
    }


    public static void import_csv(String filename,ArrayList<checkpoint6_terrestrialAnimals> land,ArrayList<checkpoint6_aquatilia> water){
        /*********************************The TODO This Time (Checkpoint3) ********************************
         * 
         * TODO(2): Here you have to read in the data and store them into the ArrayList. e.g: Frog is a terrestrial animal,
         * so it should be added to ArrayList named "land".
         * Hint1: Noted that you only need to record name,sound,consume, and speed.
         **********************************The End of the TODO**************************************/

        /********************************************************************************************
         START OF YOUR CODE
         ********************************************************************************************/

        try{
            BufferedReader isr = new BufferedReader(new FileReader("creatures.csv"));
            BufferedReader reader = new BufferedReader(isr);

            String line;

            while((line = reader.readLine()) != null){

                String item[] = line.split(",");

                String data1 = item[0].trim();
                String data2 = item[1].trim();
                String data3 = item[2].trim();
                String data4 = item[3].trim();
                String data5 = item[4].trim();
                //System.out.println(data1+"\t"+ data2+"\t"+ data3+"\n"+data4+"\n"+data5+"\n");


                if(data5.equals("terrestrial")){

                    checkpoint6_terrestrialAnimals terrestrialAnimals = new checkpoint6_terrestrialAnimals(data1, data2, data3, data4, data5);
                    terrestrialAnimals.name = data1;
                    terrestrialAnimals.sound = data2;
                    terrestrialAnimals.consume = data3;
                    terrestrialAnimals.speed = data4;
                    terrestrialAnimals.type = data5;
                    land.add(terrestrialAnimals);

                } else if(data5.equals("aquatic")){

                    checkpoint6_aquatilia aquatilia = new checkpoint6_aquatilia(data1, data2, data3, data4, data5);
                    aquatilia.name = data1;
                    aquatilia.sound = data2;
                    aquatilia.consume = data3;
                    aquatilia.speed = data4;
                    aquatilia.type = data5;
                    water.add(aquatilia);

                } else{

                }
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }


        /********************************************************************************************
         END OF YOUR CODE
         ********************************************************************************************/
    }

    //Check answer
    //Noted that if you change the filename, you may need to modified the following code.
    public static void checkans(ArrayList<checkpoint6_terrestrialAnimals> land,ArrayList<checkpoint6_aquatilia> water){

        land.get(0).give_birth(land.get(1));
        land.get(2).give_birth(water.get(1));
        land.get(3).give_birth();
        water.get(3).evolve();
        water.get(3).act();

    }

}

