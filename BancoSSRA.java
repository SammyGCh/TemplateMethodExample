public class BancoSSRA {
    public static void main(String[] args) {
        Cliente mauricio = new Cliente("MAURICIO","FSS750403AK2","Prosperidad #2 Col. del maestro", 4568);
        Cliente juan = new Cliente("JUAN","SDF753121AK2","Del llano #15 Col. nevado", 45655);
        Cliente jose = new Cliente("JOSE","KDI759784AK2","Juarez #35 Col. Revolucion", 65465);
        Cliente maria = new Cliente("MARIA","OSD740503AK2","Vicente guerrero Col. Salas", 89798);
        
        Deposito deposito = new Deposito(300);
        deposito.realizarOperacionBancaria(mauricio);

        System.out.println(mauricio);

        deposito = new Deposito(1500);
        deposito.realizarOperacionBancaria(juan);

        System.out.println(juan);

        Retiro retiro = new Retiro(65000);
        retiro.realizarOperacionBancaria(jose);

        System.out.println(jose);

        retiro = new Retiro(89000);
        retiro.realizarOperacionBancaria(maria);
        
        System.out.println(maria);
    }
}