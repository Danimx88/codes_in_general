public class WrapperInteger {
    public static void main(String[] args) {

        Integer intObject = Integer.valueOf(327); //Explicita
        Integer intObjecgt2 = 32768; //Implicita
        int intPrimitivo = 32768;
        Integer intObject3 = intPrimitivo;
        System.out.println("intObject = " + intObject);

        int num = intObject;
        System.out.println("num = " + num);
        int num2 = intObject.intValue();
        System.out.println("num2 = " + num2);

        String valueTvLcd = "6700";
        Integer value = Integer.valueOf(valueTvLcd);
        System.out.println("value= " + value);

        Short shortObject = 32767;
        Short shortObject2 = intObject.shortValue();
        System.out.println("shortObject = " + shortObject2); //verificar que soporte el valor del short

        Byte byteObject = intObject.byteValue();
        System.out.println("byteObject = ");  //cuando integer se pasa a Short y byte pierden valor (si rebasan el valor soportado)

        Long longObject = intObject.longValue();
        System.out.println("longObject = " + longObject);



    }
}
