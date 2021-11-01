package com.company;

import java.util.List;

public class Bank {
    public List<Szamla> szamlaLista;

    public Bank() {
    }
    public Szamla szamlanyitas(Tulajdonos tulajdonos,int hitelkeret){
        if(hitelkeret<0){
            HitelSzamla szamla=new HitelSzamla(tulajdonos,hitelkeret);
            return szamla;
        }else {
            MegtakaritasiSzamla szamla=new MegtakaritasiSzamla(tulajdonos);
            szamla.setKamat(hitelkeret);
            return szamla;
        }
    }
}
