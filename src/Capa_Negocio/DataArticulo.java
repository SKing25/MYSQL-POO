package Capa_Negocio;

import Capa_Datos.Conexion;

public class DataArticulo {
    private String art_cod;
    private String art_nom;
    private String art_uni;
    private String art_pre;
    private int art_stk;
    private String art_marca;

    public String EliminarArticulo() {
        Conexion objmod = new Conexion();
        String cad = "delete from articulo where art_cod ='" + this.getArt_cod();
    }
}
