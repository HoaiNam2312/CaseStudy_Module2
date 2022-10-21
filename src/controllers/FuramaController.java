package controllers;

import services.*;

import java.util.Scanner;

public class FuramaController {
    public static Scanner sc = new Scanner(System.in);
    public static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    public static CustomerServiceImpl customerService = new CustomerServiceImpl();
    public static FacilityServiceImpl facilityService = new FacilityServiceImpl();
    public static BookingService bookingService = new BookingServiceImpl();
    public static void displayMainMenu() {
//        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        int option = 0;
        do {
            System.out.println("--------MENU MAIN--------");
            System.out.println("1.\tEmployee Management\n" +
                    "2.\tCustomer Management\n" +
                    "3.\tFacility Management \n" +
                    "4.\tBooking Management\n" +
                    "5.\tPromotion Management\n" +
                    "6.\tExit\n");
            System.out.println("Nhập lựa chon của bạn: ");
            option = Integer.parseInt(sc.nextLine());
            if (option == 1) {
                displayEmployeeMenu();
            } else if (option == 2) {
                displayCustomerMenu();
            } else if (option == 3) {
                displayFacilityMenu();
            } else if (option == 4) {
                displayBookingMenu();
            } else if (option == 5) {
                displayPromotionMenu();
            } else if (option == 6) {
                break;
            }else {
                System.out.println("Vui lòng chỉ nhập số từ 1 đến 6");
            }
        } while (option != 6);
    }

    public static void displayEmployeeMenu() {
        int option;
        do {
            System.out.println("------Employee Menu------");
            System.out.println("1\tDisplay list employees\n" +
                    "2\tAdd new employee\n" +
                    "3\tEdit employee\n" +
                    "4\tReturn main menu\n");
            System.out.println("Nhập lựa chon của bạn: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Chỉ nhập số từ 1 đến 4");
                    break;
            }
        } while (option!=4);
    }

    public static void displayCustomerMenu() {
        int option;
        do {
            System.out.println("------Customer Menu------");
            System.out.println("1.\tDisplay list customers\n" +
                    "2.\tAdd new customer\n" +
                    "3.\tEdit customer\n" +
                    "4.\tReturn main menu\n");
            System.out.println("Nhập lựa chon của bạn: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Chỉ nhập số từ 1 đến 4");
                    break;
            }
        } while (option != 4);
    }

    public static void displayFacilityMenu() {
        int option;
        do {
            System.out.println("------Facility Menu------");
            System.out.println("1\tDisplay list facility\n" +
                    "2\tAdd new facility\n" +
                    "3\tDisplay list facility maintenance\n" +
                    "4\tReturn main menu\n");
            System.out.println("Nhập lựa chon của bạn: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    facilityService.add();
                    break;
                case 3:
                    facilityService.displayListFacilityMaintenance();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Chỉ nhập số từ 1 đến 4");
                    break;
            }
        } while (option != 4);
    }

    public static void displayBookingMenu() {
        int option;
        do {
            System.out.println("------Booking Menu------");
            System.out.println("1.\tAdd new booking\n" +
                    "2.\tDisplay list booking\n" +
                    "3.\tCreate new constracts\n" +
                    "4.\tDisplay list contracts\n" +
                    "5.\tEdit contracts\n" +
                    "6.\tReturn main menu\n");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    employeeService.display();
                    bookingService.display();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    break;
                default:
                    System.out.println("Chỉ nhập số từ 1 đến 4");
                    break;
            }
        } while (option != 6);
    }

    public static void displayPromotionMenu() {
        int option;
        do {
            System.out.println("------Promotion Menu------");
            System.out.println("1.\tDisplay list customers use service\n" +
                    "2.\tDisplay list customers get voucher\n" +
                    "3.\tReturn main menu\n");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    System.out.println("Chỉ nhập số từ 1 đến 4");
                    break;
            }
        } while (option != 3);
    }
}
