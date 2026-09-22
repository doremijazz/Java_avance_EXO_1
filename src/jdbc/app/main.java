package jdbc.app;

import java.sql.Connection;

import jdbc.dao.Dao;
import jdbc.model.Article;
import jdbc.dao.ArticleDao;

public class main {
	public static void main (String[] args) throws Exception{
		ArticleDao Article_dao = new ArticleDao();
		
		//CREATE
		Article article_1 = new Article("description", "brand", 3.50);
		System.out.println("article a créer : " + article_1);
		Boolean sucess = Article_dao.create(article_1); 
		System.out.println("Création d'un article dans la db : " + sucess);
		
		//READ
		Article article_2 = Article_dao.read(1);
		System.out.println("\n Lecture d'un article de la db : " + article_2);
		
		//READ ALL
		System.out.println("\n Liste des articles : ");
		for(Article currentArticle : Article_dao.reedAll()) {
			System.out.println(currentArticle);
		}
		
		//UPDATE
		
		//DELETE
		
	}
}
