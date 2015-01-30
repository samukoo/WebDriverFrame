package main.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class UserProperties {

	public User getUser(){
		
		User user = new User();
		
		Properties prop = new Properties();
		String propFilename = "users.properties";
		InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFilename);
			try{
				prop.load(inputStream);
			}catch(IOException e){
				e.printStackTrace();
			}
			
		Set s = prop.entrySet();
		Iterator i = s.iterator();
		while(i.hasNext()){
			Map.Entry me = (Entry<String, String>) i.next();
			user.setName(me.getKey().toString());
			user.setPass(me.getValue().toString());
		}
		return user;
	}

	public class User{
		private String name;
		private String pass;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPass() {
			return pass;
		}
		public void setPass(String pass) {
			this.pass = pass;
		}
	}
}
