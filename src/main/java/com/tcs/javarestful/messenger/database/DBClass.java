package com.tcs.javarestful.messenger.database;

import java.util.*;

import com.tcs.javarestful.messenger.model.Message;
import com.tcs.javarestful.messenger.model.Profile;

public class DBClass {

	private static Map<Long, Message> msgs = new HashMap<Long, Message>();
	private static Map<Long, Profile> profiles = new HashMap<Long,Profile>();

public static Map<Long, Message> getMessages(){
	return msgs;
}
public static Map<Long,Profile> getProfiles(){
	return profiles;
}
}
