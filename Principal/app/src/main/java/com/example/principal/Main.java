package com.example.principal;

    // Clase abstracta
    abstract class Factura {
        String nombrePropietario;

        // Constructor
        public Factura(String nombrePropietario) {
            this.nombrePropietario = nombrePropietario;
        }
    }

    // Clase hereda de la clase abstracta
    class Cliente extends Factura {
        // Constructor que utiliza el constructor de la clase base (super)
        public Cliente(String nombrePropietario) {
            super(nombrePropietario);
        }
    }

    public class Main {
        public static void main(String[] args) {
            // Crear objetos de las clases
            Cliente cliente1 = new Cliente("Carlos");

            System.out.println("Nombre cliente: " + cliente1.nombrePropietario);
        }
    }

