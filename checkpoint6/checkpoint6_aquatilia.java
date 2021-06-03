//package animal;
public class checkpoint6_aquatilia extends checkpoint6_creatures implements checkpoint6_behavior {

    public checkpoint6_aquatilia(String name,String sound,String consume,String speed,String type){

        /*********************************The TODO This Time (Checkpoint6) ********************************
         * 
         * TODO(6): Here you have to finish the constructor upon giving the parameters.
         * 
         **********************************The End of the TODO**************************************/
        /********************************************************************************************
         START OF YOUR CODE
         ********************************************************************************************/

        super(name, sound, consume, speed, type);

        /********************************************************************************************
         END OF YOUR CODE
         ********************************************************************************************/

    }
        /*********************************The TODO This Time (Checkpoint6) ********************************
         * 
         * TODO(7): Here you have to implement the inherited method move(),speak(), and feed().
         * Hint1: For a aquatilia, you should print out "I can swim!" upon the move() method is called. (USE println)
         * Hint2: For a aquatilia, you should print out the sound that specify in the csv file upon the speak() method is called. (USE println)
         * Hint3: For a aquatilia, you should print out the consume in the csv file upon the feed() method is called. (USE println)
         * e.g: As for a duck, "move()" ----> I can swim!
         *                      "speak()" ----> HONK!!!
         *                      "feed()"  ----> idk
         **********************************The End of the TODO**************************************/

        /********************************************************************************************
         START OF YOUR CODE
         ********************************************************************************************/

    public void move(){

        System.out.println("I can swim!");

    }

    public void speak(){

        System.out.println(this.sound);

    }

    public void feed(){

        System.out.println(this.consume);

    }


        /********************************************************************************************
         END OF YOUR CODE
         ********************************************************************************************/

        /*********************************The TODO This Time (Checkpoint6) ********************************
         * 
         * TODO(8): Here you have to implement the inherited abstract method evolve().
         * Hint1: For a aquatilia, you should change the name of the creature to "name of the creature,The superior".
         * e.g: As for a duck, after "evolve()",duck.name="duck,The superior"
         **********************************The End of the TODO**************************************/

        /********************************************************************************************
         START OF YOUR CODE
         ********************************************************************************************/

    public void evolve(){

        System.out.println(this.name + ",The superior:");

    }
        
        /********************************************************************************************
         END OF YOUR CODE
         ********************************************************************************************/
        public void act(){

            System.out.println(this.name+":");
            speak();
            feed();
            move();
            System.out.println("----------");

        }


}
