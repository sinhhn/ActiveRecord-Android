package orms.activerecord.realization;

/**
 * Created by thanhbui on 2016/12/03.
 */

public interface IModel {

    public long getId();

    public boolean equals(Object targetObj);

    public void save();

    public int delete();
}