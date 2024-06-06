
/*
package drivehq;

public class FileDelete {

	public static synchronized boolean fileDelete(String fileName)
	{
		boolean isDeleted=false;
		
		MyFTPClient client=new MyFTPClient();
		
		client = new MyFTPClient();
		
		try {
			
			boolean isConnected=client.ftpConnect("ftp.drivehq.com","vivaan18","voidmain",21);
			
			if(isConnected)
			{
				if(client.ftpRemoveFile(fileName))
				{
					System.out.println("success");
					isDeleted=true;
				}
				else
				{
					System.out.println("failed");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		client.ftpDisconnect();
		
		return isDeleted;
	}
}

*/
