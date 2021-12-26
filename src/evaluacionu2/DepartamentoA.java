/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacionu2;

/**
 *
 * @author Victor Rodriguez
 */
public class DepartamentoA {
  Departamento ArrayD[];
  int cont;
  public DepartamentoA(){
      this.ArrayD= new Departamento[10];
      this.cont=0;
  }
  public void Agregar(Departamento Ad){
      this.ArrayD[cont]=Ad;
      cont++;
  }

    public Departamento getDepartamento(int i) {
        return this.ArrayD[i];
    }
  
  //public Departamento getD(int i) {
    //    return this.ArrayD[i];
   // }
  public int Buscar(double clave) {
        for (int x = 0; x < cont; x++) {
            if(clave==this.ArrayD[x].getClave()){
                return x;
            }

        }
        return -1;
    } 
  public String conA(double p){
      String d="", da="";
      for(int x=0; x<cont; x++){
          if(this.ArrayD[x].isDisponible()==true && this.ArrayD[x].getPrecio()<=p){
          if(this.ArrayD[x].isDisponible()==true){
      da=" ESTA DISPONIBLE";    
      }
      else{
          da=" NO ESTA DISPONIBLE";
      }    
          d+="LA CLAVE ES : "+this.ArrayD[x].getClave()+" LA EXTENCION ES DE: "+this.ArrayD[x].getExtension()
          +" LA UBICACION ES DE :"+this.ArrayD[x].getUbicacion()+" EL PRECIO ES DE: "+this.ArrayD[x].getPrecio()+da+"\n";     
          }
      } 
      return d;
  }
  public String conB(double s){
      String d="", da="";
      for(int x=0; x<cont; x++){
      if(this.ArrayD[x].isDisponible()==true && this.ArrayD[x].getExtension()>=s && this.ArrayD[x].getUbicacion().equals("excelente")){
      if(this.ArrayD[x].isDisponible()==true){
      da=" ESTA DISPONIBLE";    
      }
      else{
          da=" NO ESTA DISPONIBLE";
      }
      d+="LA CLAVE ES : "+this.ArrayD[x].getClave()+" LA EXTENCION ES DE: "+this.ArrayD[x].getExtension()
          +" LA UBICACION ES DE :"+this.ArrayD[x].getUbicacion()+" EL PRECIO ES DE: "+this.ArrayD[x].getPrecio()+da+"\n";    
      }    
      }
      return d;
  }
  public String conC(){
      String d="";
      for(int x=0; x<cont; x++){
          if(this.ArrayD[x].isDisponible()==false){
           d+="EL PRECIO ES DE: "+this.ArrayD[x].getPrecio()+"\n";
          }
      }
      return d;
  }
}
