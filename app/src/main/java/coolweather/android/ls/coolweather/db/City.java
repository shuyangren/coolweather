package coolweather.android.ls.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by windows08 on 2016/12/9.
 */

public class City extends DataSupport {

    private int id;
    /*
     * 市的名字
     */
    private String cityName;
    /*
     * 市的代号
     */
    private int cityCode;
    /*
     * 所属省的的id
     */
    private int provinceId;

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
