import java.time.Period; 
import java.lang.*;
public class MediaId {

				public static String getInstagramPostId(String mediaId)
        {
            String postId = "";
            try
            {
                long id = Long.parseLong(mediaId.substring(0, mediaId.indexOf('_')));
                String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_";
                while (id > 0)
                {
                    long remainder = (id % 64);
                    id = (id - remainder) / 64;
                 
                    postId = alphabet.charAt((int)remainder) + postId;
                }
            }
            catch (Exception e)
            {
                System.out.println(e);

            }

            return postId;
        }
				public static void main (String[] args){
							String postId=getInstagramPostId("2426432026533075419_303323894");
              System.out.println(postId);
				}
}
