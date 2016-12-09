package coolweather.android.ls.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by windows08 on 2016/12/9.
 * 省的名字
 */

public class Province extends DataSupport {

    private int id;
    /*
     * 省的名字
     */
    private String provinceName;
    /*
     * 省的代号
     */
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
