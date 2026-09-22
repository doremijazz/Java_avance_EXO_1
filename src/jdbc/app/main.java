package jdbc.app;

import java.sql.Connection;

import jdbc.dao.Dao;
import jdbc.model.Article;
import jdbc.dao.ArticleDao;

public class main {
	public static void main (String[] args) throws Exception{
		ArticleDao Article_dao = new ArticleDao();
		
		//CREATE
		
		//READ
		
		//READ ALL
		System.out.println("\n Liste des articles : ");
		for(Article currentArticle : Article_dao.reedAll()) {
			System.out.println(currentArticle);
		}
		
		//UPDATE
		
		//DELETE
		
	}
}
