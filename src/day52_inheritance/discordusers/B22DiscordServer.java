package day52_inheritance.discordusers;

import day52_inheritance.discordusers.Admin;
import day52_inheritance.discordusers.User;

public class B22DiscordServer {
    public static void main(String[] args) {
        User user1= new User();
        user1.setId(1234);
        user1.setName("Suleyman");
        user1.setRole("Student");

        Admin admin1=new Admin();
        admin1.setId(4123);
        admin1.setName("Burak ANms");
        admin1.setRole("admin");

        System.out.println(user1);
        System.out.println(admin1);

    }
    }
