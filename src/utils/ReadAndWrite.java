package utils;

import models.*;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ReadAndWrite {
    private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//    public static void writeToFile(Collection collection, String fileAddress) throws IOException {
//        File file = new File(fileAddress);
//        if (!file.exists()) {
//            try {
//                file.createNewFile();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        FileOutputStream fileOutputStream = null;
//        ObjectOutputStream objectOutputStream = null;
//        try {
//            fileOutputStream = new FileOutputStream(fileAddress);
//            objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(collection);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                fileOutputStream.close();
//                objectOutputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }


//    public static void writeToFile(Collection products, String addressFile) {
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(addressFile))) {
//            oos.writeObject(products);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    //    public static Object readFromFile(String fileAddress) {
////        List<Object> temp = null;
////        Customer customer = null;
//        Object temp = null;
//        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileAddress))) {
//            temp = objectInputStream.readObject();
//            return temp;
////            customer = objectInputStream.
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        return null;
//    }
    public static void writeFileCustomer(List<Customer> customerList, String fileAddress) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileAddress))) {
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Customer> readFileCustomer(String fileAddress) {
        List<Customer> customerList = new LinkedList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String lineArr[] = line.split(",");
                customerList.add(new Customer(lineArr[0],lineArr[1],lineArr[2],Integer.parseInt(lineArr[3]),lineArr[4],lineArr[5],lineArr[6],lineArr[7],lineArr[8]));
            }
            return customerList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeFileEmployee(ArrayList<Employee> employeeList, String fileAddress) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileAddress))) {
            for (Employee employee : employeeList) {
                bufferedWriter.write(employee.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Employee> readFileEmployee(String fileAddress) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String lineArr[] = line.split(",");
                employeeArrayList.add(new Employee(lineArr[0],lineArr[1],lineArr[2],Integer.parseInt(lineArr[3]),lineArr[4],lineArr[5],lineArr[6],lineArr[7],lineArr[8],Integer.parseInt(lineArr[9])));
            }
            return employeeArrayList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeFileVilla(Map<Villa, Integer> villaList, String fileAddress) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileAddress))) {
            Set<Map.Entry<Villa, Integer>> villas = villaList.entrySet();
            for (Map.Entry<Villa, Integer> villa : villas) {
                bufferedWriter.write(villa.getKey().toString());
                bufferedWriter.write(villa.getValue().toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Villa,Integer> readFileVilla(String fileAddress) {
        Map<Villa,Integer> villaList = new LinkedHashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String lineArr[] = line.split(",");
                Villa newVilla = new Villa(lineArr[0],lineArr[1],Double.parseDouble(lineArr[2]),Integer.parseInt(lineArr[3]),Integer.parseInt(lineArr[4]),lineArr[5],lineArr[6],Double.parseDouble(lineArr[7]),Integer.parseInt(lineArr[8]));
                villaList.put(newVilla,Integer.parseInt(lineArr[9]));
            }
            return villaList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int readCountBooking(String fileAddress,String service) {
        int count =0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] lineArr = line.split(",");
                for (String element : lineArr) {
                    if (element.equals(service)) {
                        count++;
                    }
                }
            }
            return count;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static void writeFileHouse(Map<House, Integer> houseList, String fileAddress) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileAddress))) {
            Set<Map.Entry<House, Integer>> houses = houseList.entrySet();
            for (Map.Entry<House, Integer> house : houses) {
                bufferedWriter.write(house.getKey().toString());
                bufferedWriter.write(house.getValue().toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<House,Integer> readFileHouse(String fileAddress) {
        Map<House,Integer> houseList = new LinkedHashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String lineArr[] = line.split(",");
                House newHouse = new House(lineArr[0],lineArr[1],Double.parseDouble(lineArr[2]),Integer.parseInt(lineArr[3]),Integer.parseInt(lineArr[4]),lineArr[5],lineArr[6],Integer.parseInt(lineArr[7]));
                houseList.put(newHouse,Integer.parseInt(lineArr[8]));
            }
            return houseList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeFileRoom(Map<Room, Integer> roomList, String fileAddress) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileAddress))) {
            Set<Map.Entry<Room, Integer>> rooms = roomList.entrySet();
            for (Map.Entry<Room , Integer> room : rooms) {
                bufferedWriter.write(room.getKey().toString());
                bufferedWriter.write(room.getValue().toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Room,Integer> readFileRoom(String fileAddress) {
        Map<Room,Integer> roomList = new LinkedHashMap<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String lineArr[] = line.split(",");

                Room newRoom = new Room(lineArr[0],lineArr[1],Double.parseDouble(lineArr[2]),Integer.parseInt(lineArr[3]),Integer.parseInt(lineArr[4]),lineArr[5],lineArr[6]);
                roomList.put(newRoom,Integer.parseInt(lineArr[7]));
            }
            return roomList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void writeFileBooking(TreeSet<Booking> bookingList, String fileAddress) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileAddress))) {
            for (Booking booking : bookingList) {
                bufferedWriter.write(booking.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static TreeSet<Booking> readFileBooking(String fileAddress) {
        TreeSet<Booking> bookingList = new TreeSet<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileAddress))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.trim().equals("")) {
                    continue;
                }
                String[] lineArr = line.split(",");
                bookingList.add(new Booking(lineArr[0],df.parse(lineArr[1]),df.parse(lineArr[2]),lineArr[3],lineArr[4],lineArr[5]));
            }
            return bookingList;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

}
