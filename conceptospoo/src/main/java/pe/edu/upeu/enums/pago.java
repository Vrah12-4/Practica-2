package pe.edu.upeu.enums;

enum TIPO_PAGO{Efectivo, Credito, Transferencia, Yape};

enum MES{Enero, Febrero, }

public class pago {
    TIPO_PAGO tipo;
    MES mes;
    double monto;
    String cuenta;
    double Impuesto;



    public static void main(String[] args) {
        pago p = new pago();
        p.tipo = TIPO_PAGO.Efectivo;
        p.mes = MES.Enero;
        p.monto = 100;
        p.cuenta = "Enero";
        p.Impuesto = 10;


        System.out.println("tipo pago ."+p.tipo);
        System.out.println("mes pago ."+p.mes);
        System.out.println("monto ."+p.monto);
        System.out.println("cuenta ."+p.cuenta);
        System.out.println("Impuesto ."+p.Impuesto);

        for (TIPO_PAGO t : TIPO_PAGO.values()) {
            System.out.println("tipo pago ."+t);
        }
    }
}
