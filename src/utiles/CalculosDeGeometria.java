package utiles;
public class CalculosDeGeometria {
    public static double perimetroCuadrado (double lado){
    /**Este metodo calcula el perimetro de un cuadrado
     * lado: es el lado cualquiera de un cuadrado
     */
        return lado*4;
    }
    public static double perimetroRectangulo (double base, double altura){
    /**Este metodo calcula el perimetro de un resctangulo
     * base: es la base de un rectangulo
     * altura: es la altura de un rectangulo
     */
        return (2*base)+(2*altura);
    }
    public static double perimetroCirculo(double diametro){
    /**Este metodo calcula el perimetro de un circulo
     * diametro: es el diametro del circulo
     */
        double PI=3.14;
        return diametro*PI;
    }
    public static double perimetroTriangulo (double lado1, double lado2, double lado3){
    /**Este metodo calcula el perimetro de un triangulo
     * lado1: es uno de los lados del triangulo
     */
        return lado1+lado2+lado3;
    }
    public static double volumenCilindro(double radio, double altura){
    /**Este metodo calcula el volumen de un cilindro
     * radio: es el radio del cilindro
     * altura: es la altura del cilindro
     */
        double PI=3.14;
        return PI*radio*radio*altura;
    }
    public static double volumenCubo (double arista){
    /**Este metodo calcula el volumen de un cubo
     * arista: es una de las aristas del cubo
     */
        return arista*arista*arista;
    }
    public static double volumenPiramideCuadrangular (double lado, double altura){
    /**Este metodo calcula el volumen de una piramide cuadrangular
     * lado: es el lado de la base(cuadrado)
     * altura: es la altura de la piramide
     */
        double areaBase=lado*lado;
        return areaBase*altura/3;
    }
    public static double areaTriangulo(double base, double altura){
    /**Este metodo calcula el area de un triangulo
     *base: es la base del triangulo
     * altura: es la altura del triangulo
     */
        return base*altura/2;
    }
    public static double areaCuadrado(double lado){
    /**Este metodo calcula el area de un cuadrado
     *lado: es el lado cualquiera del cuadrado
     */
        return lado*lado;
    }
    public static double areaRectangulo(double base, double altura){
    /**Este metodo calcula el area de un rectangulo
     *base: es la base de un rectangulo
     * altura: es la altura de un rectangulo
     */
        return base*altura;
    }
    public static double areaCirculo(double radio){
    /**Este metodo calcula el area de un circulo
     *radio: es el radio de un circulo
     */
        double PI=3.14;
        return PI*radio*radio;
    }
}
