package buba.com.cn.service;

import buba.com.cn.entity.Solider;

import java.util.List;

public interface SoliderService {
    int updateSoldier(Solider solider);
    int addSoldier(Solider Soldier);
    int  delSoldier(Integer Soldier);
List<Solider> findAllSoldiers();
}
