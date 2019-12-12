package com.tcs.javarestful.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tcs.javarestful.messenger.model.Message;
import com.tcs.javarestful.messenger.service.MessageService;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getMessages() {
//		return "Hello World!";
	MessageService messageservice = new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(){
		return messageservice.getAllMessages();
	}
	
//	@POST
//	@Produces(MediaType.APPLICATION_JSON)
//	public String addMessages() {
//		return "Post works!";
//	}
	
	@POST
	public Message addMessages(Message msgs) {
		return messageservice.addMessage(msgs);
	}

	@PUT
	@Path("/{msgId}")
	public Message updateMessages(@PathParam("msgId") Long id,Message msgs) {
		msgs.setId(id);
		return messageservice.updateMessage(msgs);
	}
	
	@GET
	@Path("/{msgId}")
	public Message test(@PathParam("msgId") Long msgId) {
		return	messageservice.getMessage(msgId);
	}
	
	@DELETE
	@Path("/{msgId}")
	public void deleteMessage(@PathParam("msgId") Long msgId) {
		messageservice.removeMessage(msgId);
	}
	
}
