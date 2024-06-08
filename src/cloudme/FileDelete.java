package cloudme;

import java.io.File;

import Cloudme.CloudmeFolderNode;
import Cloudme.CloudmeUser;

public class FileDelete {

	public static synchronized boolean fileDelete(String filepath)
	{
		try
        {
			CloudmeUser user = new CloudmeUser("ssathvika208","voidmain");
			
			CloudmeFolderNode node = user.getFolderManager().getFolderTree();
			
			for(CloudmeFolderNode n : node.getChildren()){
				
				if(n.getFolder().getName().equals("keyaggrigate"))
				{
					n.getFolder().getFile(new File(filepath).getName()).deleteFile();
					
					return true;
				}
			}
			
			user.killUser();
	    }
		catch(Exception e)
		{
			e.printStackTrace();
			
			return false;
		}
		
		return false;
	}
}
