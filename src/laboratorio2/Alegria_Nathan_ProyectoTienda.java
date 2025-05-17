/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio2;
import java.util.Scanner;
/**
 *
 * @author Nathan
 */
public class Alegria_Nathan_ProyectoTienda {
  
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        double caja = 0;
        int opcion;
        int ventas = 0;
        int compras = 0;
        double totalcompras = 0;
        double totalventas = 0;
        double promediov = 0;
        double promedioc = 0;
        double mayorventa = 0;
        double mayorcompra = 0;
        String productoestrella = "";
        double invAzucar = 0;
        double invAvena = 0;
        double invTrigo = 0;
        double invMaiz = 0;
        int intentos = 0;
        boolean cajaAbierta = true;

        do {
            System.out.print("Ingresar cantidad de efectivo que ingresará a la caja: ");
            caja += lea.nextDouble();
            if (caja < 0) {
                System.out.println("Error numero negativo");
                caja = 0;
            }
        } while (caja == 0);
        do {
            // Menú de opciones
            System.out.println("\n**** Menu de Opciones ****");
            System.out.println("1.Abrir Caja");
            System.out.println("2.Ventas");
            System.out.println("3.Compras");
            System.out.println("4.Reportes");
            System.out.println("5.Cierre de Caja");
            System.out.println("6.Salir del Sistema");
            System.out.println("*************************");
            System.out.println("Seleccione una opcion:");
            opcion = lea.nextInt();

            switch (opcion) {
                case 1:
                    // Abrir Caja
                    cajaAbierta = true;
                    System.out.print("Efectivo total en caja: Lps." + caja);
                    break;

                case 2:
                    // Ventas
                    if (!cajaAbierta) {
                        System.out.println("Error: La caja está cerrada. Debe abrir la caja antes de realizar ventas.");
                        break;
                    }
                    double subtotal = 0.0;
                    String detallefactura = "";
                    char tipoClienteV;
                    if (compras > 0) {
                        do {
                            System.out.print("Ingrese tipo de proveedor (A, B, C):");
                            tipoClienteV = lea.next().toUpperCase().charAt(0);
                            if (tipoClienteV != 'A' && tipoClienteV != 'B' && tipoClienteV != 'C') {
                                System.out.println("Error: tipo de proveedor no válido.");
                            }
                        } while (tipoClienteV != 'A' && tipoClienteV != 'B' && tipoClienteV != 'C');
                        boolean repetir = true;

                        while (repetir) {
                            System.out.println("Codigo de producto cliente A(1-4)" + "\nCodigo de producto cliente B(1-3)" + "\n Codigo de producto cliente C(4)");
                            System.out.print("Ingrese codigo del producto (1-4):");
                            int producto = lea.nextInt();
                            if (tipoClienteV == 'A') {
                                System.out.println("Codigo 1: Azucar" + "Precio Venta: 30Lps.");
                                System.out.println("Codigo 2: Avena" + "Precio Venta: 25Lps.");
                                System.out.println("Codigo 3: Trigo" + "Precio Venta: 32Lps.");
                                System.out.println("Codigo 4: Maiz" + "Precio Venta: 20Lps.");
                            } else if (tipoClienteV == 'B') {
                                System.out.println("Codigo 1: Azucar" + "Precio Venta: 30Lps.");
                                System.out.println("Codigo 2: Avena" + "Precio Venta: 25Lps.");
                                System.out.println("Codigo 3: Trigo" + "Precio Venta: 32Lps.");
                            } else if (tipoClienteV == 'C') {
                                System.out.println("Codigo 4: Maiz" + "Precio Venta: 20Lps.");
                            }

                            String nombreProducto = "";
                            double precioUnitario = 0;

                            boolean puedeComprar = false;
                            if (tipoClienteV == 'A' && (producto >= 1 && producto <= 4)) {
                                puedeComprar = true;
                            } else if (tipoClienteV == 'B' && (producto >= 1 && producto <= 3)) {
                                puedeComprar = true;
                            } else if (tipoClienteV == 'C' && producto == 4) {
                                puedeComprar = true;
                            } else if (tipoClienteV != 'A' || tipoClienteV != 'B' || tipoClienteV != 'C') {
                                System.out.println("Error tipo de cliente no valido");
                            }

                            String nombre = "";
                            double precio = 0;

                            switch (producto) {
                                case 1:
                                    nombre = "Azucar";
                                    precio = 30;
                                    break;
                                case 2:
                                    nombre = "Avena";
                                    precio = 25;
                                    break;
                                case 3:
                                    nombre = "Trigo";
                                    precio = 32;
                                    break;
                                case 4:
                                    nombre = "Maiz";
                                    precio = 20;
                                    break;
                            }
                            int producto1 = 0;
                            int producto2 = 0;
                            int producto3 = 0;
                            int producto4 = 0;
                            int productopopular = 0;
                            switch (producto) {
                                case 1:
                                    nombreProducto = "Azúcar";
                                    if (tipoClienteV == 'A' || tipoClienteV == 'B') {
                                        precioUnitario = 30;
                                        puedeComprar = true;
                                        producto1++;
                                    }
                                    break;
                                case 2:
                                    nombreProducto = "Avena";
                                    if (tipoClienteV == 'A' || tipoClienteV == 'B') {
                                        precioUnitario = 25;
                                        puedeComprar = true;
                                        producto2++;
                                    }
                                    break;
                                case 3:
                                    nombreProducto = "Trigo";
                                    if (tipoClienteV == 'A' || tipoClienteV == 'B') {
                                        precioUnitario = 32;
                                        puedeComprar = true;
                                        producto3++;
                                    }
                                    break;
                                case 4:
                                    nombreProducto = "Maíz";
                                    if (tipoClienteV == 'A' || tipoClienteV == 'C') {
                                        precioUnitario = 20;
                                        puedeComprar = true;
                                        producto4++;
                                    }
                                    break;
                                default:
                                    System.out.println("Código Invalido");
                                    break;
                            }
                            do {
                                if (producto1 > productopopular) {
                                    productopopular = producto1;
                                    productoestrella = "Azúcar";
                                }
                                if (producto2 > productopopular) {
                                    productopopular = producto2;
                                    productoestrella = "Avena";
                                }
                                if (producto3 > productopopular) {
                                    productopopular = producto3;
                                    productoestrella = "Trigo";
                                }
                                if (producto4 > productopopular) {
                                    productopopular = producto4;
                                    productoestrella = "Maíz";
                                }
                            } while (productopopular == 0);

                            if (puedeComprar) {
                                ventas++;
                                System.out.println("Producto:" + nombreProducto);
                                System.out.println("Precio Unitario:Lps." + precioUnitario);
                                System.out.print("Ingrese cantidad en kilogramos:");
                                double kilogramos = lea.nextDouble();
                                boolean suficienteInventario = false;
                                switch (producto) {
                                    case 1:
                                        if (invAzucar >= kilogramos) {
                                            suficienteInventario = true;
                                        }
                                        break;
                                    case 2:
                                        if (invAvena >= kilogramos) {
                                            suficienteInventario = true;
                                        }
                                        break;
                                    case 3:
                                        if (invTrigo >= kilogramos) {
                                            suficienteInventario = true;
                                        }
                                        break;
                                    case 4:
                                        if (invMaiz >= kilogramos) {
                                            suficienteInventario = true;
                                        }
                                        break;
                                }
                                switch (producto) {
                                    case 1:
                                        invAzucar -= kilogramos;
                                        break;
                                    case 2:
                                        invAvena -= kilogramos;
                                        break;
                                    case 3:
                                        invTrigo -= kilogramos;
                                        break;
                                    case 4:
                                        invMaiz -= kilogramos;
                                        break;
                                }
                                if (suficienteInventario == false) {
                                    System.out.println("Error: no hay suficiente inventario para esta venta.");
                                    intentos++;

                                    if (intentos >= 1) {
                                        ventas--;
                                        System.out.println("Intento fallido. Regresando al menú principal.");
                                        repetir = false;
                                        break;
                                    } else {
                                        continue;
                                    }
                                }
                                if (!suficienteInventario) {
                                    System.out.println("Error: no hay suficiente inventario para esta venta.");
                                    break;
                                }
                                double totalProducto = kilogramos * precioUnitario;
                                subtotal += totalProducto;
                                detallefactura += kilogramos + " kg de " + nombreProducto + " a Lps. " + precioUnitario;
                            } else {
                                System.out.println("No puede comprar este producto");
                            }

                            System.out.print("¿Desea comprar otro producto? (SI/NO): ");
                            String respuesta = lea.next().trim().toUpperCase();
                            if (respuesta.equals("SI")) {
                                repetir = true;
                            } else if (respuesta.equals("NO")) {
                                repetir = false;
                            } else {
                                System.out.println("Error opcion invalida");
                            }
                        }
                        // Facturación
                        System.out.println("\n**** FACTURA ****");
                        System.out.println("Subtotal: Lps." + String.format("%.2f", subtotal));

                        double descuento = 0;
                        if (subtotal >= 5000) {
                            descuento = subtotal * 0.10;
                        } else if (subtotal >= 1000) {
                            descuento = subtotal * 0.05;
                        }
                        double impuesto = subtotal * 0.07;
                        System.out.println("Descuento: Lps." + String.format("%.2f", descuento));
                        System.out.println("Impuesto (7%): Lps." + String.format("%.2f", impuesto));
                        double total = subtotal - descuento + impuesto;
                        System.out.println("Total a pagar: Lps." + String.format("%.2f", total));
                        caja += total;
                        totalventas += total;
                        promediov += total / ventas;
                        System.out.println("Caja actual: Lps." + String.format("%.2f", caja));
                        if (total > mayorventa) {
                            mayorventa = total;
                        }

                    } else {
                        System.out.print("Error Compras no suficientes");
                    }

                    break;
                case 3:
                    //Compras
                    if (!cajaAbierta) {
                        System.out.println("Error: La caja está cerrada. Debe abrir la caja antes de realizar compras.");
                        break;
                    }
                    char tipoClienteC;
                    do {
                        System.out.print("Ingrese tipo de proveedor (A, B, C): ");
                        tipoClienteC = lea.next().trim().toUpperCase().charAt(0);
                        if (tipoClienteC != 'A' && tipoClienteC != 'B' && tipoClienteC != 'C') {
                            System.out.println("Error: tipo de proveedor no válido.");
                        }

                        System.out.println("Codigo de producto cliente A(1,4)" + "\nCodigo de producto cliente B(2,3)" + "\n Codigo de producto cliente C(2)");
                    } while (tipoClienteC != 'A' && tipoClienteC != 'B' && tipoClienteC != 'C');
                    if (tipoClienteC == 'A') {
                        System.out.println("Codigo 1: Azucar" + "Precio Venta: 30Lps.");
                        System.out.println("Codigo 4: Maiz" + "Precio Venta: 20Lps.");
                    } else if (tipoClienteC == 'B') {
                        System.out.println("Codigo 2: Avena" + "Precio Venta: 25Lps.");
                        System.out.println("Codigo 3: Trigo" + "Precio Venta: 32Lps.");
                    } else if (tipoClienteC == 'C') {
                        System.out.println("Codigo 2: Avena" + "Precio Venta: 25Lps.");
                    }
                    System.out.print("Ingrese código del producto a comprar (1-4): ");
                    int producto = lea.nextInt();
                    String nombreProducto = "";
                    double precioCompra = 0;
                    boolean proveedor = false;

                    switch (producto) {
                        case 1:
                            nombreProducto = "Azúcar";
                            if (tipoClienteC == 'A') {
                                precioCompra = 25;
                                proveedor = true;
                            }
                            break;
                        case 2:
                            nombreProducto = "Avena";
                            if (tipoClienteC == 'B') {
                                precioCompra = 20;
                                proveedor = true;
                            } else if (tipoClienteC == 'C') {
                                precioCompra = 22;
                                proveedor = true;
                            }
                            break;
                        case 3:
                            nombreProducto = "Trigo";
                            if (tipoClienteC == 'B') {
                                precioCompra = 30;
                                proveedor = true;
                            }
                            break;
                        case 4:
                            nombreProducto = "Maíz";
                            if (tipoClienteC == 'A') {
                                precioCompra = 18;
                                proveedor = true;
                            }
                            break;
                        default:
                            System.out.println("Código de producto inválido.");
                            break;
                    }
                    if (proveedor) {
                        System.out.println("Producto: " + nombreProducto);
                        System.out.println("Precio por kg: Lps. " + precioCompra);
                        System.out.print("Ingrese cantidad en kilogramos a comprar: ");
                        double kilogramos = lea.nextDouble();
                        double totalCompra = kilogramos * precioCompra;
                        totalcompras += totalCompra;
                        switch (producto) {
                            case 1:
                                invAzucar += kilogramos;
                                break;
                            case 2:
                                invAvena += kilogramos;
                                break;
                            case 3:
                                invTrigo += kilogramos;
                                break;
                            case 4:
                                invMaiz += kilogramos;
                                break;
                        }
                        if (totalCompra > mayorcompra) {
                            mayorcompra = totalCompra;
                        }
                        if (totalCompra <= caja) {
                            caja -= totalCompra;
                            compras++;
                            promedioc += totalcompras / compras;
                            System.out.println("Compra realizada con éxito.");
                            System.out.println("Total de compra: Lps. " + totalCompra);
                            System.out.println("Nuevo saldo en caja: Lps. " + caja);
                        } else if (caja < totalCompra) {
                            System.out.println("No hay suficientes fondos en caja");
                        }
                    } else {
                        System.out.println("Proveedor no vende este producto");
                    }
                case 4:
                    //Reportes
                    if (totalcompras != 0 && totalventas != 0) {
                        System.out.println("Total en Caja: Lps." + caja);
                        System.out.println("Cantidad de Ventas en este día:" + ventas);
                        System.out.println("Cantidad de Compras en este día:" + compras);
                        System.out.println("Volumen Total de Compras: Lps." + totalcompras);
                        System.out.println("Volumen Total de Ventas: Lps." + totalventas);
                        double ganancia = totalventas - totalcompras;
                        System.out.println("Ganancia Total: Lps." + ganancia);
                        System.out.println("Promedio de Compra: Lps." + promedioc);
                        System.out.println("Promedio de Venta: Lps." + promediov);
                        System.out.println("Venta con Mayor Ganancia: Lps." + mayorventa);
                        System.out.println("Compra con Mayor Gasto: Lps." + mayorcompra);
                        System.out.println("Producto estrella:" + productoestrella);
                    }
                    break;
                case 5:
                    if (!cajaAbierta) {
                        System.out.println("Error: La caja está cerrada. Debe abrir la caja.");
                        break;
                    }
                    System.out.println("Total de ganancia en caja:Lps." + caja);
                    System.out.println("Cuanto Depositara al banco(Menos del 60%):");
                    double deposito = lea.nextDouble();
                    double depmax = caja * 0.60;
                    if (deposito < depmax) {
                        caja -= deposito;
                    } else {
                        System.out.println("Error ingresar una cifra que no exceda del 60%");
                        System.out.println("El 60% es de: Lps." + depmax);
                    }
                    ventas = 0;
                    compras = 0;
                    totalcompras = 0;
                    totalventas = 0;
                    promediov = 0;
                    promedioc = 0;
                    mayorventa = 0;
                    mayorcompra = 0;
                    productoestrella = "";
                    invAzucar = 0;
                    invAvena = 0;
                    invTrigo = 0;
                    invMaiz = 0;
                    intentos = 0;
                    cajaAbierta = false;
                    System.out.println("Caja cerrada exitosamente. No se permiten ventas ni compras hasta abrir nuevamente la caja.");
                    break;
                case 6:
                    System.out.print("Saliendo del Sistema" + "\n");

                default:
                    if (opcion < 1 || opcion > 6) {
                        System.out.println("Opción inválida.");
                    }
            }
        } while (opcion != 6);

    }
}
