/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actions;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javafx.beans.binding.Bindings;
import javafx.event.*;
import javax.swing.JOptionPane;
import poscihazı.giris;
import poscihazı.poscihazi;
import poscihazı.*;
import poscihazı.cikis;
import poscihazı.giris;
import poscihazı.kredikartibankakarti;
import poscihazı.poscihazi;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Kubra
 */
public class action implements ActionListener {

    static int sayac = 0;

    poscihazi a;
    
    int kartkontrol;

    public action(poscihazi pt) {
        this.a = pt;
        
    }

    public poscihazi getA() {
        return a;
    }

    public void setA(poscihazi a) {
        this.a = a;
    }
    int cikiskontrol = 0;

    String sifre = "";
    int yesilkontrol = 0;

    String tutar = "";
    double tutar1;
    int kontrol = 0;
    int sifrekontrol = 0;
    int yesilbuton = 1;
    double bakiye;
    kartlar kalanbakiye = new kartlar();

    @Override

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == getA().getKirmizi()) {
            getA().getPin().setVisible(false);
            getA().getSifre1().setVisible(false);
            getA().getSifree().setVisible(true);
            getA().getSatistutar().setVisible(true);
            getA().getAlt_label().setVisible(false);
            getA().getUst_label().setVisible(false);

            getA().getSifree().setText("islem iptal edliyor bekleyiniz...");
            getA().getSatistutar().setText("5 saniye içerisinde kapancak");
            getA().getSlipp().setVisible(false);
            Timer zamanlayici = new Timer();
            TimerTask gorev = new TimerTask() {
                @Override
                public void run() {
                    sayac++;
                    getA().getSatistutar().setText(String.valueOf(sayac));
                    if (sayac == 5) {

                        System.exit(0);
                    }

                }
            };
            zamanlayici.schedule(gorev, 0, 2000);

        }
        if (e.getSource() == getA().getZiraatbank()) {
            getA().getSatistutar().setVisible(true);
            getA().getSifree().setVisible(true);
            getA().getArka().setVisible(false);
            bakiye = kalanbakiye.getZiraatbakiye();
            kartkontrol = 0;

        } else if (e.getSource() == getA().getGaranti()) {
            getA().getSatistutar().setVisible(true);
            getA().getSifree().setVisible(true);
            getA().getArka().setVisible(false);
            bakiye = kalanbakiye.getGarantibakiye();
            kartkontrol = 1;

        } else if (e.getSource() == getA().getIsbanka()) {
            getA().getSatistutar().setVisible(true);
            getA().getSifree().setVisible(true);
            getA().getArka().setVisible(false);
            bakiye = kalanbakiye.getIsbank();
            kartkontrol = 2;
        }

        if (sifrekontrol == 0) {

            if (e.getSource() == getA().getButton1()) {
                tutar += "1";
                getA().getSifree().setText(null);
                tutar1 = Double.parseDouble(tutar);
                getA().getSifree().setText(String.valueOf(tutar1));

            } else if (e.getSource() == getA().getButton2()) {
                tutar += "2";
                tutar1 = Double.parseDouble(tutar);
                getA().getSifree().setText(String.valueOf(tutar1));
            } else if (e.getSource() == getA().getButton3()) {
                tutar += "3";
                tutar1 = Double.parseDouble(tutar);
                getA().getSifree().setText(String.valueOf(tutar1));
            } else if (e.getSource() == getA().getButton4()) {
                tutar += "4";
                tutar1 = Double.parseDouble(tutar);
                getA().getSifree().setText(String.valueOf(tutar1));
            } else if (e.getSource() == getA().getButton5()) {
                tutar += "5";
                tutar1 = Double.parseDouble(tutar);
                getA().getSifree().setText(String.valueOf(tutar1));
            } else if (e.getSource() == getA().getButton6()) {
                tutar += "6";
                tutar1 = Double.parseDouble(tutar);
                getA().getSifree().setText(String.valueOf(tutar1));
            } else if (e.getSource() == getA().getButton7()) {
                tutar += "7";
                tutar1 = Double.parseDouble(tutar);
                getA().getSifree().setText(String.valueOf(tutar1));
            } else if (e.getSource() == getA().getButton8()) {
                tutar += "8";
                tutar1 = Double.parseDouble(tutar);
                getA().getSifree().setText(String.valueOf(tutar1));
            } else if (e.getSource() == getA().getButton9()) {
                tutar += "9";
                tutar1 = Double.parseDouble(tutar);
                getA().getSifree().setText(String.valueOf(tutar1));
            } else if (e.getSource() == getA().getButton0()) {
                tutar += "0";
                tutar1 = Double.parseDouble(tutar);
                getA().getSifree().setText(String.valueOf(tutar1));
            } else if (e.getSource() == getA().getSari()) {
                tutar = "";
                getA().getSifree().setText("0.0");
            } else if (e.getSource() == getA().getDiyez()) {
                tutar += ".";
                tutar1 = Double.parseDouble(tutar);
                getA().getSifree().setText(String.valueOf(tutar1));
            }
        } else if (sifrekontrol == 1) {
            yesilbuton = 2;
            cikiskontrol = 1;
            if (sifre.length() != 4) {
                if (e.getSource() == getA().getButton1()) {

                    sifre += "1";
                    getA().getSifre1().setText(sifre);

                } else if (e.getSource() == getA().getButton2()) {
                    sifre += "2";

                    getA().getSifre1().setText(sifre);
                } else if (e.getSource() == getA().getButton3()) {
                    sifre += "3";

                    getA().getSifre1().setText(sifre);
                } else if (e.getSource() == getA().getButton4()) {
                    sifre += "4";

                    getA().getSifre1().setText(sifre);
                } else if (e.getSource() == getA().getButton5()) {
                    sifre += "5";

                    getA().getSifre1().setText(sifre);
                } else if (e.getSource() == getA().getButton6()) {
                    sifre += "6";

                    getA().getSifre1().setText(sifre);
                } else if (e.getSource() == getA().getButton7()) {
                    sifre += "7";
                    getA().getSifre1().setText(sifre);
                } else if (e.getSource() == getA().getButton8()) {
                    sifre += "8";

                    getA().getSifre1().setText(sifre);
                } else if (e.getSource() == getA().getButton9()) {
                    sifre += "9";
                    getA().getSifre1().setText(sifre);
                } else if (e.getSource() == getA().getButton0()) {
                    sifre += "0";

                    getA().getSifre1().setText(sifre);
                } else if (e.getSource() == getA().getSari()) {
                    sifre = "";
                    getA().getSifre1().setText("");
                }

            }
            if (e.getSource() == getA().getSari()) {
                sifre = "";
                getA().getSifre1().setText("");
            }
        }
        if (e.getSource() == getA().getYesil()) {
            if (yesilbuton == 0) {
                sifrekontrol = 1;
                kredikartibankakarti b = new kredikartibankakarti(this.a);
                b.getkredibanka();
            } else if (yesilbuton == 1) {

                giris a = new giris(this.a);
                a.getCalistimakod();
            } else if (cikiskontrol == 1 && sifre.length() == 4) {
                bakiye = bakiye - tutar1;
                if (kartkontrol == 0) {
                    kalanbakiye.setZiraatbakiye(bakiye);
                } else if (kartkontrol == 1) {
                    kalanbakiye.setGarantibakiye(bakiye);
                } else if (kartkontrol == 2) {
                    kalanbakiye.setIsbank(bakiye);
                }
                if (bakiye < 0) {
                    getA().getSatistutar().setVisible(true);
                    getA().getSifree().setText("bakiye yetersiz");
                    getA().getSatistutar().setText("bakiye yetersiz");
                    getA().getSifree().setVisible(true);
                    getA().getPin().setVisible(false);
                    getA().getSifre1().setVisible(false);
                } else {
                    cikis c = new cikis(this.a);
                    c.getCikiskod();
                }
            }

        }
        if (e.getSource() == getA().getAsagi()) {
            yesilbuton = 0;
            kontrol = 1;
            getasagi();
        } else if (e.getSource() == getA().getYukari()) {
            yesilbuton = 0;
            kontrol = 0;
            getyukari();

        }

    }

    public Object getyukari() {
        getA().getUst_label().setBackground(Color.black);
        getA().getUst_label().setForeground(Color.white);
        getA().getAlt_label().setBackground(Color.white);
        getA().getAlt_label().setForeground(Color.black);
        return 1;
    }

    public Object getasagi() {
        getA().getUst_label().setBackground(Color.white);
        getA().getUst_label().setForeground(Color.black);
        getA().getAlt_label().setBackground(Color.black);
        getA().getAlt_label().setForeground(Color.white);

        return 1;
    }

}
