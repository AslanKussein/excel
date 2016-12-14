import java.io.Serializable;

/**
 * Created by a.amanzhol on 04.09.2015.
 */
public class Subject implements Serializable {
    private static final long serialVersionUID = 7376577720294011801L;

    private Long id;
    private String code;
    private String nameRu;
    private String nameKz;
    private String shortName;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public String getNameKz() {
        return nameKz;
    }
    public void setNameKz(String nameKz) {
        this.nameKz = nameKz;
    }

    public String getNameRu() {
        return nameRu;
    }
    public void setNameRu(String nameRu) {
        this.nameRu = nameRu;
    }

    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

}
