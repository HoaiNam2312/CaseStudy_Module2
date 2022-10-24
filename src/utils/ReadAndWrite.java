package utils;

import java.io.*;
import java.util.Collection;
import java.util.List;

public class ReadAndWrite {

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


    public static void writeToFile(Collection products, String addressFile) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(addressFile))) {
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readFromFile(String fileAddress) {
        Object temp = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileAddress))) {
            temp = (Object) objectInputStream.readObject();
            return temp;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
