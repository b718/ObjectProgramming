import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
    private String guesses,word;

    //Constructor
    public Puzzle(){
        this.word = "smallman";
        this.guesses = "";
    }

    // public Puzzle(Puzzle p){ //copy
    //   this.word = p.word;
    // }

    //Accesor
    public String getWord(){

        return this.word;
    }

    public boolean makeGuess(String a){

        guesses += a;
        if(word.contains(a)){

            return true;
        }else{
            //System.out.println("Guesses: " + guesses + ",");

            return false;

        }
    }

    public boolean isUnsolved(){
        boolean b = false;
        for(int i = 0; i < word.length(); i++ ) {
            String letter = word.substring(i, i+1);
            if (!this.guesses.contains(letter)) {
                b = true;
            }
        }
        return b;
    }

    public void show(){
        for(int i = 0; i < word.length(); i++){
            
                if(guesses.contains(word.substring(i,i+1))){
                    System.out.print(word.substring(i,i+1));
                }else{

                    System.out.print("_");
                }
            }

        

        //System.out.println("Hangman Puzzle: " + word);
        System.out.println(" ");
        System.out.print("Guesses : ");
        //System.out.println("Guesses: " + guesses + ",");
        for(int j = 0; j < guesses.length(); j++) {
            String letter = guesses.substring(j,j+1);
            System.out.print(letter + ", ");
        }
        
        //System.out.println("");
    }
}
