package com.ripplestreet.musicplayer;

import java.util.Scanner;

import com.ripplestreet.musicplayer.controller.SongController;

public class Main {
	public static void main(String[] args) {
		SongController controller= new SongController();

		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			System.out.println("enter 1 to insert song" + ", "+ "enter 2 to delete song");
			System.out.println("enter 3 to get song details" + ", "+ "enter 4 to update song");
			System.out.println("enter 5 to display list");
			System.out.println("press c to close");
			String option = sc.next();
			
			switch (option) {
			case "1": {
				System.out.println("enter song id, name, singer and movie name");
				Integer id = sc.nextInt();
				String name = sc.next();
				String singer = sc.next();
				String movie = sc.next();
				controller.insertSong(id, name, singer, movie);
				break;
			}
			case "2": {
				System.out.println("enter song id to delete");
				Integer id = sc.nextInt();
				controller.deleteSong(id);
				break;
			}
			case "3": {
				System.out.println("enter song id to get details");
				Integer id = sc.nextInt();
				controller.getSong(id);
				break;
			}
			case "4": {
				System.out.println("enter song id and details to update (id, name, singer, movie)");
				Integer id = sc.nextInt();
				String name = sc.next();
				String singer = sc.next();
				String movie = sc.next();
				controller.updateSong(id, name, singer, movie);
				break;
			}
			case "5": {
				controller.getList();
				break;
			}
			default:
				sc.close();
				System.out.println("closed");
				return;
			}
		}
	}
	
}
