package backend;

import entity.National;
import entity.Player;

public interface PlayerDAO {
	public void insertPlayer(Player player);
	public void deletePlayer(int id);
	public void addNational (National national);
	public void deleteNational(int id);
}
