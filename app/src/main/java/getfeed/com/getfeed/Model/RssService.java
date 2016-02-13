package getfeed.com.getfeed.Model;

import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;
import org.simpleframework.xml.stream.HyphenStyle;
import org.simpleframework.xml.stream.Verbosity;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Razgort on 13/02/2016.
 */
public class RssService {
    public interface APIService {

        @GET("rss.xml")
        Call<RssFeed> loadFeeds();

    }
   String _url = "http://www.lesnumeriques.com/";

    private APIService service;

    public void setUp() {
        Format format = new Format(0, null, new HyphenStyle(), Verbosity.HIGH);
        Persister persister = new Persister(format);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(_url)
                .addConverterFactory(SimpleXmlConverterFactory.create(persister))
                .build();
        service = retrofit.create(APIService.class);
    }
}
