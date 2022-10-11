package buba.com.cn.service.impl;

import buba.com.cn.dao.SoliderDao;
import buba.com.cn.entity.Solider;
import buba.com.cn.service.SoliderService;

import java.util.List;

public class SoliderServiceimpl implements SoliderService {
private  SoliderService service=new SoliderServiceimpl();

    @Override
    public int updateSoldier(Solider solider) {
        return service.updateSoldier(solider);
    }

    @Override
    public int addSoldier(Solider Soldier) {

        return service.addSoldier(Soldier);
    }

    @Override
    public int delSoldier(Integer Soldier) {
        return service.delSoldier(Soldier);
    }

    @Override
    public List<Solider> findAllSoldiers() {
        return service.findAllSoldiers();
    }
}
