package Ejercicio6Practica8;

    public class Vehiculo { //SUPERCLASE

        // Atributos de la superclase
        public int modeloVehiculo;
        public String nombreVehiculo="";
        // Metodo de la superclase
        public String transportar(){
            return "Metodo transportar de clase Vehiculo";
        }
}

    // SUBCLASES PRIMARIAS    
     class Acuatico extends Vehiculo{ // SUBCLASE PRIMARIA DE LA SUPER CLASE VEHICULO
        // atributos de la subclase Acuatico
        public String nombreAcuatico="";
        // metodo de la subclase Acuatico
        public String navegar(){
            return "Metodo navegar de clase Acuatico";
        }
    }

     class Aereo extends Vehiculo{ // SUBCLASE PRIMARIA DE LA SUPER CLASE VEHICULO
        // atributos de la subclase Aereo
        public String nombreAereo="";
        // metodos de la subclase Aereo
        public String volar(){
            return "Metodo volar desde clase Aereo";
        }
    }

    // SUBCLASES SECUNDARIAS de las SUBLASES PRIMARIAS
     class Barco extends Acuatico{ // SUBCLASE QUE DERIVA DE LA SUBCLASE PRIMARIA ACUATICO QUE A SU VEZ DERIVA DE LA SUPER CLASE VEHICULO
        // metodo de la Suclase Barco
        public String prenderMotor(){
            return "Metodo prenderMotor en la clase Barco";
        }
    }

     class Velero extends Barco{ 
    // SUBCLASE QUE DERIVA DE LA SUBCLASE PRIMARIA BARCO, QUE A SU VEZ DERIVA DE LA SUBCLASE ACUATICO QUE A SU VEZ DERIVA DE LA SUPER CLASE VEHICULO
        // metodo de la subclase Velero
        public String izarVelas(){
            return "Metodo izarVelas en clase Velero";
        }
    }

     class Avion extends Aereo{ // SUBCLASE QUE DERIVA DE LA SUBCLASE PRIMARIA AEREO QUE A SU VEZ DERIVA DE LA SUPER CLASE VEHICULO
        // metodo de la Subclase Avion
        public String bajarTrenDeAterrizaje(){
            return "Metodo bajarTrenDeAterrizaje en clase Avion";
        }
    }

     class Helicoptero extends Aereo{ //SUBCLASE QUE DERIVA DE LA SUBCLASE PRIMARIA AEREO QUE A SU VEZ DERIVA DE LA SUPER CLASE VEHICULO
        // metodo de la Subclase Helicoptero
        public String encenderHelices(){
            return "Metedo encenderHelices en clase Helicoptero";
        }
    }

