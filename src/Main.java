import Enums.COLORES;
import Enums.MARCA;
import Enums.MOTOMARCA;
import Exceptions.DatosInvalidosException;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Automoviles> listaDeAutos = new ArrayList<Automoviles>();
        ArrayList<Motocicletas> listaDeMotos = new ArrayList<Motocicletas>();
        boolean bandera = false;

        System.out.println("--------------------------------------------------");
        System.out.println("¿Desea cargar Vehiculos? Ingrese 1 para sí, 2 para no");
        System.out.println("--------------------------------------------------");

        Scanner inputDecision = new Scanner(System.in);
        int decision = inputDecision.nextInt();

        if (decision == 1) {
            bandera = true;
        } else if (decision == 2) {
            System.out.println("Eligió no cargar ningún vehículo");
            bandera = false;
        } else {
            System.out.println("Ha ingresado un número incorrecto");
            bandera = false;
        }

        while (bandera) {
            System.out.println("--------------------------------------------------");
            System.out.println("¿Desea ingresar Automóvil o Motocicleta? Ingrese 1 para Automóvil, 2 para Motocicleta");
            System.out.println("--------------------------------------------------");

            Scanner inputEleccion = new Scanner(System.in);
            int eleccion = inputEleccion.nextInt();

            if (eleccion == 1) {
                Automoviles automovil = new Automoviles();
                try{
                    System.out.println("Ingrese el año del Automóvil:");
                    int anio = inputDecision.nextInt();
                    if(anio<1990){
                        throw new DatosInvalidosException("Dato invalido");
                    }else{
                        automovil.setAnio(anio);
                    }
                    System.out.println("Ingrese los kilómetros del Automóvil:");
                    int km = inputDecision.nextInt();
                    if(km < 0){
                        throw new DatosInvalidosException("Dato invalido");
                    }else{
                        automovil.setKm(km);
                    }

                }catch (DatosInvalidosException e){
                    System.out.println("Error: " + e.getMessage());
                }

                System.out.println("¿El motor está en buen estado? Ingrese false para sí, true para no:");
                boolean motor = !inputDecision.nextBoolean();
                automovil.setMotor(motor);

                System.out.println("Ingrese la marca del Automóvil:");
                System.out.println("1: TOYOTA, 2: FORD, 3: CHEVROLET");
                int marca = inputDecision.nextInt();

                switch (marca) {
                    case 1:
                        automovil.setMarca(MARCA.TOYOTA);
                        break;
                    case 2:
                        automovil.setMarca(MARCA.FORD);
                        break;
                    case 3:
                        automovil.setMarca(MARCA.CHEVROLET);
                        break;
                    default:
                        System.out.println("Marca no válida.");
                        break;
                }

                System.out.println("Ingrese el color deseado:");
                System.out.println("1: AZUL, 2: NEGRO, 3: BLANCO, 4: ROJO");
                int color = inputDecision.nextInt();

                switch (color) {
                    case 1:
                        automovil.setColor(COLORES.AZUL);
                        break;
                    case 2:
                        automovil.setColor(COLORES.NEGRO);
                        break;
                    case 3:
                        automovil.setColor(COLORES.BLANCO);
                        break;
                    case 4:
                        automovil.setColor(COLORES.ROJO);
                        break;
                    default:
                        System.out.println("Color no válido.");
                        break;
                }

                listaDeAutos.add(automovil);

                System.out.println("Se ha cargado correctamente el automóvil.");
                System.out.println("Los datos ingresados son:");
                System.out.println("Marca: " + automovil.getMarca());
                System.out.println("Año: " + automovil.getAnio());
                System.out.println("Color: " + automovil.getColor());
                System.out.println("Kilómetros: " + automovil.getKm());
                System.out.println("¿Desea seguir cargando vehículos? Ingrese 1 para sí, 2 para no");
                decision = inputDecision.nextInt();

                if (decision != 1) {
                    bandera = false;
                    System.out.println("Ha salido del programa exitosamente.");
                }
            } else {
                Motocicletas motocicleta = new Motocicletas();
                try{
                    System.out.println("Ingrese el año de la motocicltea:");
                    int anio = inputDecision.nextInt();
                    if(anio<1990){
                        throw new DatosInvalidosException("Dato invalido");
                    }else{
                        motocicleta.setAnio(anio);
                    }
                    System.out.println("Ingrese los kilómetros de la motocicleta:");
                    int km = inputDecision.nextInt();
                    if(km < 0){
                        throw new DatosInvalidosException("Dato invalido");
                    }else{
                        motocicleta.setKm(km);
                    }

                    System.out.println("Ingrese los cc de la motocicleta:");
                    int cc = inputDecision.nextInt();
                    motocicleta.setCc(cc);

                }catch (DatosInvalidosException e){
                    System.out.println("Error: " + e.getMessage());
                }



                System.out.println("¿El motor está en buen estado? Ingrese false para sí, true para no:");
                boolean motor = !inputDecision.nextBoolean();
                motocicleta.setMotor(motor);

                System.out.println("Ingrese la marca de la Motocicleta:");
                System.out.println("1: BMW, 2: YAMAHA, 3: MOTOMEL, 4: ZANELLA");
                int marca = inputDecision.nextInt();

                switch (marca) {
                    case 1:
                        motocicleta.setMarca(MOTOMARCA.BMW);
                        break;
                    case 2:
                        motocicleta.setMarca(MOTOMARCA.YAMAHA);
                        break;
                    case 3:
                        motocicleta.setMarca(MOTOMARCA.MOTOMEL);
                        break;
                    case 4:
                        motocicleta.setMarca(MOTOMARCA.ZANELLA);
                        break;
                    default:
                        System.out.println("Marca no válida.");
                        break;
                }

                System.out.println("Ingrese el color deseado:");
                System.out.println("1: AZUL, 2: NEGRO, 3: BLANCO, 4: ROJO");
                int color = inputDecision.nextInt();

                switch (color) {
                    case 1:
                        motocicleta.setColor(COLORES.AZUL);
                        break;
                    case 2:
                        motocicleta.setColor(COLORES.NEGRO);
                        break;
                    case 3:
                        motocicleta.setColor(COLORES.BLANCO);
                        break;
                    case 4:
                        motocicleta.setColor(COLORES.ROJO);
                        break;
                    default:
                        System.out.println("Color no válido.");
                        break;
                }

                listaDeMotos.add(motocicleta);

                System.out.println("Se ha cargado correctamente la motocicleta.");
                System.out.println("Los datos ingresados son:");
                System.out.println("Marca: " + motocicleta.getMarca());
                System.out.println("Cc: " + motocicleta.getCc());
                System.out.println("Estado del motor: " + motocicleta.getMotor());
                System.out.println("Año: " + motocicleta.getAnio());
                System.out.println("Color: " + motocicleta.getColor());
                System.out.println("Kilómetros: " + motocicleta.getKm());
                System.out.println("¿Desea seguir cargando vehículos? Ingrese 1 para sí, 2 para no");
                decision = inputDecision.nextInt();

                if (decision != 1) {
                    bandera = false;
                    System.out.println("Ha salido del programa exitosamente.");
                }
            }
        }

        System.out.println("Lista de automóviles cargados:");
        for (Automoviles automovil : listaDeAutos) {
            System.out.println("--------------------");
            System.out.println("Marca: " + automovil.getMarca());
            System.out.println("Estado del motor: " + (automovil.getMotor() ? "Necesita mantenimiento" : "En buen estado"));
            System.out.println("Año: " + automovil.getAnio());
            System.out.println("Color: " + automovil.getColor());
            System.out.println("Kilómetros: " + automovil.getKm());
        }

        System.out.println("Lista de motocicletas cargadas:");
        for (Motocicletas motocicletas : listaDeMotos) {
            System.out.println("--------------------");
            System.out.println("Marca: " + motocicletas.getMarca());
            System.out.println("Cc: " + motocicletas.getCc());
            System.out.println("Estado del motor: " + (motocicletas.getMotor() ? "Necesita mantenimiento" : "En buen estado"));
            System.out.println("Año: " + motocicletas.getAnio());
            System.out.println("Color: " + motocicletas.getColor());
            System.out.println("Kilómetros: " + motocicletas.getKm());
        }

        //AUTOS
        try{

            FileOutputStream fileOut = new FileOutputStream("ColeccionDeAutos.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(Automoviles auto : listaDeAutos){
                out.writeObject(auto);
            }
            out.close();
            fileOut.close();
            System.out.println("Los automoviles fueron guardados Correctamente");

        }catch (Exception e){
            e.printStackTrace();
        };

        try {
            FileInputStream fileIn = new FileInputStream("ColeccionDeAutos.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            while (true) {


                try {
                    Automoviles auto = (Automoviles) in.readObject();
                    System.out.println("-------------------------------");

                    System.out.println("---Los datos del automovil son---");
                    System.out.println("Marca: " + auto.getMarca());
                    System.out.println("Km: " + auto.getKm());
                    System.out.println("Estado del motor: " + auto.getMotor());
                    System.out.println("Color: " + auto.getColor());
                    System.out.println("Año: " + auto.getAnio());
                } catch (EOFException eof) {
                    break; // Se alcanzó el final del archivo
                }
            }

            in.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //MOTOS
        try{

            FileOutputStream fileOut = new FileOutputStream("ColeccionDeMotos.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            for(Motocicletas moto : listaDeMotos){
                out.writeObject(moto);
            }
            out.close();
            fileOut.close();
            System.out.println("Las motocicletas fueron cargadas correctamente");

        }catch (Exception e){
            e.printStackTrace();
        };

        try {
            FileInputStream fileIn = new FileInputStream("ColeccionDeMotos.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            while (true) {


                try {
                    Motocicletas moto = (Motocicletas) in.readObject();
                    System.out.println("-------------------------------");

                    System.out.println("---Los datos de la motocicleta son---");
                    System.out.println("Marca: " + moto.getMarca());
                    System.out.println("Km: " + moto.getKm());
                    System.out.println("Estado del motor: " + moto.getMotor());
                    System.out.println("Color: " + moto.getColor());
                    System.out.println("Año: " + moto.getAnio());
                } catch (EOFException eof) {
                    break; // Se alcanzó el final del archivo
                }
            }

            in.close();
            fileIn.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
