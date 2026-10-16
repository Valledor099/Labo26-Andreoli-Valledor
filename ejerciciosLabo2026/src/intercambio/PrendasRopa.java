package intercambio;

 public abstract class PrendasRopa {

    private String color;
    private Material material;
    private String marca;
    private Boolean estado;

    public PrendasRopa(String color, Material material, String marca, Boolean estado) {
        this.color = color;
        this.material = material;
        this.marca = marca;
        this.estado = estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return
                "color='" + color +
                ", material=" + material +
                ", marca='" + marca +
                ", estado=" + estado;
    }
}
