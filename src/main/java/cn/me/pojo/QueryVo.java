package cn.me.pojo;

import java.util.Arrays;
import java.util.List;

public class QueryVo {
    private User user;
    private Integer[] ids;
    private List<String> list;

    @Override
    public String toString() {
        return "QueryVo{" +
                "user=" + user +
                ", ids=" + Arrays.toString(ids) +
                ", list=" + list +
                '}';
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
