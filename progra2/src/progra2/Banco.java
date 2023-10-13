package progra2;

import javax.swing.JOptionPane;

public class Banco {
    
    private double tasaInteres;
    private int longitud;
    
    public Banco(int longitud){
        tasaInteres=0.05;
        this.longitud=longitud;
    }
    
    public Cuenta_Bancaria buscar(int codigo){
        for(Cuenta_Bancaria account:Globals.cuentas){
            if(account.getCodigo()==codigo)
                return account;
        }return null;
    }
    
    public boolean agregar(int codigo,String nombre){
        for(int i=0;i<longitud;i++){
            Cuenta_Bancaria cuenta=Globals.cuentas.get(i);
            if(codigo==cuenta.getCodigo())
                return false;
        } Globals.cuentas.add(new Cuenta_Bancaria(codigo,nombre));
        return true;
    }
    
    public void transferir(int origen,int destino,double monto){
         if(buscar(origen)!=null&&buscar(destino)!=null){
            if(buscar(origen).retirar(monto)){
            buscar(destino).depositar(monto);
            JOptionPane.showMessageDialog(null, "Transferencia realizada");
            }
            else JOptionPane.showMessageDialog(null, "El monto a transferir es mayor al saldo de la cuenta de origen");
        }
        else JOptionPane.showMessageDialog(null, "Una de las  cuentas ingresadas no existe");

    }
    
    public void intereses(){
       for(Cuenta_Bancaria account:Globals.cuentas){
           double saldo_interes=account.getSaldo()*tasaInteres;
           account.depositar(saldo_interes);
       } 
    }
    
    
   public void lista(double monto){
       for(int i=0; i<Globals.cuentas.size();i++){
           Cuenta_Bancaria cuenta=Globals.cuentas.get(i);
           if(monto<=cuenta.getSaldo()){
               cuenta.print();
           }
       }
   }
   
   
   
   
}
