package principal;

public class Persona {
    //atributos
    private String dni;
    String nombre;
    short edad;
    float altura;
    float peso;

    //metodos
    //método set:establecer de dni


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public float IMC()
    {
        float imc;
        imc = (float) (peso / Math.pow(altura,2));
        return imc;
    }

    public void Verificar()
    {
        System.out.println("DNI: "+dni);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad+" años");
        System.out.println("Altura: "+altura+" metros");
        System.out.println("Peso: "+peso+" kg");

    }

    public void Clasificacion()
    {
        float imc = IMC(); //esta asignando el return del metodo IMC()
        if(imc<16)
        {
            System.out.println("INFRAPESO: Delgadez Severa");
        } else if (imc>=16 && imc<17) {
            System.out.println("INFRAPESO: Delgadez Moderada");
            
        } else if (imc>=17 && imc<18.5) {
            System.out.println("INFRAPESO: Delgadez Aceptable");
        } else if (imc>=18.5 && imc<25) {
            System.out.println("Peso Normal");
        } else if (imc>=25 && imc<30) {
            System.out.println("Sobrepeso");
        } else if (imc>=30 && imc<35) {
            System.out.println("OBESO: Tipo I");
        } else if (imc>=35 && imc<=40) {
            System.out.println("OBESO: Tipo II");
        }
        else
        {
            System.out.println("OBESO: Tipo III");
        }


    }

    //constructores

    public Persona() //constructor por defecto, un objeto vacío de tipo persona
    {

    }

    public Persona(String dni, String nombre, short edad, float altura, float peso) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
    }
}
