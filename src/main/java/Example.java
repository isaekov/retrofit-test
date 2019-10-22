import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
public class Example {

    @SerializedName("count")
    @Expose
    public String count;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("summ")
    @Expose
    public String summ;
    @SerializedName("list_link")
    @Expose
    public String listLink;
    @SerializedName("statuses")
    @Expose
    public List<Status> statuses = null;


//    @Override
//    public String toString() {
//        return "Example{" +
//                "count='" + count + '\'' +
//                ", type='" + type + '\'' +
//                ", summ='" + summ + '\'' +
//                ", listLink='" + listLink + '\'' +
//                ", statuses=" + statuses +
//                '}';
//    }
}
@Data
@Getter
class Status {

    @SerializedName("count")
    @Expose
    public String count;
    @SerializedName("summ")
    @Expose
    public String summ;
    @SerializedName("status_text")
    @Expose
    public String statusText;
    @SerializedName("list_link")
    @Expose
    public String listLink;

}