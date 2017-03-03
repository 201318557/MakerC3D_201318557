package org.compi2.codigo3d;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author esvux
 */
public class GeneradorDeCompiladores {
    
    public static void main(String[] args) {
        generarCompilador();
     /*  System.out.println("\n*** Generando ***\n");
        String archLexico;
        String archSintactico;
         if (args.length > 0) {
                        System.out.println("\n*** Procesando archivos custom ***\n");
                        archLexico = args[0];
                        archSintactico = args[1];
                    } else {
                        System.out.println("\n*** Procesando archivo default ***\n");
                        archLexico = "src\\org\\compi2\\codigo3d\\parser\\lexico.flex";
                        archSintactico = "src\\org\\compi2\\codigo3d\\parser\\sintactico.cup";
                    }
                    String[] alexico = {archLexico};
                    String[] asintactico = {"-parser", "scanner", archSintactico};
                    jflex.Main.main(alexico);
                    try {
                        java_cup.Main.main(asintactico);
                    } catch (Exception ex) {
                        Logger.getLogger(GeneradorDeCompiladores.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //movemos los archivos generados
                  /* boolean mvAL = moverArch("parser.java");
                   boolean mvAS = moverArch("scanner.java");
                   boolean mvSym= moverArch("sym.java");
                   if(mvAL && mvAS && mvSym){
                        System.exit(0);
                    }
                    System.out.println("Generado!");*/
    }
    
    public static boolean moverArch(String archNombre) {
        boolean efectuado = false;
        File arch = new File(archNombre);
        if (arch.exists()) {
            System.out.println("\n*** Moviendo " + arch + " \n***");
            Path currentRelativePath = Paths.get("");
            String nuevoDir = currentRelativePath.toAbsolutePath().toString()
                    + File.separator + "src" + File.separator
                    + "src\\org\\compi2\\codigo3d\\parser" + File.separator + arch.getName();
            File archViejo = new File(nuevoDir);
            archViejo.delete();
            if (arch.renameTo(new File(nuevoDir))) {
                System.out.println("\n*** Generado " + archNombre + "***\n");
                efectuado = true;
            } else {
                System.out.println("\n*** No movido " + archNombre + " ***\n");
            }

        } else {
            System.out.println("\n*** Codigo no existente ***\n");
        }
        return efectuado;
    }
    
    private static void generarCompilador(){
        try {
            String ruta = "src/org/compi2/codigo3d/parser/";
            String opcFlex[] = { ruta + "lexico.flex", "-d", ruta };
            jflex.Main.generate(opcFlex);
            String opcCUP[] = { "-destdir", ruta, "-parser", "parser", ruta + "sintactico.cup" };
            java_cup.Main.main(opcCUP);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
