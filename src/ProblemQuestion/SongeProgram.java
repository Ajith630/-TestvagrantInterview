package ProblemQuestion;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class SongeProgram {
	
 	    public static void test() {

 	        LinkedHashMap<String, List<String>> list = new LinkedHashMap<String, List<String>>();
	        LinkedHashMap<String, Integer> sonlglist;
	        ArrayList<String> array = null;
	        String nexts = "";
	        while (true) {
	            System.out.println("Enter the User Name");
	            Scanner scr = new Scanner(System.in);
	            String next = scr.next();
	            if (!list.containsKey(next)) {
	                list.put(next, null);
	            }
	            System.out.println("Enter the yes if you want to add a user or else enter no");
	            Scanner loopagain = new Scanner(System.in);
	            String nextagain = loopagain.next();
	            if (!nextagain.equalsIgnoreCase("yes")) {
	                break;
	            }
	        }
	        while (true) {
	            sonlglist = new LinkedHashMap<String, Integer>();;
	            System.out.println("Enter the username to play your favorite songs");
	            Scanner favsong = new Scanner(System.in);
	            nexts = favsong.next();
	            if (nexts.equalsIgnoreCase("Quit")) {
	                System.out.println("Thanks for choosing the app");
	                break;
	            }
	            if (list.containsKey(nexts)) {
	                array = new ArrayList<String>();
	                int j = 0;
	                while (true) {
	                    if (j == 0) {
	                        j = 0;
	                    }

	                    if (j > 2) {
	                        System.out.println("Enter Your Favorite songs to play or if you to close the app enter stop");
	                        Scanner songz = new Scanner(System.in);
	                        String nexsongz = songz.next();
	                        if (nexsongz.equalsIgnoreCase("stop")) {
	                            // list.put(nexts, ss);
	                            // System.out.println(sonlglist);
	                            break;
	                        }
	                        if (sonlglist.containsKey(nexsongz)) {
	                            int integer = sonlglist.get(nexsongz);
	                            sonlglist.put(nexsongz, integer + 1);
	                        } else {
	                            Set<String> keySet = sonlglist.keySet();
	                            ArrayList<String> ss = new ArrayList<String>(keySet);
	                            String key = "";
	                            for (int i = 0; i < ss.size(); i++) {
	                                int min = sonlglist.get(ss.get(0));
	                                if (sonlglist.get(ss.get(i)) < min) {
	                                    if(ss.get(i).equals(nexsongz)){
	                                        min=min;
	                                    }else {
	                                        min = sonlglist.get(ss.get(i));
	                                    }
	                                    
	                                    key = ss.get(i);
	                                }
	                            }
	                            if (key.isEmpty()) {
	                                sonlglist.remove(ss.get(0));
	                            } else {
	                                sonlglist.remove(key);
	                            }

	                            sonlglist.put(nexsongz, 1);

	                        }

	                    } else if (j <= 2) {
	                        System.out.println("Enter Your Favorite songs to play or if you to close the app enter stop");
	                        Scanner song = new Scanner(System.in);
	                        String nexsong = song.next();
	                        if (nexsong.equalsIgnoreCase("stop")) {
	                            break;
	                        }
	                        if (sonlglist.containsKey(nexsong)) {
	                            int integer = sonlglist.get(nexsong);
	                            sonlglist.put(nexsong, sonlglist.put(nexsong, integer + 1));
	                        } else {
	                            sonlglist.put(nexsong, 1);
	                        }
	                    }
	                    j++;
	                }	                 
	                Set<String> keySet = sonlglist.keySet();
	                ArrayList<String> ss = new ArrayList<String>(keySet);
	                for (int i = 0; i < ss.size(); i++) {
	                    array.add(ss.get(i));
	                }
	                list.put(nexts, ss);
	                System.out.println(sonlglist);

	                ss=null;
	                keySet=null;
	                array=null;
 	            } else {
	                if (!nexts.equalsIgnoreCase("Quit")) {
	                    System.out.println("Entered Name is not registered.Please register .............");
	                }
	                break;
	            }
	        }
	        Set<Entry<String, List<String>>> entrySet = list.entrySet();
	        for (Entry<String, List<String>> entry : entrySet) {
	            System.out.println(entry.getKey() + " :: Recently Played Songs :: " + entry.getValue());
	        }
	    }

	    public static void main(String[] args) {
	        test();
	    }
	}



