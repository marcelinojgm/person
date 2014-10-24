/**
 * Ejercicio propuesto en clase de construcción de una clase 
 * Al crear un objeto de la clse person se ha de poder introducir la edad
 * Crear un metodo de retorne la edad
 */
public class Person
{
    private int age;
    /**
     * introducir la edad de la persona
     */
    public Person(int newAge) 
    {
        
        age = newAge;
    }
    public int getEdad()
    {
        return age;
    }
}
