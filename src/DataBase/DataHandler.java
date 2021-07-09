package DataBase;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataHandler {

    public static final Path path = Paths.get(System.getProperty("user.dir"));
    public static final File file = new File(path.toString() +"/src/DataBase/Files");



    public static UserData signUp(String userName , String password_1 , String password_2){

        if(password_1.equals(password_2)){
            return makeUser(userName , password_1);
        }
        else
            return null;
    }
    public static UserData makeUser(String userName , String password){
        UserData userData = new UserData(userName , password) ;
        try {
            File userFile = new File(file + "/" + userName + ".ser") ;
            userFile.createNewFile();
            FileOutputStream out = new FileOutputStream(userFile);
            ObjectOutputStream obj = new ObjectOutputStream(out) ;
            obj.writeObject(userData);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userData ;

    }
    public static UserData getUser(String userName , String password){

        if(searchForFile(userName)){
              UserData userData = null;
            try {
                FileInputStream userFile = new FileInputStream(file + "/" + userName + ".ser");
                ObjectInputStream obj = new ObjectInputStream(userFile) ;
                userData = (UserData) obj.readObject() ;

            } catch (IOException | ClassNotFoundException e) {
                System.out.println("unable to find .ser file");
                return null ;
            }
            if(userData.getPassword().equals(password))
                return userData ;
            else
                return null ;
        }
        else {
            return null;
        }
    }


    private static @NotNull
    Boolean searchForFile(String str){
        if(file.list()!=null){
        for (String i : file.list()) {
            String arr[] = i.split("\\.");
            if (str.trim().equals(arr[0]))
                return true;
            }
        }
        return false;
    }

}
