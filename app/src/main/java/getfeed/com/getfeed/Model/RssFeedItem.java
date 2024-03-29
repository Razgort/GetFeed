package getfeed.com.getfeed.Model;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;


/**
 * Created by Razgort on 05/02/2016.
 */
@Root(name = "RssItem", strict = false)
public class RssFeedItem {
    @Element(name = "title", required = true)
    String title;
    @Element(name = "link", required = true)
    String link;
    @Element(name = "description", required = true)
    String description;
    @Element(name = "pubDate", required = false)
    String pubDate;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", pubDate='" + pubDate + '\'' +
                '}';
    }
}