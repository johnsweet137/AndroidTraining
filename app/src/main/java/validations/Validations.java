package validations;

import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

public class Validations {
    public static boolean isValidEmail(String email){
        return (!TextUtils.isEmpty(email)&& Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}
