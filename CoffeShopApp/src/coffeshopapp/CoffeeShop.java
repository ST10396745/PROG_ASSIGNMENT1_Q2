/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeshopapp;

import java.util.Scanner;

/**
 *
 * @author William Stainton
 */
public class CoffeeShop {

    private int balance;
    public String pass;

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    

    public CoffeeShop() {
    }
    
    public void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- COFFEE SHOP ---");
        System.out.println("(1)\t Check Balance\n"
                + "(2)\t Enter Balance\n"
                + "(3)\t Menu\n"
                + "(4)\t See Order\n"
                + "(5)\t Exit");

        String choice = sc.next();

        if (choice.equals("1")) {
            System.out.println("Your Balance Is: R" + checkAmount());
            System.out.println("Press (1) To Go Back To Main Menu Or Press Any Key To Exit");
            String choice2 = sc.next();

            if (choice2.equals("1")) {
                menu();
            } else {
                System.exit(0);
            }

        } else if (choice.equals("2")) {
            enterAmount();
        } else if (choice.equals("3")) {
            coffeeMenu();
        } else if (choice.equals("4")) {
            CoffeeOrder c = new CoffeeOrder();
            c.displayOrder();
        }else if (choice.equals("5")) {
            System.exit(0);
        }
    }

    public void coffeeMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- COFFEE SHOP MENU ---");
        System.out.println("(1)\t Espresson\n"
                + "(2)\t Latte\n"
                + "(3)\t Black Coffee\n"
                + "(4)\t Mocha\n"
                + "(5)\t Americano\n"
                + "(6)\t Cappuccino\n"
                + "(7)\t Flat White\n"
                + "(8)\t Cafe Au Lait\n"
                + "(9)\t Macchiato\n"
                + "(10)\t Cold Brew\n"
                + "(11)\t Irish Coffee\n"
                + "(12)\t Frappe\n"
                + "(13)\t Vietnamese Coffee\n"
                + "(14)\t Affogato\n"
                + "(15)\t Red Eye\n"
                + "(16)\t See Prices\n"
                + "(17)\t Back To Main Menu\n"
                + "(18)\t Exit");

        String choice = sc.next();
        if (choice.equals("1")) {
            balance = balance - 30;
            if (balance < 0) {
                balance = balance + 30;
                System.out.println("You Do Not Have Enough Balance To Buy A Coffee");
                System.out.println("Press (1) To Go Back To The Menu Or Press Any Key To Exit");
                String choice2 = sc.next();

                if (choice2.equals("1")) {
                    coffeeMenu();
                } else {
                    System.exit(0);
                }
            } else if (balance > 0) {
                CoffeeOrder c = new CoffeeOrder("Espresson", 30);
                System.out.println("Press (1) To Add Another Coffee To The Order Or Press Any Other Key To Exit");

                String choice2 = sc.next();

                if (choice2.equals("1")) {
                    coffeeMenu();
                } else {
                    System.exit(0);
                }

            }
        } else if (choice.equals("2")) {
            balance = balance - 30;
            if (balance < 0) {
                balance = balance + 30;
                System.out.println("You Do Not Have Enough Balance To Buy A Coffee");
                System.out.println("Press (1) To Go Back To The Menu Or Press Any Key To Exit");
                String choice2 = sc.next();

                if (choice2.equals("1")) {
                    coffeeMenu();
                } else {
                    System.exit(0);
                }
            } else if (balance > 0) {
                CoffeeOrder c = new CoffeeOrder("Latte", 30);
                System.out.println("Press (1) To Add Another Coffee To The Order Or Press Any Other Key To Exit");

                String choice2 = sc.next();

                if (choice2.equals("1")) {
                    coffeeMenu();
                } else {
                    System.exit(0);
                }
            }
        } else if (choice.equals("3")) {
            balance = balance - 30;
            if (balance < 0) {
                balance = balance + 30;
                System.out.println("You Do Not Have Enough Balance To Buy A Coffee");
                System.out.println("Press (1) To Go Back To The Menu Or Press Any Key To Exit");
                String choice2 = sc.next();

                if (choice2.equals("1")) {
                    coffeeMenu();
                } else {
                    System.exit(0);
                }
            } else if (balance > 0) {
                CoffeeOrder c = new CoffeeOrder("Black Coffee", 30);
                System.out.println("Press (1) To Add Another Coffee To The Order Or Press Any Other Key To Exit");

                String choice2 = sc.next();

                if (choice2.equals("1")) {
                    coffeeMenu();
                } else {
                    System.exit(0);
                }
            } 

        }else if (choice.equals("4")) {
                balance = balance - 30;
                if (balance < 0) {
                    balance = balance + 30;
                    System.out.println("You Do Not Have Enough Balance To Buy A Coffee");
                    System.out.println("Press (1) To Go Back To The Menu Or Press Any Key To Exit");
                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                } else if (balance > 0) {
                    CoffeeOrder c = new CoffeeOrder("Mocha", 30);
                    System.out.println("Press (1) To Add Another Coffee To The Order Or Press Any Other Key To Exit");

                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                }
            } else if (choice.equals("5")) {
                balance = balance - 30;
                if (balance < 0) {
                    balance = balance + 30;
                    System.out.println("You Do Not Have Enough Balance To Buy A Coffee");
                    System.out.println("Press (1) To Go Back To The Menu Or Press Any Key To Exit");
                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                } else if (balance > 0) {
                    CoffeeOrder c = new CoffeeOrder("Americano", 30);
                    System.out.println("Press (1) To Add Another Coffee To The Order Or Press Any Other Key To Exit");

                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                }
            } else if (choice.equals("6")) {
                balance = balance - 30;
                if (balance < 0) {
                    balance = balance + 30;
                    System.out.println("You Do Not Have Enough Balance To Buy A Coffee");
                    System.out.println("Press (1) To Go Back To The Menu Or Press Any Key To Exit");
                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                } else if (balance > 0) {
                    CoffeeOrder c = new CoffeeOrder("Cappuccino", 30);
                    System.out.println("Press (1) To Add Another Coffee To The Order Or Press Any Other Key To Exit");

                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                }
            } else if (choice.equals("7")) {
                balance = balance - 30;
                if (balance < 0) {
                    balance = balance + 30;
                    System.out.println("You Do Not Have Enough Balance To Buy A Coffee");
                    System.out.println("Press (1) To Go Back To The Menu Or Press Any Key To Exit");
                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                } else if (balance > 0) {
                    CoffeeOrder c = new CoffeeOrder("Flat White", 30);
                    System.out.println("Press (1) To Add Another Coffee To The Order Or Press Any Other Key To Exit");

                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                }
            } else if (choice.equals("8")) {
                balance = balance - 30;
                if (balance < 0) {
                    balance = balance + 30;
                    System.out.println("You Do Not Have Enough Balance To Buy A Coffee");
                    System.out.println("Press (1) To Go Back To The Menu Or Press Any Key To Exit");
                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                } else if (balance > 0) {
                    CoffeeOrder c = new CoffeeOrder("Cafe Au Lait", 30);
                    System.out.println("Press (1) To Add Another Coffee To The Order Or Press Any Other Key To Exit");

                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                }
            } else if (choice.equals("9")) {
                balance = balance - 30;
                if (balance < 0) {
                    balance = balance + 30;
                    System.out.println("You Do Not Have Enough Balance To Buy A Coffee");
                    System.out.println("Press (1) To Go Back To The Menu Or Press Any Key To Exit");
                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                } else if (balance > 0) {
                    CoffeeOrder c = new CoffeeOrder("Macchiato", 30);
                    System.out.println("Press (1) To Add Another Coffee To The Order Or Press Any Other Key To Exit");

                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                }
            } else if (choice.equals("10")) {
                balance = balance - 30;
                if (balance < 0) {
                    balance = balance + 30;
                    System.out.println("You Do Not Have Enough Balance To Buy A Coffee");
                    System.out.println("Press (1) To Go Back To The Menu Or Press Any Key To Exit");
                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                } else if (balance > 0) {
                    CoffeeOrder c = new CoffeeOrder("Cold Brew", 30);
                    System.out.println("Press (1) To Add Another Coffee To The Order Or Press Any Other Key To Exit");

                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                }
            } else if (choice.equals("11")) {
                balance = balance - 30;
                if (balance < 0) {
                    balance = balance + 30;
                    System.out.println("You Do Not Have Enough Balance To Buy A Coffee");
                    System.out.println("Press (1) To Go Back To The Menu Or Press Any Key To Exit");
                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                } else if (balance > 0) {
                    CoffeeOrder c = new CoffeeOrder("Irish Coffee", 30);
                    System.out.println("Press (1) To Add Another Coffee To The Order Or Press Any Other Key To Exit");

                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                }
            } else if (choice.equals("12")) {
                balance = balance - 30;
                if (balance < 0) {
                    balance = balance + 30;
                    System.out.println("You Do Not Have Enough Balance To Buy A Coffee");
                    System.out.println("Press (1) To Go Back To The Menu Or Press Any Key To Exit");
                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                } else if (balance > 0) {
                    CoffeeOrder c = new CoffeeOrder("Frappe", 30);
                    System.out.println("Press (1) To Add Another Coffee To The Order Or Press Any Other Key To Exit");

                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                }
            } else if (choice.equals("13")) {
                balance = balance - 30;
                if (balance < 0) {
                    balance = balance + 30;
                    System.out.println("You Do Not Have Enough Balance To Buy A Coffee");
                    System.out.println("Press (1) To Go Back To The Menu Or Press Any Key To Exit");
                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                } else if (balance > 0) {
                    CoffeeOrder c = new CoffeeOrder("Vietnamese Coffee", 30);
                    System.out.println("Press (1) To Add Another Coffee To The Order Or Press Any Other Key To Exit");

                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                }
            } else if (choice.equals("14")) {
                balance = balance - 30;
                if (balance < 0) {
                    balance = balance + 30;
                    System.out.println("You Do Not Have Enough Balance To Buy A Coffee");
                    System.out.println("Press (1) To Go Back To The Menu Or Press Any Key To Exit");
                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                } else if (balance > 0) {
                    CoffeeOrder c = new CoffeeOrder("Affogato", 30);
                    System.out.println("Press (1) To Add Another Coffee To The Order Or Press Any Other Key To Exit");

                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                }
            } else if (choice.equals("15")) {
                balance = balance - 30;
                if (balance < 0) {
                    balance = balance + 30;
                    System.out.println("You Do Not Have Enough Balance To Buy A Coffee");
                    System.out.println("Press (1) To Go Back To The Menu Or Press Any Key To Exit");
                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                } else if (balance > 0) {
                    CoffeeOrder c = new CoffeeOrder("Red Eye", 30);
                    System.out.println("Press (1) To Add Another Coffee To The Order Or Press Any Other Key To Exit");

                    String choice2 = sc.next();

                    if (choice2.equals("1")) {
                        coffeeMenu();
                    } else {
                        System.exit(0);
                    }
                }
            } else if (choice.equals("16")) {
                checkPrices();
            } else if (choice.equals("17")) {
                menu();
            } else if (choice.equals("18")) {
                System.exit(0);
            }
    }

    public void checkPrices() {
        Scanner sc = new Scanner(System.in);
        System.out.println("One Price Special For All Cofffees At R30");
        System.out.println("Press (1) To Go Back To The Menu Or Any Other Key To Exit");

        String choice = sc.next();

        if (choice.equals("1")) {
            coffeeMenu();
        } else {
            System.exit(0);
        }

        sc.close();
    }

    public void enterAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the balnce you would like");
        int amt = sc.nextInt();

        if (checkAmountEntered(amt)) {
            System.out.println("Amount Accepted");
            System.out.println("Press (1) To Go Back To Main Menu Or Press Any Key To Exit");
            String choice = sc.next();

            if (choice.equals("1")) {
                menu();
            } else {
                System.exit(0);
            }
        }

    }

    public boolean checkAmountEntered(int amt) {
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        String choice;

        if (amt > 500) {
            System.out.println("Amount Must Be Below 500 Press (1) To Re-Enter Or Any Other Key To Exit");
            choice = sc.next();

            if (choice.equals("1")) {
                enterAmount();
            } else {
                System.exit(0);
            }

        } else if (amt < 30) {
            System.out.println("Amount Must Be 30 Or Above Press (1) To Re-Enter Or Any Other Key To Exit");

            choice = sc.next();

            if (choice.equals("1")) {
                enterAmount();
            } else {
                System.exit(0);
            }

        } else {
            balance = amt;
            check = true;
        }

        return check;
    }

    public int checkAmount() {
        int bal = balance;

        return bal;
    }

    public void login() {
        if (!isLoggedIn()) {
            Scanner sc = new Scanner(System.in);

            System.out.println("This Feature Is Not Avaliable!");
            System.out.println("Press (1) To Sign Up or any other key to exit.");
            String key = sc.next();

            if (key.equals("1")) {
                signup();
            } else {
                System.exit(0);
            }

        }
    }

    public void signup() {
        int numCheck = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a username \n"
                + "~ It must be 5 characters long");
        String username = sc.next();

        while (!checkUser(username)) {
            System.out.println("Username must be 5 characters long no shorter or longer!");
            System.out.println("Enter a username \n"
                    + "~ It must be 5 characters long");
            username = sc.next();
        }

        if (checkUser(username)) {
            System.out.println("Username Accepted");
            numCheck++;
        }

        System.out.println("Enter a password\n"
                + "~ It must have 8 characters\n"
                + "~ It must have a numbers");

        pass = sc.next();

        while (!checkPass()) {
            System.out.println("Password Invalid");
            System.out.println("Enter a password\n"
                    + "~ It must have 8 characters\n"
                    + "~ It must have a numbers");

            pass = sc.next();

        }

        if (checkPass()) {
            System.out.println("Password Accepted");
            numCheck++;
        }

        if (numCheck == 2) {
            menu();
        }

    }

    public boolean isLoggedIn() {
        return false;
    }

    public boolean checkUser(String user) {
        boolean check = false;

        if (user.length() == 5) {
            check = true;
        } else if (user.length() != 5) {
            check = false;
        }

        return check;
    }

    public boolean checkPass() {
        boolean check = false;

        if (pass.length() >= 8) {
            for (char c : pass.toCharArray()) {
                if (Character.isDigit(c)) {
                    check = true;
                }
            }
        } else {
            check = false;
        }

        return check;
    }

}