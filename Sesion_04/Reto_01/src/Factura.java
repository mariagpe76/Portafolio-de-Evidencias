public class Factura {
    String folio;
    String cliente;
    double total;

    public Factura(String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }
    @Override
    public String toString() {
        return "📄 Factura [Folio = " + folio + ",  Cliente = " + cliente + ", Total = $" + total + "]";
    }

    public boolean equal(Object o){
        if(this == o){
            return true;
        }
        if(o == null || getClass() != o.getClass()){
            return false;
        }
        Factura nueva = (Factura) o;
        return this.folio.equals(nueva.folio);
    }
    @Override
    public int hashCode(){
        return folio.hashCode();
    }
}
