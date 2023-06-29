package com.ripplestreet.musicplayer.exception;

public class IdNotFoundException extends RuntimeException {

	@Override
	public String toString() {
		return "ID does not exists";
	}
}

