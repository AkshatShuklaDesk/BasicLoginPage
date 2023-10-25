
import java.util.HashMap;

public class IDandPasswords {
     HashMap<String,String> logininfo = new HashMap<String,String >();
     
     IDandPasswords(){
    	 
    	 logininfo.put("Akshat", "123456789");
    	 logininfo.put("Shukla", "456");
    	 logininfo.put("Dixit", "789");
    	 
    	 }
	public HashMap getLoginInfo(){
    	 return logininfo;
     }
}