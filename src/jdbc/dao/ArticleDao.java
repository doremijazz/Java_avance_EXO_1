package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.model.Article;

public class ArticleDao extends Dao {
	
	public boolean create(Article article) {
		return true;
	}
	
	public Article read(int id) {
		String sql = "SELECT idArticle, Description, Brand, UnitatyPrice FROM t_articles WHERE idArticle = ?";
		try(Connection connection = getconnection();
				PreparedStatement statement = connection.prepareStatement(sql)){
			statement.setInt(1, id);
			
			try(ResultSet result = statement.executeQuery()){
				if (result.next()) {
					return createArticleFromResult(result);
				}
			}
		}catch (SQLException exception) {
			System.err.println("Erreur lors d ela lecture de l'article : " + exception.getMessage());
		}
	}

	private Article createArticleFromResult(ResultSet result) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
