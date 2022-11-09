import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        prueba1();

        prueba2();

        prueba3();

    }

    private static void prueba1(){
        try {
            File file = new File("prueba1.txt");

            FileWriter fileWriter = new FileWriter(file);

            fileWriter.write("En esta prueba el archivo se crea cada vez que el código se ejecuta");

            fileWriter.close();
        }catch(IOException ex){

        }finally{
            System.out.println("Creo el archivo txt 1 ");
        }
    }

    private static void prueba2() {
    int i=1;
        while (i != 4) {
            try {
                File file = new File("prueba2.txt");

                FileWriter fileWriter = new FileWriter(file, true);

                fileWriter.write("En esta prueba el archivo crece en cada ejecución, lo nuevo se añade al final\n");

                fileWriter.close();
            } catch (IOException ex) {

            } finally {
                System.out.println("Creo el archivo txt 2 con la linea "+ i);
            }
            i++;
        }
    }

    private static void prueba3() {
        try {
            File file = new File("prueba3.txt");
            FileWriter fileWriter = new FileWriter(file);
            try {
                fileWriter.write("En esta prueba ocurrirá un error\n");
                fileWriter.write("El resultado fallará: " + (1 / 0));
            } catch (ArithmeticException ae) {

            }
            fileWriter.close();

        }catch(IOException ex){

        }finally{
            System.out.println("Se creo el archivo txt 3 ");
        }
    }
}
