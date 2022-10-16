/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.ArrayList;

/**
 *
 * @author TUF
 */
public class inpFilter {
    
     public String validateAddB(String imglink, String judul, String penulis, String booklink, String genre){
     ArrayList<String> errList = new ArrayList<>();
     String alert = "";
            
            if(!judul.matches("[^<>{}]+")){
            errList.add(" Invalid Book Title ");
            }
            if (!penulis.matches("[^<>{}]+")){
            errList.add(" Invalid Writer Name ");
            }
            if (!genre.matches("[^<>{}]+")){
            errList.add(" Invalid Genre ");
            }
            if (!imglink.matches("https:\\/\\/drive\\.google\\.com\\/file\\/d\\/(.*?)\\/view\\?usp\\=sharing")){
            errList.add(" Invalid Image Link (Must Google Drive) ");
            }
            if (!booklink.matches("https:\\/\\/drive\\.google\\.com\\/file\\/d\\/(.*?)\\/view\\?usp\\=sharing")){
            errList.add(" Invalid Book Link (Must Google Drive) ");
            }
            
           if (!errList.isEmpty()) {
                for (String msg : errList) {
                alert += ("|| " +msg );
            }
           }  
           return alert;
    }
     
     public String validateEditB(String imglink, String judul, String penulis, String booklink, String genre){
     ArrayList<String> errList = new ArrayList<>();
     String alert = "";
            
            if(!judul.matches("[^<>{}]+")){
            errList.add(" Invalid Book Title ");
            }
            if (!penulis.matches("[^<>{}]+")){
            errList.add(" Invalid Writer Name ");
            }
            if (!genre.matches("[^<>{}]+")){
            errList.add(" Invalid Genre ");
            }
            if (!imglink.matches("https:\\/\\/drive\\.google\\.com\\/file\\/d\\/(.*?)\\/view\\?usp\\=sharing")){
            errList.add(" Invalid Image Link (Must Google Drive) ");
            }
            if (!booklink.matches("https:\\/\\/drive\\.google\\.com\\/file\\/d\\/(.*?)\\/view\\?usp\\=sharing")){
            errList.add(" Invalid Book Link (Must Google Drive) ");
            }
            
           if (!errList.isEmpty()) {
                for (String msg : errList) {
                alert += ("|| " +msg );
            }
           }  
           return alert;
    }
}
