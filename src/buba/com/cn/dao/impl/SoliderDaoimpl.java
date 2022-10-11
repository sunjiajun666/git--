package buba.com.cn.dao.impl;

import buba.com.cn.dao.SoliderDao;
import buba.com.cn.entity.Solider;
import buba.com.cn.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class SoliderDaoimpl implements SoliderDao {


    @Override
    public int updateSoldier(Solider solider) {
        JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBCUtils.getDateSource());
        String sql="update  t_soldier set soldier_name=? ,soldier_weapon=? where soldier_id=?";
        int update = jdbcTemplate.update(sql, solider.getSoldierName(), solider.getSoldierWeapon(), solider.getSoldierId());
        return update;
    }

    @Override
    public int addSoldier(Solider Soldier) {
        JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBCUtils.getDateSource());
        String sql="insert into t_soldier(soldier_name,soldier_weapon) values(?,?)";

        int update = jdbcTemplate.update(sql, Soldier.getSoldierName(), Soldier.getSoldierWeapon());
        return update;
    }

    @Override
    public int delSoldier(Integer Soldier) {
        JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBCUtils.getDateSource());
        String sql="delete from t_soldier where soldier_id=?";
        int update = jdbcTemplate.update(sql, Soldier);

        return update;
    }

    @Override
    public List<Solider> findAllSoldiers() {
        JdbcTemplate jdbcTemplate=new JdbcTemplate(JDBCUtils.getDateSource());
        String sql="select*from t_soldier";
        List<Solider> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Solider.class));

        return query;
    }
}
