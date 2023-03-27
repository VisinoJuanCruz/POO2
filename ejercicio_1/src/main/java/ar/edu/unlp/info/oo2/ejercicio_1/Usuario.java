package ar.edu.unlp.info.oo2.ejercicio_1;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

	private List<Tweet> tweets= new ArrayList<Tweet>();
	private String screenName;

	
	public boolean equals(Usuario newUsuario) {
		return(this.screenName == newUsuario.getScreenName());
	}
	
	public List<Tweet> getTweets(){
		return this.tweets;
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	public void tweetear(Tweet newTweet) {
		this.tweets.add(newTweet);
	}
	
	public void retweetear(Tweet newTweet) {
		Retweet retweet = new Retweet(newTweet);
		this.tweets.add(retweet);
	}

}
