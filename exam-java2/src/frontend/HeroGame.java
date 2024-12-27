package frontend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import backend.PlayerDAOImp;
import entity.Connect;
import entity.National;
import entity.Player;

public class HeroGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int choice;
		int playerId;
		String playerName;
		int highScore;
		int level;
		int nationalId;
		String nationalName;
		PlayerDAOImp test = new PlayerDAOImp();
		
		do {
			printMenu();
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter National Id: ");
				nationalId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Player's Name: ");
				playerName = scanner.nextLine();
				System.out.println("Enter High Score: ");
				highScore = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Level: ");
				level = scanner.nextInt();
				scanner.nextLine();
				Player player = new Player(nationalId, playerName, highScore, level);
				test.insertPlayer(player);
				break;
			case 2:
				System.out.println("Enter National Id: ");
				nationalId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter National's Name: ");
				nationalName = scanner.nextLine();
				National national = new National(nationalId, nationalName);
				test.addNational(national);
				break;
			case 3: 
				String sqlshowdata = "SELECT * FROM herogame.player inner join herogame.national on"
						+ " herogame.player.NationalId = herogame.national.NationalId;";
				try {
				Connection ketnoi = Connect.getConnection();
					PreparedStatement statement = ketnoi.prepareStatement(sqlshowdata);
					ResultSet ketqua = statement.executeQuery();
					while (ketqua.next()) {
						 playerId = ketqua.getInt("PlayerId");
						playerName = ketqua.getString("PlayerName");
						 nationalId = ketqua.getInt("NationalId");
						 nationalName = ketqua.getString("NationalName");
						 highScore = ketqua.getInt("HighScore");
						level = ketqua.getInt("Level");
						Player playerShow = new Player(playerId, nationalId, playerName, highScore, level, nationalName);
						playerShow.displayAll();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 4:
				System.out.println("Enter Player's Name to find: ");
				String nameToFind = scanner.nextLine();
				displayAllByPlayerName(nameToFind);
				break;
			case 5:
				displayTop10();
				break;
			case 6:
				System.out.println("Enter id of player you want to delete: ");
				int idToDelete = scanner.nextInt();
				scanner.nextLine();
				test.deletePlayer(idToDelete);
				break;
				
			default:
				break;
			}
		} while (choice != 0);
	}
	public static void printMenu() {
		System.out.println("-----Hero Game Program -----");
		System.out.println("1. Create Player.");
		System.out.println("2. Create National.");
		System.out.println("3. Show All Players.");
		System.out.println("4. Find Player By Name.");
		System.out.println("5. Show Top 10 High Score.");
		System.out.println("6. Delete Player.");
		System.out.println("0. Exit.");
	}
	public static void displayAllByPlayerName (String nameToFind) {
		String sqlfindbyname = "SELECT * FROM herogame.player inner join herogame.national on"
				+ " herogame.player.NationalId = herogame.national.NationalId where PlayerName =?;";
		try {
			Connection ketnoi = Connect.getConnection();
				PreparedStatement statement = ketnoi.prepareStatement(sqlfindbyname);
				statement.setString(1, nameToFind);
				ResultSet ketqua = statement.executeQuery();
				while (ketqua.next()) {
					int playerId = ketqua.getInt("PlayerId");
					String playerName = ketqua.getString("PlayerName");
					int nationalId = ketqua.getInt("NationalId");
					String nationalName = ketqua.getString("NationalName");
					int highScore = ketqua.getInt("HighScore");
					int level = ketqua.getInt("Level");
					Player playerShow = new Player(playerId, nationalId, playerName, highScore, level, nationalName);
					playerShow.displayAll();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static void displayTop10() {
		String sqlshowdata = "SELECT * FROM herogame.player inner join herogame.national on"
				+ " herogame.player.NationalId = herogame.national.NationalId"
				+ " ORDER BY HighScore DESC LIMIT 10;";
		try {
		Connection ketnoi = Connect.getConnection();
			PreparedStatement statement = ketnoi.prepareStatement(sqlshowdata);
			ResultSet ketqua = statement.executeQuery();
			while (ketqua.next()) {
				int playerId = ketqua.getInt("PlayerId");
				String playerName = ketqua.getString("PlayerName");
				int nationalId = ketqua.getInt("NationalId");
				String nationalName = ketqua.getString("NationalName");
				int highScore = ketqua.getInt("HighScore");
				int level = ketqua.getInt("Level");
				Player playerShow = new Player(playerId, nationalId, playerName, highScore, level, nationalName);
				playerShow.displayAll();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
