package com.tcs.javarestful.messenger.service;

import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.tcs.javarestful.messenger.database.DBClass;
import com.tcs.javarestful.messenger.model.Message;

public class MessageService {

//	public List<Message> getAllMessages(){
//		Message m1 = new Message(1,"Hello 1 ","Geetha");
//		Message m2 = new Message(1,"Hello 2 ","Gayathri");
//		
//		List<Message> list = new ArrayList<Message>();
//		list.add(m1);
//		list.add(m2);
//		return list;
//	}
	
	private Map<Long,Message> msgs = DBClass.getMessages();
	
	public MessageService() {
		msgs.put((long) 101, new Message(191,"Hi","Geetha "));
		msgs.put((long) 102, new Message(192,"TCS","Geetha"));
		msgs.put((long) 103, new Message(198,"INFOSYS","Gayathri"));
	}

	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(msgs.values());
	}
	public Message getMessage(Long id) {
		return msgs.get(id);
	}
	public Message addMessage(Message msg) {
		return msgs.put(msg.getId(),msg);
	}
	public Message updateMessage(Message msg) {
		if(msg.getId() <= 0)
			return null;
		msgs.put(msg.getId(), msg);
		return msg;
	}
	public Message removeMessage(Long id) {
		return msgs.remove(id);
	}
	
}
