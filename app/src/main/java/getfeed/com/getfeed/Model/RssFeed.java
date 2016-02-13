package getfeed.com.getfeed.Model;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Razgort on 05/02/2016.
 */
@Root(name = "rss", strict = false)
public class RssFeed {
    @Attribute
    String version;

    @Element
    RssChannel channel;


    public RssChannel getChannel() {
        return channel;
    }

    @Override
    public String toString() {
        return "RSS{" +
                "version='" + version + '\'' +
                ", channel=" + channel +
                '}';
    }
}
