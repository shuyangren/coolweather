package coolweather.android.ls.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by windows08 on 2016/12/9.
 */

public class County extends DataSupport {

    private int id;
    /*
     * 县的名字
     */
    private String countyName;
    /*
     * 县所对应的天气
     */
    private String weatherId;
    /*
     * 当前县所属市的id
     */
    private String cityId;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
