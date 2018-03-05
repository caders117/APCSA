import java.util.ArrayList;
import java.util.List;

public class GameBoard {
	
	static String bird = "\uD83D\uDC26";
	
	
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
		for(NamedThing thing : things) {
			int itemX = thing.getX();
			int itemY = thing.getY();
			this.getBoard().get(itemY).get(itemX).add(thing);
		}
	}
	
	public String contentsOfPos(int x, int y) {
		String contentStr = "Contents of position (" + x + ", " + y + "):\n";
		NamedThing contentObj;
		if(!getBoard().get(y).get(x).isEmpty()) {
			 for(int i = 0; i < getBoard().get(y).get(x).size(); i++) {
			 	contentObj = getBoard().get(y).get(x).get(i);
			 	if(contentObj.isEnabled())
			 		contentStr += contentObj.toString() + "\n";
			 }
		} else {
			contentStr = "There is nothing at position (" + x + ", " + y + ")\n"; 
		}
		return contentStr;
	}
	
	public List<ArrayList<ArrayList<NamedThing>>> getBoard() {
		return board;
	}
	
	public String printBoard() {
		String boardStr = "";
		
		// Top Border
		boardStr += "  ";
		for(int w = 0; w < board.get(0).size(); w++) {
			boardStr += "  " + w + "  ";
		}
		boardStr += "\n";
		boardStr += "  +";
		for(int w = 0; w < board.get(0).size(); w++) {
			boardStr += "-----+";
		}
		boardStr += "\n";
		
		
		//Rest of Board
		for(int h = 0; h < board.size(); h++) {
			
			// Vertical seperator
			boardStr += h + " |";
			for(int w = 0; w < board.get(h).size(); w++) {
				if(board.get(h).get(w).isEmpty()) {
					boardStr += "     |";
				} else {
					boolean added = false;
					for(int i = 0; i < board.get(h).get(w).size(); i++) {
						if(board.get(h).get(w).get(i).isEnabled()) {
							boardStr += "  " + board.get(h).get(w).get(0).getName().charAt(i) + "  |";
							added = true;
							break;
						}
					}
					if(!added)
						boardStr += "     |";
				}
			}
			boardStr += "\n  +";
			
			// Horizontal row between cells
			for(int w = 0; w < board.get(h).size(); w++) {
				boardStr += "-----+";
			}
			boardStr += "\n";
		}
		return boardStr;
	}
}
