/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author Brett
 */
public class NegativeStatsException extends Exception 
{
    public NegativeStatsException(String message)
    {
          System.err.println(message);
    }
}