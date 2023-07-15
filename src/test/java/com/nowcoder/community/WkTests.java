package com.nowcoder.community;

import java.io.IOException;

public class WkTests {

    public static void main(String[] args) {
        String cmd = "d:/Program/wkhtmltopdf/bin/wkhtmltoimage --quality 75 https://www.taobao.com d:/Program/wkhtmltopdf/wk-image/2.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
