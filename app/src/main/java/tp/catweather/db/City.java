package tp.catweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/9/6.
 */

public class City extends DataSupport{

    /**
     * id:
     * cityName:城市名字
     * cityCode:城市代号
     * provinceId:城市所属省id值
     */

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    private String cityName;

    private int cityCode;

    private int provinceId;

}
