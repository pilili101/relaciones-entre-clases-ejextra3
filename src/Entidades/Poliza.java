package Entidades;


import Enum.FormaPago;
import Enum.Cobertura;
import java.util.ArrayList;
import java.util.Date;

public class Poliza {

    private Vehiculo vehiculo;
    private Cliente cliente;
    private Long npoliza;
    private Date fechainicio;
    private Date finPoliza;
    private int cantidadCuotas;
    private FormaPago fp;
    private int montoTotalAsegurado;
    private Boolean granizo;
    private int montoGranizo;
    private Cobertura cobertura;
    private ArrayList<Cuota> cuotas;
}
