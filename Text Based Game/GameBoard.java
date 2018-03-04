import java.util.ArrayList;
import java.util.List;

public class GameBoard {
	
	List<ArrayList<ArrayList<NamedThing>>> board;
	public GameBoard(int width, int height) {
		board = new ArrayList<ArrayList<ArrayList<NamedThing>>>();
		for(int h = 0; h < height; h++) {
			board.add(new ArrayList<ArrayList<NamedThing>>());
			for(int w = 0; w < width; w++) {
				board.get(h).add(new ArrayList<NamedThing>());
			}
		}
	}
	
	public List<ArrayList<ArrayList<NamedThing>>> getBoard() {
		return board;
	}
	
	public String printBoard() {
		String boardStr = "";
		for(int h = 0; h < board.size(); h++) {
			for(int w = 0; w < board.get(h).size(); w++) {
				if(board.get(h).get(w).isEmpty()) {
					boardStr += "    |";
				}
			}
		}
		return boardStr;
	}
}
