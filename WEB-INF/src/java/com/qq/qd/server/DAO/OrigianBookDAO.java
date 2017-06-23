package com.qq.qd.server.DAO;

import com.qq.qd.server.model.OrigianBookEx;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangzhi.a on 2017/6/21.
 */
@Repository("origianbookdao")
public interface OrigianBookDAO {

    List<OrigianBookEx> getOrigianBookEx(@Param("freetype") long freetype);

}
