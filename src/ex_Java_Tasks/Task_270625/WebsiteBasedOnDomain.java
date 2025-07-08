package ex_Java_Tasks.Task_270625;

import java.util.Scanner;

public class WebsiteBasedOnDomain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the website url!!");
        String website = scanner.next();

        if(website.contains(".com")){
            System.out.println(website + " The website type is: Commercial website");
        } else if (website.contains(".org")) {
            System.out.println(website + " The website type is: Non-profit organization");
        }else if (website.contains(".edu")) {
            System.out.println(website + " The website type is: Educational institution");
        }else if (website.contains(".gov")) {
            System.out.println(website + " The website type is: Government website");
        }else if (website.contains(".info")) {
            System.out.println(website + " The website type is: Informational website");
        }else {
            System.out.println(website + " The website type is: Unknown or other types of websites");
        }
    }
}
