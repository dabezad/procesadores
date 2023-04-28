package proyecto;

/*
Sus objetos son autómatas finitos con un número "numEstados" de estados
indexados desde 0 hasta numEstados-1. Fijamos que el estado 0 sea siempre el inicial.
Utilizamos un entero "tamAlfabeto” para representar el número de caracteres del alfabeto. Los caracteres serán también enteros indexados desde 0 en adelante.
Podemos representar los estados finales con un vector de booleanos o un Set de enteros. Se puede utilizar otro atributo para indicar el estado actual
*/
public abstract class AutomataFinito {
    private int numEstados;
    private boolean[] finales;
    private int tamAlfabeto;
// private int estActual;
}
