import Enums.COLORES;
import Enums.MARCA;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        ArrayList <Automoviles> listaDeAutos = new ArrayList<Automoviles>();
        ArrayList <Motocicletas> listaDeMotos = new ArrayList<Motocicletas>();
        Boolean bandera = false;
        System.out.println("¿Desea cargar Vehiculos? -- Ingrese 1 si lo desea o 2 si no lo desea --");
        Scanner inputDecision = new Scanner(System.in);
        int decision;
        decision = inputDecision.nextInt();
        if(decision == 1){
            bandera = true;
        } else if (decision == 2) {
            System.out.println("Eligio no cargar ninguno vehiculo");
            bandera = false;
        } else{
            System.out.println("Digito un numero incorrecto");
            bandera = false;
        }
        while(bandera == true){
            System.out.println("¿Desea ingresar Automovil o Motocicleta? -- Digite 1 por automovil o 2 por motocicleta --");
            Scanner inputEleccion = new Scanner(System.in);
            int eleccion = inputEleccion.nextInt();
            if(eleccion == 1){
                Automoviles automovil = new Automoviles();
                System.out.println("Ingrese el anio del Automovil");
                Scanner inputAnio = new Scanner(System.in);
                int anio = inputAnio.nextInt();
                automovil.setAnio(anio);
                System.out.println("Ingrese el km del Automovil");
                Scanner inputKm = new Scanner(System.in);
                int km = inputKm.nextInt();
                automovil.setKm(km);
                System.out.println("Ingrese la marca del Automovil");
                System.out.println("1: TOYOTA -- 2: FORD -- 3: CHEVROLET");
                Scanner inputMarca = new Scanner(System.in);
                int marca = inputMarca.nextInt();
                switch (marca) {
                    case 1:
                        System.out.println("Seleccionó TOYOTA.");
                        automovil.setMarca(MARCA.TOYOTA);
                        break;
                    case 2:
                        System.out.println("Seleccionó FORD.");
                        automovil.setMarca(MARCA.FORD);
                        break;
                    case 3:
                        System.out.println("Seleccionó CHEVROLET.");
                        automovil.setMarca(MARCA.CHEVROLET);
                        break;
                    default:
                        System.out.println("Marca no válida.");
                        break;
                }
                System.out.println("Ingrese el color deseado");
                System.out.println("1:AZUL -- 2:NEGRO -- 3:BLANCO -- 4:ROJO");
                Scanner inputColor = new Scanner(System.in);
                int color = inputColor.nextInt();
                switch (color) {
                    case 1:
                        System.out.println("Seleccionó AZUL");
                        automovil.setColor(COLORES.AZUL);
                        break;
                    case 2:
                        System.out.println("Seleccionó NEGRO.");
                        automovil.setColor(COLORES.NEGRO);
                        break;
                    case 3:
                        System.out.println("Seleccionó BLANCO.");
                        automovil.setColor(COLORES.BLANCO);
                        break;
                    case 4:
                        System.out.println("Seleccionó ROJO");
                        automovil.setColor(COLORES.ROJO);
                    default:
                        System.out.println("Color no valido.");
                        break;
                }
                System.out.println("Se cargo correctamente el automovil");
                listaDeAutos.add(automovil);
                System.out.println("Los datos ingresados fueron: ");
                System.out.println("Marca: " + automovil.getMarca());
                System.out.println("Anio: " + automovil.getAnio());
                System.out.println("Color: " + automovil.getColor());
                System.out.println("KM: " + automovil.getKm());
                System.out.println("¿Desea seguir cargando vehiculos? -- Ingrese 1 si lo desea o 2 si no lo desea --");
                decision = inputDecision.nextInt();
                if(decision == 1){
                    bandera = true;
                }else{
                    bandera = false;
                    System.out.println("Salio del programa exitosamente");
                }

            }else{
                Motocicletas motocicleta = new Motocicletas();
                System.out.println("Ingrese el anio de la motocicleta");
                Scanner inputAnio = new Scanner(System.in);
                int anio = inputAnio.nextInt();
                motocicleta.setAnio(anio);
                System.out.println("Ingrese el km de la motocicleta");
                Scanner inputKm = new Scanner(System.in);
                int km = inputKm.nextInt();
                motocicleta.setKm(km);
                System.out.println("Ingrese los cc de la motocicleta");
                Scanner inputCc = new Scanner(System.in);
                int cc = inputCc.nextInt();
                motocicleta.setCc(cc);
                System.out.println("Ingrese el color deseado");
                System.out.println("1:AZUL -- 2:NEGRO -- 3:BLANCO -- 4:ROJO");
                Scanner inputColor = new Scanner(System.in);
                int color = inputColor.nextInt();
                switch (color) {
                    case 1:
                        System.out.println("Seleccionó AZUL");
                        motocicleta.setColor(COLORES.AZUL);
                        break;
                    case 2:
                        System.out.println("Seleccionó NEGRO.");
                        motocicleta.setColor(COLORES.NEGRO);
                        break;
                    case 3:
                        System.out.println("Seleccionó BLANCO.");
                        motocicleta.setColor(COLORES.BLANCO);
                        break;
                    case 4:
                        System.out.println("Seleccionó ROJO");
                        motocicleta.setColor(COLORES.ROJO);
                    default:
                        System.out.println("Color no valido.");
                        break;
                }
                System.out.println("Se cargo correctamente la motocicleta");
                listaDeMotos.add(motocicleta);
                System.out.println("Los datos ingresados fueron: ");
                System.out.println("Marca: " + motocicleta.getCc());
                System.out.println("Anio: " + motocicleta.getAnio());
                System.out.println("Color: " + motocicleta.getColor());
                System.out.println("KM: " + motocicleta.getKm());
                System.out.println("¿Desea seguir cargando vehiculos? -- Ingrese 1 si lo desea o 2 si no lo desea --");
                decision = inputDecision.nextInt();
                if(decision == 1){
                    bandera = true;
                }else{
                    bandera = false;
                    System.out.println("Salio del programa exitosamente");
                }
            }

        }
        System.out.println("Lista de automóviles cargados:");
        for (Automoviles automovil : listaDeAutos) {
            System.out.println("Marca: " + automovil.getMarca());
            System.out.println("Año: " + automovil.getAnio());
            System.out.println("Color: " + automovil.getColor());
            System.out.println("KM: " + automovil.getKm());
            System.out.println("--------------------");
        }
        System.out.println("Lista de motocicletas cargadas:");
        for (Motocicletas motocicletas : listaDeMotos) {
            System.out.println("Cc: " + motocicletas.getCc());
            System.out.println("Año: " + motocicletas.getAnio());
            System.out.println("Color: " + motocicletas.getColor());
            System.out.println("KM: " + motocicletas.getKm());
            System.out.println("--------------------");
        }
        }
    }

