package com.utadeo.kalessi.modelos;
// Generated 29-abr-2019 22:04:25 by Hibernate Tools 4.3.1



/**
 * HijosSubditosId generated by hbm2java
 */
public class HijosSubditosId  implements java.io.Serializable {


     private int idhijosSubditos;
     private int subditosIdsubditos;
     private int subditosTerritoriosIdterritorios;

    public HijosSubditosId() {
    }

    public HijosSubditosId(int idhijosSubditos, int subditosIdsubditos, int subditosTerritoriosIdterritorios) {
       this.idhijosSubditos = idhijosSubditos;
       this.subditosIdsubditos = subditosIdsubditos;
       this.subditosTerritoriosIdterritorios = subditosTerritoriosIdterritorios;
    }
   
    public int getIdhijosSubditos() {
        return this.idhijosSubditos;
    }
    
    public void setIdhijosSubditos(int idhijosSubditos) {
        this.idhijosSubditos = idhijosSubditos;
    }
    public int getSubditosIdsubditos() {
        return this.subditosIdsubditos;
    }
    
    public void setSubditosIdsubditos(int subditosIdsubditos) {
        this.subditosIdsubditos = subditosIdsubditos;
    }
    public int getSubditosTerritoriosIdterritorios() {
        return this.subditosTerritoriosIdterritorios;
    }
    
    public void setSubditosTerritoriosIdterritorios(int subditosTerritoriosIdterritorios) {
        this.subditosTerritoriosIdterritorios = subditosTerritoriosIdterritorios;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof HijosSubditosId) ) return false;
		 HijosSubditosId castOther = ( HijosSubditosId ) other; 
         
		 return (this.getIdhijosSubditos()==castOther.getIdhijosSubditos())
 && (this.getSubditosIdsubditos()==castOther.getSubditosIdsubditos())
 && (this.getSubditosTerritoriosIdterritorios()==castOther.getSubditosTerritoriosIdterritorios());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdhijosSubditos();
         result = 37 * result + this.getSubditosIdsubditos();
         result = 37 * result + this.getSubditosTerritoriosIdterritorios();
         return result;
   }   


}


