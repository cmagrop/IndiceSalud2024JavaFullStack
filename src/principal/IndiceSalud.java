package principal;

import java.util.Scanner;

public class IndiceSalud {

    //atributos
    //metodos


    public static void main(String[] args) {
        /*principal.Persona persona1 = new principal.Persona(); //creando clon(objeto) de principal.Persona
        persona1.dni="12.345.678-9";
        persona1.nombre="Juanito Pérez";
        persona1.edad=40;
        persona1.altura= (float)1.75;
        persona1.peso= 80f;
        //mostrar la información y llamar a verificar()
        //persona1.Verificar();
        persona1.Clasificacion();
         */


        //menu();
        mostrarPersonaNueva();


    }

    public static void mostrarPersonaNueva()
    {
        Persona personaNueva = new Persona("8181790-1",
                "Alonso Tapia",(short)58,1.74f,(float)79);

        personaNueva.Verificar();
        imprimir(personaNueva);
    }

    public static void menu()
    {
        Persona persona = new Persona();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese DNI:");
        persona.setDni(leer.next());
        System.out.println("Ingrese su nombre:");
        persona.nombre=leer.next();
        System.out.println("Ingrese edad:");
        persona.edad = leer.nextShort();
        System.out.println("Ingrese altura en metros");
        String alturaI = leer.next();
        alturaI = alturaI.replace(',','.');
        float alturaF =  Float.parseFloat(alturaI);
        persona.altura = alturaF;
        System.out.println("Ingrese el peso en kg");
        String pesoI = leer.next();
        pesoI = pesoI.replace(',','.');
        float pesoF = Float.parseFloat(pesoI);
        persona.peso = pesoF;
        imprimir(persona);


    }

    public static void imprimir(Persona persona)
    {
        System.out.println(persona.getDni());
        float imc = persona.IMC();
        System.out.println("El valor de su IMC es "+imc);
        persona.Clasificacion();
    }


}