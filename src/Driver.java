import java.util.InputMismatchException;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		GameLogic game = new GameLogic(new ConsoleInputOutput());
		game.play();
		}catch (CustomException e) {
			System.out.println(e.getLocalizedMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Input Missmatch Exception");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out of Bound Exception");
		}
		catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
