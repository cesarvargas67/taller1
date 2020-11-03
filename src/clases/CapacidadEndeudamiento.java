package clases;

public class CapacidadEndeudamiento {

	Integer ingresosTotales;
    Integer gastosFijos;
    Integer gastoVaribales;
    
  //Metodos getter and setter para la clase
    
    public Integer getIngresosTotales() {
return ingresosTotales;
}

public void setIngresosTotales(Integer ingresosTotales) {
this.ingresosTotales = ingresosTotales;
}

public Integer getGastosFijos() {
return gastosFijos;
}

public void setGastosFijos(Integer gastosFijos) {
this.gastosFijos = gastosFijos;
}

public Integer getGastoVaribales() {
return gastoVaribales;
}

public void setGastoVaribales(Integer gastoVaribales) {
this.gastoVaribales = gastoVaribales;
}

final double por_fijo = 0.35;

    //Construye un metodo que retorne una cadena con las propiedades de la clase

    public double getCapacidadEndeudamiento(String ingresosTotales, String gastosFijos, 
                                   String gastoVaribales) {
                
    Double valor = (  Double.parseDouble(ingresosTotales) -
      Double.parseDouble(gastosFijos) -  Double.parseDouble(gastoVaribales)) * por_fijo;
        return valor;
    }
}

