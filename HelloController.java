package com.example.supercalc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class HelloController {

//    LabelUp lbup = new LabelUp();

    ArrayList<String> numsArr = new ArrayList();



//    @Override
//            public String toString(){
//        String sv = toString();
////        int varUp.toString();
//    }
    int varUp = 0;
    int dv = 0;
    int tst = 0;
    double dc = 0;
    int tmp = 0;
    public int ab = 0;
    int bc = 0;

    String lbup = "";

    void lbupM(){
        if (tmp != 0){
            if(tmp == 1){
                varUp = bc + ab;
            }
            else if(tmp == 2){
                varUp = bc / ab;
            }
            else if(tmp == 3){
                varUp = bc - ab;
            } else if(tmp == 4){
                varUp = bc * ab;
            }
            lbl.setText(String.valueOf(varUp));
            bc = varUp;
        }
    }


//    public static class Comms{
        String Comms(){

            ArrayList comms = new ArrayList<String>();


            comms.add("Прювет!");
            comms.add("Лучше столбиком посчитай!");
            comms.add("... но это не точно...");
            comms.add("... хватит по кнопкам так сильно тыкать!");
            comms.add("Мне бы столько мильонов!");
            comms.add("Ты у меня в долгу теперь!");
            comms.add("... Учи таблицу умножения!");
            comms.add("Хватит баловаться, иди в школу!");
            comms.add("Хватит из себя бухгалтера строить!");
            comms.add("Лучше перепроверь...");
            comms.add("Семь раз нарежь, один раз налей!");

            comms.add("Ты ваще в школе был хоть раз?");
            comms.add("Ну ты эт... заходи если чё!");
            comms.add("Ну ты счетовод...");
            comms.add("Что бы ты без меня делал?");
            comms.add("Чё-то многовато получилось, лучше перепроверь!");
            comms.add("Мдаааа... ");
            comms.add("Видимо я один здесь умный.");
            comms.add("Я считаю... Да. Только это и умею!");
            comms.add("Если неправильно - я не виноват!");
            comms.add("Я пишу и щитаю без ашибак!");

            comms.add("Буд уверен! Я не проведу! Т.е. не подведу!");
            comms.add("Я то в школе нормально учился.");
            comms.add("Если неправильно вали всё на меня!");
            comms.add("Ну я хотя бы считать умею!");
            comms.add("Ты хорошо подумал?");
            comms.add("Я думал ты умнее...");
            comms.add("Ты всегда такую ерунду считаешь?");
            comms.add("Вроде бы правильно...");
            comms.add("Я очень редко ошибаюсь...");
            comms.add("Я не виноват - это программист!");

            comms.add("Если чё я за базар не отвечаю!");
            comms.add("Маловато конечно...");
            comms.add("Если я ошибся... то ничего страшного!");
            comms.add("Мы калькуляторы - народ простой!");
            comms.add("Я тут посчитал, а потом пересчитал)");
            comms.add("Тебе мало что-ли?");
            comms.add("Не ошибается тот - кто ничего не делает!");
            comms.add("Я тут недавно обсчитался по полной!");
            comms.add("Конечно... должно быть другое число... но...");
            comms.add("Пользуйся пока я добрый!");

            comms.add("Я не думал что ты такой дотошный!");
            comms.add("Я всегда считал...");
            comms.add("Ты меня без работы не оставишь...");
            comms.add("Мог бы и в уме посчитать...");
            comms.add("Легкотня!");
            comms.add("Могло быть и больше!");
            comms.add("Я налоги тут сразу вычел если чё...");
            comms.add("Ну примерно столько...");
            comms.add("Я округлил тут немного...");
            comms.add("Что-то я устал. Может столбиком посчитаешь?");

            comms.add("Вот видишь, иногда я не ошибаюсь...");
            comms.add("Я никогда не гЛю.глОч..глючю...");
            comms.add("Сам не ожидал что столько выйдет!");
            comms.add("Я СуперКальк, а не СуперКомп...");
            comms.add("Делааааааа...");
            comms.add("И зачем тебе это?");
            comms.add("Если это деньги, то не забудь мою долю!");
            comms.add("Ты бы ещё дважды-два спросил...");
            comms.add("И куда только твои родители смотрят?");
            comms.add("Приходи лучше завтра!");

            comms.add("Перед тем как заглючить, я обычно ерунду пишу...");
            comms.add("Это было великолепно...");
            comms.add("Неожиданно!");
            comms.add("Жаль что я не СуперХалк!");
            comms.add("Что за махинации?");
            comms.add("Ты не устал так по кнопкам фигачить?");
            comms.add("Если что на меня не рассчитывай...");
            comms.add("Не ожидал, да?");
            comms.add("Я как-будто в бухгалтерию попал...");
            comms.add("И долго ещё?...");







            int ranNum = (int) (Math.random() * 70);
            String com1 = (String) comms.get(ranNum);
            return com1;
        }
//    }

    @FXML
    private Label lblUp;

    @FXML
    private Label lblComms;

    @FXML
    private Label lbl;

    @FXML
    private Button butC;

    @FXML
    private Button but1;

    @FXML
    private void click(ActionEvent event){
        lbl.setText("0");
        ab = 0;
        bc = 0;
        lbup = "";
        lblUp.setText("0");
        tmp = 0;
    }

    @FXML
    private void clickBut1(ActionEvent event2){
        ab = Integer.parseInt(ab + "1");
        lbl.setText(String.valueOf(ab));
        lbup += "1";
        lblUp.setText(lbup);
//        if (tmp == 0){
//            varUp = ab;
//            lblUp.setText(String.valueOf(varUp));
//        }
//        else{
//
//        }

    }

    @FXML
    private void clickBut2(ActionEvent event){
        ab = Integer.parseInt(ab + "2");
        lbl.setText(String.valueOf(ab));
        varUp = ab;
        lbup += "2";
//        lblUp.setText(String.valueOf(varUp));
        lblUp.setText(lbup);
    }

    @FXML
    private void clickBut3(ActionEvent event){
        ab = Integer.parseInt(ab + "3");
        lbl.setText(String.valueOf(ab));
        varUp = ab;
        lbup += "3";

        lblUp.setText(lbup);
    }

    @FXML
    private void clickBut4(ActionEvent event){
        ab = Integer.parseInt(ab + "4");
        lbl.setText(String.valueOf(ab));
        varUp = ab;
        lbup += "4";
        lblUp.setText(lbup);
    }

    @FXML
    private void clickBut5(ActionEvent event){
        ab = Integer.parseInt(ab + "5");
        lbl.setText(String.valueOf(ab));

        lbup += "5";
        lblUp.setText(lbup);
    }

    @FXML
    private void clickBut6(ActionEvent event){
        ab = Integer.parseInt(ab + "6");
        lbl.setText(String.valueOf(ab));
        lbup += "6";
        lblUp.setText(lbup);
    }

    @FXML
    private void clickBut7(ActionEvent event){
        ab = Integer.parseInt(ab + "7");
        lbl.setText(String.valueOf(ab));
        lbup += "7";
        lblUp.setText(lbup);
    }

    @FXML
    private void clickBut8(ActionEvent event){
        ab = Integer.parseInt(ab + "8");
        lbl.setText(String.valueOf(ab));
        lbup += "8";
        lblUp.setText(lbup);
    }

    @FXML
    private void clickBut9(ActionEvent event){
        ab = Integer.parseInt(ab + "9");
        lbl.setText(String.valueOf(ab));
        lbup += "9";
        lblUp.setText(lbup);
    }

    @FXML
    private void clickBut0(ActionEvent event){
        ab = Integer.parseInt(ab + "0");
        lbl.setText(String.valueOf(ab));
        if (!(lbup.equals("0"))){
            lbup += "0";
            lblUp.setText(lbup);
        }

    }

    @FXML
    private void clickButPlus(ActionEvent event){

        if (tmp != 0){
            if(tmp == 1){
                varUp = bc + ab;
            }
            else if(tmp == 2){
                varUp = bc / ab;
            }
            else if(tmp == 3){
                varUp = bc - ab;
            }
            else if(tmp == 4){
                varUp = bc * ab;
            }
            lbl.setText(String.valueOf(varUp));
            bc = varUp;
        }
        else{
            lbl.setText("+");
            bc = ab;
        }


        lbup += "+";
        lblUp.setText(lbup);

        tmp = 1;

        ab = 0;
    }

    @FXML
    private void clickButDiv(ActionEvent event){



        if (tmp != 0){
            if(tmp == 1){
                varUp = bc + ab;
            }
            else if(tmp == 2){
                varUp = bc / ab;
            }
            else if(tmp == 3){
                varUp = bc - ab;
            }
            else if(tmp == 4){
                varUp = bc * ab;
            }
            lbl.setText(String.valueOf(varUp));
            bc = varUp;
        }
        else{
            lbl.setText("/");
            bc = ab;
        }

        lbup += ":";
        lblUp.setText(lbup);
        tmp = 2;
        ab=0;
    }

    @FXML
    private void clickButMin(ActionEvent event){

        if (tmp != 0){
            if(tmp == 1){
                varUp = bc + ab;
            }
            else if(tmp == 2){
                varUp = bc / ab;
            }
            else if(tmp == 3){
                varUp = bc - ab;
            }
            else if(tmp == 4){
                varUp = bc * ab;
            }
            lbl.setText(String.valueOf(varUp));
            bc = varUp;
        }
        else{
            lbl.setText("-");
            bc = ab;
        }

        lbup += "-";
        lblUp.setText(lbup);

        tmp = 3;

        ab = 0;


    }

    @FXML
    private void clickButMulti(ActionEvent event){

        if (tmp != 0){
            if(tmp == 1){
                varUp = bc + ab;
            }
            else if(tmp == 2){
                varUp = bc / ab;
            }
            else if(tmp == 3){
                varUp = bc - ab;
            }
            else if(tmp == 4){
                varUp = bc * ab;
            }
            lbl.setText(String.valueOf(varUp));
            bc = varUp;
        }
        else{
            lbl.setText("*");
            bc = ab;
        }

        lbup += "*";
        lblUp.setText(lbup);

        tmp = 4;

        ab = 0;


    }

    @FXML
    private void clickButEq(ActionEvent event){
        if (tmp == 1){
            int dv = ab + bc;
            lbl.setText(String.valueOf(dv));
            ab = dv;
            lbup += "=";
            lblUp.setText(lbup + String.valueOf(dv));
            lbup = "";
        }
        else if(tmp == 2){

            if (ab != 0){

                int df = (int)(bc / ab);
//              dc = bc / ab;
                tst = bc % ab;
                lbup += "=";
                if (tst != 0 ){
                    double dab = ab;
                    double dbc = bc;
                    dc = dbc / dab;
                    lbl.setText(String.valueOf(dc));
                    lblUp.setText(lbup + String.valueOf(dc));
                    lbup = "";
                }
                else {
                    lbl.setText(String.valueOf(df));
                    lblUp.setText(lbup + String.valueOf(df));
                    lbup = "";
                }
            }

        }
        else if(tmp == 3){
            int dv = bc - ab;
            lbl.setText(String.valueOf(dv));
            lbup += "=";
            lblUp.setText(lbup + String.valueOf(dv));
            lbup = "";
        }
        else if(tmp == 4){
            int dv = ab * bc;
            lbl.setText(String.valueOf(dv));
            lbup += "=";
            lblUp.setText(lbup + String.valueOf(dv));
            lbup = "";
        }

        ab = dv;
//        bc = 0;
        lblComms.setText(Comms());
    }

    String rNum1 = "";
    String rNum2 = "";
    int rNumAr = 0;
//    char[] rNms = new char[10];
    static int i = 0;
    RomeConvert rmc = new RomeConvert();





    @FXML
    private void rIclick(ActionEvent event){

        rNum1 += "I";
        lbl.setText(rNum1);
//        rNms[i] = "I";
//        i++;

    }

    @FXML
    private void rVclick(ActionEvent event){
        rNum1 += "V";
        lbl.setText(rNum1);
    }

    @FXML
    private void rXclick(ActionEvent event){
        rNum1 += "X";
        lbl.setText(rNum1);
    }

    @FXML
    private void rLclick(ActionEvent event){
        rNum1 += "L";
        lbl.setText(rNum1);
    }

    @FXML
    private void rCclick(ActionEvent event){
        rNum1 += "C";
        lbl.setText(rNum1);
    }

    @FXML
    private void rDclick(ActionEvent event){
        rNum1 += "D";
        lbl.setText(rNum1);
    }

    @FXML
    private void rMclick(ActionEvent event){
        rNum1 += "M";
        lbl.setText(rNum1);
    }

    @FXML
    private void rLeftClick(ActionEvent event){
//        rNum1 += "<";
        lbl.setText(rNum1);
    }

    @FXML
    private void rRightClick(ActionEvent event){
//        rNum1 += ">";
        lbl.setText(String.valueOf(rmc.rNumsConv(rNum1)));
    }

    @FXML
    private void r0click(ActionEvent event){
        rNum1 = "";
        lbl.setText(rNum1);
        rNumAr = 0;
        tmp = 0;
    }

    @FXML
    private void rPlusClick(ActionEvent event){
//        rNum1 += "+";
        lbl.setText("+");
        rNum2 = rNum1;
        rNum1 = "";
        tmp = 1;
    }

    @FXML
    private void rMinClick(ActionEvent event){
//        rNum1 += "-";
        lbl.setText(rNum1);
        rNum2 = rNum1;
        rNum1 = "";
        tmp = 3;

    }

    @FXML
    private void rDivClick(ActionEvent event){
//        rNum1 += "/";
        lbl.setText(rNum1);
        rNum2 = rNum1;
        rNum1 = "";
        tmp = 2;
    }

    @FXML
    private void rMultClick(ActionEvent event){
//        rNum1 += "*";
        lbl.setText(rNum1);
        rNum2 = rNum1;
        rNum1 = "";
        tmp = 4;
    }


//    char[] rNm = rNum1.toCharArray();

    @FXML
    public void rEqClick(ActionEvent event){
        if(tmp == 1){
        rNumAr = (rmc.rNumsConv(rNum2)) + (rmc.rNumsConv(rNum1));



        lbl.setText(rmc.ArabConv(rNumAr));
        rNum1 = rmc.ArabConv(rNumAr);

        }

        if(tmp == 2){
//            rNumAr = rPlus(rNum1);
//            lbl.setText(rFlip(rDivD(rNum2,rNum1)));
        }

        if(tmp == 3){
//            rNumAr = rPlus(rNum1);
//            lbl.setText(rFlip(rMinD(rNum2,rNum1)));
        }

        if(tmp == 4){
//            rNumAr = rPlus(rNum1);
//            lbl.setText(rFlip(rMulD(rNum2,rNum1)));
        }

    }






    int rPlusD(String a, String b){
        int c = 0;
//        c = rPlus(a) + rPlus(b);
        return c;
    }

    int rMinD(String a, String b){
        int c = 0;
//        c = rPlus(a) - rPlus(b);
        return c;
    }

    int rDivD(String a, String b){
        int c = 0;
//        c = rPlus(a) / rPlus(b);
        return c;
    }

    int rMulD(String a, String b){
        int c = 0;
//        c = rPlus(a) * rPlus(b);
        return c;
    }

}