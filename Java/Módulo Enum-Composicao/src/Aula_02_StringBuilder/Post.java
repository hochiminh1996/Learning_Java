package Aula_02_StringBuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Post {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	//static para n ter uma cópia para cada post. É apenas uma cópia p; aplicação inteira
	// atributos
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private ArrayList<Comment> comments = new ArrayList<>();
	// Uma lista que faz composição com outra classe. Já q composição é uma relação
	// 1-n. Se post deixar de existir, os commets precisam sumir tb

	// construtor
	public Post() {
	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	// setMomento
	public void setMoment(Date moment) {
		this.moment = moment;
	}

	// getMoment
	public Date getMoment() {
		return moment;
	}

	// setTitle
	public void setTitle(String title) {
		this.title = title;
	}

	// getTitle
	public String getTitle() {
		return title;
	}

	// setContent
	public void setContent(String content) {
		this.content = content;
	}

	// getContent
	public String getContent() {
		return content;
	}

	// setLike
	public void setLike(Integer likes) {
		this.likes = likes;
	}

	// getLike
	public Integer getLikes() {
		return likes;
	}

	// add commet
	public void addComment(Comment coment) {
		comments.add(coment);
	}

	// remove comment
	public void removeComment(Comment coment) {
		comments.remove(coment);
	}

	// return arraylist
	public ArrayList<Comment> getComments() {
		return comments;
	}

	// toSTRING
	public String toString() {
		//StringBuilder é muito útil p/ trabalhar com muito texto/informação
		StringBuilder sb = new StringBuilder();
		sb.append("Titulo: "+getTitle() + "\n");
		sb.append("Likes: "+getLikes() + " - "+sdf.format(getMoment()) + "\n");
		sb.append("Conteúdo: " + getContent() + "\n\n");
		sb.append("Comentários: "+"\n");
		
		for(Comment c: getComments()) {
			sb.append(c.getText() + "\n");
		}
		
		return sb.toString();
		
	
	}

}
