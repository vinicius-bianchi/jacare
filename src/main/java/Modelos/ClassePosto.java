package Modelos;

/**
 * @author ViniciusBianchi
 */
public class ClassePosto {
    
    private int idPosto;
    private String nomePosto;
    private ClasseMunicipio classeMunicio;

    public ClassePosto(int idPosto, String nomePosto, ClasseMunicipio classeMunicio) {
        this.idPosto = idPosto;
        this.nomePosto = nomePosto;
        this.classeMunicio = classeMunicio;
    }

    public int getIdPosto() {
        return idPosto;
    }

    public void setIdPosto(int idPosto) {
        this.idPosto = idPosto;
    }

    public String getNomePosto() {
        return nomePosto;
    }

    public void setNomePosto(String nomePosto) {
        this.nomePosto = nomePosto;
    }

    public ClasseMunicipio getClasseMunicio() {
        return classeMunicio;
    }

    public void setClasseMunicio(ClasseMunicipio classeMunicio) {
        this.classeMunicio = classeMunicio;
    }

   
}
