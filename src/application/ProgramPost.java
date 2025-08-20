package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class ProgramPost {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:MM:ss");

		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("how that s awesome!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zeland",
				"i´m goint to visit this wonderful country", 12);
		p1.addComment(c1);
		p1.addComment(c2);
	
		System.out.println(p1);
	}

}
