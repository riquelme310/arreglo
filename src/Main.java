import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String [] vehiculo={"carro","moto","avion","submarino","tanque","yate","bicicleta","tractomula"};

        for(String i:vehiculo){
            JOptionPane.showMessageDialog(null, "vehiculo: \n"+i);
        }

    }

}