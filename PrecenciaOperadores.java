public class PrecenciaOperadores {
    public static void main(String[] args) {

        Integer i = Integer.valueOf(14);
        Integer j = Integer.valueOf(8);
        Integer k = Integer.valueOf(20);

        double promedio = (i +j + k) /  3d; // "3d" = dividido en 3 decimal
        System.out.println("promedio = " + promedio);

        promedio = i + j + k / 3d * 10; //14 +8 + 66.6
        System.out.println("promedio = " + promedio);

        promedio = i + j + k / (3d * 10); //14 +8 + 0.6
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / (3d * 10); //14 +8 + 0.6
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / 3d * 10; // 42 / 3 = 45*10
        System.out.println("promedio = " + promedio);

        promedio = ++i + j-- + k / 3d * 10; //(15 + 8) + 66.6
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        promedio = --i + j++ + k / 3d * 10; //(13 + 8) + 66.6
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i);
        System.out.println("j = " + j);



    }
}
