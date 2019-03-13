package sean.com.example.photopreview;

/**
 * @author Sean
 * @data 2019/3/13
 */
public class PhotoBean {

    private String url;

    public PhotoBean(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
