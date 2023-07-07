package com.sermister1.mcnotes;

public class TextStrings {
	//strings declare
	public static String TextFCont = "";
	public static String TextF1Cont = "";
	//getters(:funny:)
	public static String Get1Str() {
			return TextFCont;
		}
	public static String Get2Str() {
		return TextF1Cont;
	}
	//writers
	public static void Write2Str1(String InputText) {
		TextFCont = InputText;
	}
	public static void Write2Str2(String InputText) {
		TextF1Cont = InputText;
	}
}
