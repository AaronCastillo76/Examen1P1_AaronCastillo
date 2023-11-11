package examen1p1_aaroncastillo;

import java.util.Random;
import java.util.Scanner;

public class Examen1P1_AaronCastillo {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("*****Menu*****");
        System.out.println("1. Fight or Flight");
        System.out.println("2. Tri Fuerza");
        System.out.print("Ingrese opcion: ");
        int opcion = leer.nextInt();
        while (opcion > 0 && opcion < 3) {
            switch (opcion) {
                case 1:
                    char resp = 's';
                    int balas = 25;
                    int zombie = 25;
                    int distancia = new Random().nextInt(30 - 15) + 15;
                    int hp = zombie;
                    System.out.println("Ingrese maestria: ");
                    System.out.println("1. Principante (0% de hit extra + extra damage)");
                    System.out.println("2. Intermedio (5% de hit extra + extra damage)");
                    System.out.println("3. Experto (15% de hit extra + extra damage)");
                    int maestria = leer.nextInt();
                    switch (maestria) {
                        case 1:
                            System.out.println("El zombie se encuentra a : " + distancia + " metros!");
                            int cont_dis = distancia;
                            System.out.println("");
                            while (resp == 's' || resp == 'S') {
                                if (balas > 0 && cont_dis > 0 && hp > 0) {
                                    System.out.println("El jugador cuenta con: " + balas + " balas!");
                                    int probabilidad = new Random().nextInt(100);
                                    System.out.println("");
                                    System.out.println("");
                                    int damage = new Random().nextInt(7 - 1) + 1;
                                    if (probabilidad <= 65) {
                                        System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: " + damage);
                                        hp -= damage;
                                    } else {
                                        int distancia3 = new Random().nextInt(5 - 3) + 3;
                                        cont_dis -= distancia3;
                                        if (cont_dis <= 0) {
                                            cont_dis = 0;
                                        }
                                        System.out.println("Ha fallado! El zombie se encuentra a: " + cont_dis + " metros!");
                                    }
                                    System.out.println("");
                                    if (hp <= 0) {
                                        hp = 0;
                                    }
                                    System.out.println("Vida restante del zombie: " + hp);
                                    System.out.println("El zombie se encuentra a : " + cont_dis + " metros!");
                                    balas--;
                                    System.out.println("");
                                }
                                if (balas > 0 && cont_dis > 0 && hp > 0) {
                                    System.out.println("Listo para la siguiente ronda? [s/n]");
                                    resp = leer.next().charAt(0);
                                } else {
                                    resp = 'n';
                                }
                            }
                            if (hp == 0) {
                                System.out.println("YOU WIN, has logrado vencer al zombie!");
                            } else if (cont_dis == 0) {
                                System.out.println("GAME OVER, la distancia se redujo a 0!");
                            } else {
                                System.out.println("GAME OVER, el jugador se quedo sin balas!");
                            }
                            break;
                        case 2:
                            System.out.println("El zombie se encuentra a : " + distancia + " metros!");
                            cont_dis = distancia;
                            System.out.println("");
                            while (resp == 's' || resp == 'S') {
                                if (balas > 0 && cont_dis > 0 && hp > 0) {
                                    System.out.println("El jugador cuenta con: " + balas + " balas!");
                                    int probabilidad = new Random().nextInt(100);
                                    System.out.println("");
                                    System.out.println("");
                                    int damage = new Random().nextInt(7 - 1) + 1;
                                    if (probabilidad <= 70) {
                                        System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: " + damage);
                                        hp -= damage;
                                    } else {
                                        int distancia3 = new Random().nextInt(5 - 3) + 3;
                                        cont_dis -= distancia3;
                                        if (cont_dis <= 0) {
                                            cont_dis = 0;
                                        }
                                        System.out.println("Ha fallado! El zombie se encuentra a: " + cont_dis + " metros!");
                                    }
                                    System.out.println("");
                                    if (hp <= 0) {
                                        hp = 0;
                                    }
                                    System.out.println("Vida restante del zombie: " + hp);
                                    System.out.println("El zombie se encuentra a : " + cont_dis + " metros!");
                                    balas--;
                                    System.out.println("");
                                }
                                if (balas > 0 && cont_dis > 0 && hp > 0) {
                                    System.out.println("Listo para la siguiente ronda? [s/n]");
                                    resp = leer.next().charAt(0);
                                } else {
                                    resp = 'n';
                                }
                            }
                            if (hp == 0) {
                                System.out.println("YOU WIN, has logrado vencer al zombie!");
                            } else if (cont_dis == 0) {
                                System.out.println("GAME OVER, la distancia se redujo a 0!");
                            } else {
                                System.out.println("GAME OVER, el jugador se quedo sin balas!");
                            }
                            break;
                        case 3:
                            System.out.println("El zombie se encuentra a : " + distancia + " metros!");
                            cont_dis = distancia;
                            System.out.println("");
                            while (resp == 's' || resp == 'S') {
                                if (balas > 0 && cont_dis > 0 && hp > 0) {
                                    System.out.println("El jugador cuenta con: " + balas + " balas!");
                                    int probabilidad = new Random().nextInt(100);
                                    System.out.println("");
                                    System.out.println("");
                                    int damage = new Random().nextInt(7 - 1) + 1;
                                    if (probabilidad <= 80) {
                                        System.out.println("Hit! El tiro ha reducido el HP del zombie por un total de: " + damage);
                                        hp -= damage;
                                    } else {
                                        int distancia3 = new Random().nextInt(5 - 3) + 3;
                                        cont_dis -= distancia3;
                                        if (cont_dis <= 0) {
                                            cont_dis = 0;
                                        }
                                        System.out.println("Ha fallado! El zombie se encuentra a: " + cont_dis + " metros!");
                                    }
                                    System.out.println("");
                                    if (hp <= 0) {
                                        hp = 0;
                                    }
                                    System.out.println("Vida restante del zombie: " + hp);
                                    System.out.println("El zombie se encuentra a : " + cont_dis + " metros!");
                                    balas--;
                                    System.out.println("");
                                }
                                if (balas > 0 && cont_dis > 0 && hp > 0) {
                                    System.out.println("Listo para la siguiente ronda? [s/n]");
                                    resp = leer.next().charAt(0);
                                } else {
                                    resp = 'n';
                                }
                            }
                            if (hp == 0) {
                                System.out.println("YOU WIN, has logrado vencer al zombie!");
                            } else if (cont_dis == 0) {
                                System.out.println("GAME OVER, la distancia se redujo a 0!");
                            } else {
                                System.out.println("GAME OVER, el jugador se quedo sin balas!");
                            }
                            break;
                    }
                    break;
                case 2:
                    tri_fuerza();
                    break;
            }
            System.out.println("");
            System.out.println("*****Menu*****");
            System.out.println("1. Fight or Flight");
            System.out.println("2. Tri Fuerza");
            System.out.print("Ingrese opcion: ");
            opcion = leer.nextInt();
        }
    }

    public static void tri_fuerza() {
        System.out.print("Ingrese un numero par y mayor que 20 [0 para salir]: ");
        int num = leer.nextInt();
        while (num != 0) {
            if (num > 20 && num % 2 == 0) {
                for (int i = 0; i <= num / 2; i++) {
                    for (int j = 0; j <= num + 1; j++) {
                        if (j == num / 2 || i == num / 2) {
                            System.out.print("*");
                        } else if (i + j == num / 2 || j == (num / 2) + i) {
                            System.out.print("*");
                        } else if (j + i > num / 2 && j - i < num / 2) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }

                    }
                    System.out.println("");
                }
            }
            System.out.print("Ingrese un numero par y mayor que 20 [0 para salir]: ");
            num = leer.nextInt();
        }
    }

}
