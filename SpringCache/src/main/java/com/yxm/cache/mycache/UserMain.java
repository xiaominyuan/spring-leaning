package com.yxm.cache.mycache;

public class UserMain {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.getUserById("111");
        userService.getUserById("111");
        userService.reload();
        System.out.println("after reload");

        userService.getUserById("111");
        userService.getUserById("111");
    }
}
