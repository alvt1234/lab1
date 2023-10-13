package progra2;

public class Cuenta_Bancaria {
    private int codigo;
    private String nombre;
    private double saldo;
    
    public Cuenta_Bancaria(int codigo, String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
        saldo=500;
    }
    public void depositar(double monto){
        if(monto>0){
            saldo+=monto;
        }
    }
    public boolean retirar(double monto){
        if(monto>0&&monto<=saldo){
            saldo-=monto;
            return true;
        }
        return false;
    }
    public String print(){
       return ""+codigo+" Nombre: "+nombre+" Saldo: "+saldo;
    }
    public int getCodigo(){
        return codigo;
    }
    
    public double getSaldo(){
        return saldo;
    }
}
