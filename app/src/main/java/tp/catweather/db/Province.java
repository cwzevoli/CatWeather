package tp.catweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/9/6.
 */

public class Province extends DataSupport {

    /**
     * id:
     * cityName:省名字
     * cityCode:省代号
     */

    private int id;

    private String provinceName;


    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }


}
