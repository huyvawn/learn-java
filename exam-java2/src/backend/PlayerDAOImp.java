package backend;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entity.Connect;
import entity.National;
import entity.Player;

public class PlayerDAOImp implements PlayerDAO {

	@Override
	public void insertPlayer(Player player) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO herogame.player (NationalId, PlayerName, HighScore, Level) VALUES (?, ?, ?, ?);";
        try (Connection connection = Connect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, player.getNationalId());
            preparedStatement.setString(2, player.getPlayerName());
            preparedStatement.setInt(3, player.getHighScore());
            preparedStatement.setInt(4, player.getLevel());
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Added player successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error : " + e.getMessage());
        }	
	}

	@Override
	public void deletePlayer(int id) {
		// TODO Auto-generated method stub
		 String sql = "DELETE FROM herogame.player WHERE PlayerId = ?";
		    try (Connection connection = Connect.getConnection();
		         PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
		        preparedStatement.setInt(1, id);
		        int rowsDeleted = preparedStatement.executeUpdate();
		        if (rowsDeleted > 0) {
		            System.out.println("Delete successfully!");
		        } else {
		            System.out.println("Could not find id.");
		        }
		    } catch (Exception e) {
		        System.out.println("Error: " + e.getMessage());
		    }
	}

	@Override
	public void addNational(National national) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO herogame.national (NationalId,NationalName) VALUES (?, ?);";
        try (Connection connection = Connect.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, national.getNationalId());
            preparedStatement.setString(2, national.getNationalName());
            int rowsInserted = preparedStatement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Added National successfully!");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }	
	}

	@Override
	public void deleteNational(int id) {
		// TODO Auto-generated method stub
		
	}

}
