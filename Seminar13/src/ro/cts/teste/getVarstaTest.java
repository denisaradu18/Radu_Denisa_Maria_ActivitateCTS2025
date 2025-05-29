package ro.cts.teste;

import org.junit.Test;
import ro.cts.clase.Persoana;
import ro.cts.exceptii.CNPInexistent;
import ro.cts.exceptii.ExceptieCNPInvalid;

import static com.sun.tools.javac.resources.CompilerProperties.Errors.Expected;
import static org.junit.Assert.*;

public class getVarstaTest {
    private Persoana persoana;

    @org.junit.Before
    public void setUp() throws Exception {
        persoana=new Persoana();

    }

    @org.junit.Test
    public void getVarstaRight() {
        persoana=new Persoana("Denisa", "6031118987656");
        assertEquals(21,persoana.getVarsta());
    }

    @org.junit.Test
    public void getVarstaBoundery() {
        persoana=new Persoana("Denisa", "2991231987656");
        assertEquals(25,persoana.getVarsta());
    }

    @org.junit.Test
    public void getVarstaBoundery2() {
        persoana=new Persoana("Denisa", "5000101987656");
        assertEquals(25,persoana.getVarsta());
    }


    @org.junit.Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaError() {
        persoana=new Persoana("Denisa", "5m00101987656");
        persoana.getVarsta();
    }

    @org.junit.Test(expected = ExceptieCNPInvalid.class)
    public void getVarstaError2() {
        persoana=new Persoana("Denisa", "5001501987656");
        persoana.getVarsta();
    }

    @org.junit.Test(timeout = 10)
    public void getVarstaPerformance() {
        persoana=new Persoana("Denisa", "5000101987656");
        persoana.getVarsta();
    }

    @Test
    public void getVarstaOrder(){
        persoana =new Persoana("Maria", "5000101987656");
        Persoana persoana1=new Persoana("Bianca","2980101987656");
        assertTrue(persoana.getVarsta()<persoana1.getVarsta());
    }

    @Test(expected = CNPInexistent.class)
    public void getVarstaExstence(){
        persoana=new Persoana("Alina", null);
        persoana.getVarsta();
    }
    @Test
    public void getVarstaCardinality1(){
        persoana =new Persoana("Maria", "5250101987656");
        persoana.getVarsta();
    }
    @Test
    public void getVarstaCardinality0(){
        persoana =new Persoana("Maria", "5260101987656");
        assertEquals(0, persoana.getVarsta());
    }




}