package in.chat.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChatMessage 
{

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column
   private int id;	
   @Column
   private String sender;
   @Column
   private String content;
   
   public int getId() {
	return id;
   }
   public void setId(int id) {
	this.id = id;
   }
   public String getSender() {
	return sender;
   }
   public void setSender(String sender) {
	this.sender = sender;
   }
   public String getContent() {
	return content;
   }
   public void setContent(String content) {
	this.content = content;
   }
   
   
}
