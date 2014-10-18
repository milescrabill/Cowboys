
public class TieGuy extends Shooter {

	public String play(String mine, String other){
		if(mine.equals("")){ return "R"; } //Always reload the first move
		
    char myLastMove = mine.charAt(mine.length() - 1);
    char hisLastMove = other.charAt(mine.length() - 1);

    int myRCount = mine.length() - mine.replace("R", "").length();
    int hisRCount = other.length() - other.replace("R", "").length();
    int mySCount = mine.length() - mine.replace("S", "").length();
    int hisSCount = other.length() - other.replace("S", "").length();
    int myBullets = myRCount - mySCount;
    int hisBullets = hisRCount - hisSCount;

    if (myBullets > 5 && hisBullets == 0) {return "S";}
    else if (hisBullets == 0) {return "R";}
    else if (hisBullets < 6) {return "B";}
    else {return "S";}
  }
}