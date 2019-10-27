package br.com.zssn.enums;

import java.io.Serializable;

public enum InventoryPointsEnum implements Serializable {
	
	WATER("Water", 4),  FOOD("Food", 3), MEDICATION("Medication", 2), AMMUNITION("Ammunition",1);
	
    private InventoryPointsEnum(String desc, Integer pontos) {
        this.desc = name();
        this.pontos = pontos;
    }

    private String desc;
    private Integer pontos;

    public String getDesc() {
        return desc;
    }

    public Integer getPontos() {
        return pontos;
    }
   
}


