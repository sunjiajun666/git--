package buba.com.cn.entity;

public class Solider {
    private Integer SoldierId;
    private String SoldierName;
    private String SoldierWeapon;

    public Solider(Integer soldierId, String soldierName, String soldierWeapon) {
        SoldierId = soldierId;
        SoldierName = soldierName;
        SoldierWeapon = soldierWeapon;
    }

    public Solider(String soldierName, String soldierWeapon) {
        SoldierName = soldierName;
        SoldierWeapon = soldierWeapon;
    }

    public Solider() {
    }

    @Override
    public String toString() {
        return "Solider{" +
                "SoldierId=" + SoldierId +
                ", SoldierName='" + SoldierName + '\'' +
                ", SoldierWeapon='" + SoldierWeapon + '\'' +
                '}';
    }

    public Integer getSoldierId() {
        return SoldierId;
    }

    public void setSoldierId(Integer soldierId) {
        SoldierId = soldierId;
    }

    public String getSoldierName() {
        return SoldierName;
    }

    public void setSoldierName(String soldierName) {
        SoldierName = soldierName;
    }

    public String getSoldierWeapon() {
        return SoldierWeapon;
    }

    public void setSoldierWeapon(String soldierWeapon) {
        SoldierWeapon = soldierWeapon;
    }
}
