/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

public class TipoActivo {
    private int idTipoActivo;
    private String nombreTipoActivo;

    public TipoActivo(int idTipoActivo, String nombreTipoActivo) {
        this.idTipoActivo = idTipoActivo;
        this.nombreTipoActivo = nombreTipoActivo;
    }

    public int getIdTipoActivo() {
        return idTipoActivo;
    }

    public String getNombreTipoActivo() {
        return nombreTipoActivo;
    }

    @Override
    public String toString() {
        return nombreTipoActivo; // Esto determina lo que se muestra en el JComboBox
    }
}

