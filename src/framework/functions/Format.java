/**
 * 
 */
package framework.functions;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import framework.modules.settings.Classes.Settings;



/**
 * @author joana
 *
 */
public class Format {

	public static String format1decimal(float number) {
		DecimalFormat nformat = new DecimalFormat(".0");
		return nformat.format(number);
	}

	public static String format2decimal(float number) {
		DecimalFormat nformat = new DecimalFormat(".00");
		return nformat.format(number);
	}

	public static String format3decimal(float number) {
		DecimalFormat nformat = new DecimalFormat(".000");
		return nformat.format(number);
	}
	
	public static String formatCurrency(float money, Settings config) {
		NumberFormat currency=null;
		switch (config.getCurrency()) {
			case '$':
				currency = NumberFormat.getCurrencyInstance(Locale.US);// Dolar
				money = money*1.0844f;
				break;
			case '£':
				currency = NumberFormat.getCurrencyInstance(Locale.UK);	// Libra
				money = money*0.72686f;
				break;
			case '€':
				currency = NumberFormat.getCurrencyInstance(Locale.FRANCE);	// Euro
				break;
			}
		return currency.format(money);
	}
}
