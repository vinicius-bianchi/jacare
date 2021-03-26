package Modelos;

/**
 *
 * @author ViniciusBianchi
 */
public class ClasseMunicipio extends ClasseEstado {
    
    private final int idMuncipio;
    public String NomeMunicipio;
    public String NomeEstado;

    public ClasseMunicipio(int idMuncipio, String NomeMunicipio, String NomeEstado, int idEstado, String nomeEstado) {
        super(idEstado, nomeEstado);
        this.idMuncipio = idMuncipio;
        this.NomeMunicipio = NomeMunicipio;
        this.NomeEstado = NomeEstado;
    }

    public String getNomeMunicipio() {
        return NomeMunicipio;
    }

    public void setNomeMunicipio(String NomeMunicipio) {
        this.NomeMunicipio = NomeMunicipio;
    }

    public String getNomeEstado() {
        return NomeEstado;
    }

    public void setNomeEstado(String NomeEstado) {
        this.NomeEstado = NomeEstado;
    }


    
}
