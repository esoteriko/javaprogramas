public class Multiplos
{
    public static void main(String args[])
    {
        int contador = 0; //Iniciamos el contador en cero

        for(int i = 0; i <= 10000; i++)
        {
            if(i % 20 == 0) //Preguntamos si el residuo es 0 (es múltiplo de 20)
            {
                contador++; //Si es múltiplo aumentamos el contador en 1
            }
            //Si no es múltiplo no hacemos nada
        }

        //Mostramos el valor del contador
        System.out.println(contador);
    }
}