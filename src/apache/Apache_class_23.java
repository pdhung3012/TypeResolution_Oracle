package apache;

import org.apache.http.HttpRequest;
import org.apache.http.client.HttpClient;

public class Apache_class_23 {
	public void main(){
		HttpClient httpClient = new HttpClient();

        HttpRequest req = new HttpRequest("GET", "http://tools.ietf.org/html/rfc2616.html");

        // returns immediately if the complete header (not message!) is received
        HttpResponse resp = httpClient.call(req);

        if (resp.getStatus() == 200) {  
           // create the output file 
           File file = new File("rfc2616.html");
           file.createNewFile();
           FileChannel fc = new RandomAccessFile(file, "rw").getChannel();

           // get a blocking message body channel
           ReadableByteChannel inputBodyChannel = resp.getBlockingBody();

           // and transfer the data
           fc.transferFrom(inputBodyChannel, 0, 900000);
           fc.close();
        }
	}
}
