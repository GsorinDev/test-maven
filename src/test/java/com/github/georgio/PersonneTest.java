package com.github.georgio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PersonneTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void CanHello()
    {
        Personne personne = new Personne();
        assertEquals(personne.Hello(), "Personne" );
    }
}
