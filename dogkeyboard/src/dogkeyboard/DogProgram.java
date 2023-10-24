
package dogkeyboard;

public class dogProgram {

    public static void main(String[] args) {
        Dog theDog = new Dog();
        Keyboard kb = new Keyboard();
        
        theDog.setName(kb.getString("what is the Dog's name? > "));
        theDog.setGender(kb.getChar("what is " + theDog.getName() + " gender? > "));
        theDog.setAge(kb.getInt("how old is " + theDog.getName() + "? > "));
        theDog.setBreed(kb.getString("what is the " + theDog.getName() + " breed? > "));
        theDog.walkTheDog(kb.getDouble("How far did " + theDog.getName() + " walk today? >"));
        theDog.setNoOfLegs(kb.getInt("how many legs does " + theDog.getName() + " have? > "));
        theDog.setTrained(kb.getBool("is " + theDog.getName() + " trained? > "));
       
        theDog.displayDetails();

    }
    
}
