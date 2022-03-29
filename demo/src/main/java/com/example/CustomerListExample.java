package com.example;

import java.util.*;
import org.json.simple.*;

public class CustomerListExample {

  private static LinkedList<Customer> customerList = new LinkedList<Customer>();

  public static void main(String[] args) {
    String fileName =
      "/Users/natnaelebuy/Documents/GitHub/Githubnatnael/lab-week9/demo/src/main/java/com/example/customer_data.json";

    // read customers names
    JSONArray customerArray = JSONFile.readArray(fileName);

    // add each customer to linked list
    copyToList(customerArray);

    // print array
    System.out.println("----- linked list -----");
    print();
  }

  // get array of customers
  public static ArrayList<String> nameArray(JSONArray customerArray) {
    ArrayList<String> arr = new ArrayList<String>();

    // get names from json object
    for (int i = 0; i < customerArray.size(); i++) {
      JSONObject o = (JSONObject) customerArray.get(i);
      String name = (String) o.get("name");
      arr.add(name);
    }
    return arr;
  }

  // copy customers array to the linked list
  public static void copyToList(JSONArray arr) {
    for (int i = 0; i < arr.size(); i++) 
    {
      // fetch the json object
      JSONObject o = (JSONObject) arr.get(i);

      // parse the hash map
      Integer id = ((Long) o.get("id")).intValue();
      System.out.println(id);
      String name = (String) o.get("name");
      System.out.println(name);
      String email = (String) o.get("email");
      System.out.println(email);
    
    {
      System.out.println(o+"");
    }
    }
  }

  // print customer linked list
  public static void print() {
    List<Customer> list;
    LinkedList<String> customList = new LinkedList<>();
    for (int i = 0; i < customerList.size(); i++) {
      System.out.println(i +" = "+customerList.get(i));
  }
    
  }
}
