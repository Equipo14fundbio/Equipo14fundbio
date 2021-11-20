package com.app.jaunfix.datamodels;

public class Value {
    private String valorId,fechaId,horaId,edadId;

    public Value() {

    }

    public Value(String valorId, String fechaId, String horaId,String edadId) {
        this.valorId = valorId;
        this.fechaId = fechaId;
        this.horaId = horaId;
        this.edadId = edadId;
    }

    public void setValorId(String valorId){
        this.valorId = valorId;
    }

    public void setFechaId(String fechaId) {
        this.fechaId = fechaId;
    }

    public void setHoraId(String horaId) {
        this.horaId = horaId;
    }
    public void setEdadId(String edadId) {
        this.edadId = edadId;
    }

    ////GETTERS////
    public String getValorId() {
        return valorId;
    }
    public String getFechaId() {
        return fechaId;
    }
    public String getHoraId() {
        return horaId;
    }

    public String getEdadId() {
        return edadId;
    }

}
