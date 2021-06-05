package Basic_Java;

enum GAME_DIFFICULTY{
	EASY,MEDIUM,HARD
}

public class Enumeration {

	public static void main(String[] args) {
		GAME_DIFFICULTY variable = GAME_DIFFICULTY.EASY;
		
		switch(variable) {
		case EASY:{
			System.out.println("You have selected easy mode.");
			break;
		}
		case MEDIUM:{
			System.out.println("You have selected medium mode.");
			break;
		}
		case HARD:{
			System.out.println("You have selected hard mode.");
			break; 	
		}
	}
		for(GAME_DIFFICULTY tempVariable: GAME_DIFFICULTY.values()) {
			System.out.println(tempVariable);
		}
}
}
