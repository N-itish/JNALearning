package com.nitish.javaFx;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

public interface JNAInterface extends Library {
	JNAInterface INSTANCE = (JNAInterface) Native.loadLibrary((Platform.isWindows() ? "msvcrt" : "c"), JNAInterface.class);
	 void printf(String format, Object... args);
	 int sprintf(byte[] buffer, String format, Object... args);
	 int scanf(String format, Object... args);
}
