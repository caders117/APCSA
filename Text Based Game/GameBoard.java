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
	
	public void updateBoard(ArrayList<NamedThing> things) {
		for(int i = 0; i < this.getBoard().size(); i++)
			for(int j = 0; j < this.getBoard().get(i).size(); j++)
				this.getBoard().get(i).get(j).clear();
		for(int i = 0; i < things.size(); i++) {
			int itemX = things.get(i).getX();
			int itemY = things.get(i).getY();
			NamedThing thing = things.get(i);
			this.getBoard().get(itemY).get(itemX).add(thing);
		}
	}
	
	public String contentsOfPos(GameBoard board, int x, int y) {
		String contentStr = "Contents of position (" + x + ", " + y + "):\n";
		NamedThing contentObj;
		for(int i = 0; i < board.getBoard().get(y).get(x).size(); i++) {
			contentObj = board.getBoard().get(y).get(x).get(i);
			contentStr += contentObj.toString() + "\n";
		}
		return contentStr;
	}
	
	public List<ArrayList<ArrayList<NamedThing>>> getBoard() {
		return board;
	}
	
	public String printBoard() {
		String boardStr = "";
		
		// Top Border
		boardStr += "+";
		for(int w = 0; w < board.get(0).size(); w++) {
			boardStr += "----+";
		}
		boardStr += "\n";
		
		//Rest of Board
		for(int h = 0; h < board.size(); h++) {
			
			// Vertical seperator
			boardStr += "|";
			for(int w = 0; w < board.get(h).size(); w++) {
				if(board.get(h).get(w).isEmpty()) {
					boardStr += "    |";
				}
			}
			boardStr += "\n+";
			
			// Horizontal row between cells
			for(int w = 0; w < board.get(h).size(); w++) {
				if(board.get(h).get(w).isEmpty()) {
					boardStr += "----+";
				}
			}
			boardStr += "\n";
		}
		return boardStr;
	}
}
