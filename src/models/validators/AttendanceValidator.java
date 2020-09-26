package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Attendance;

public class AttendanceValidator {
    public static List<String> validate(Attendance a) {
        List<String> errors = new ArrayList<String>();

        String entering_error = _validateEntering(a.getEntering());
        if (!entering_error.equals("")) {
            errors.add(entering_error);
        }

        String leaving_error = _validateLeaving(a.getLeaving());
        if (!leaving_error.equals("")) {
            errors.add(leaving_error);
        }

        return errors;
    }

    private static String _validateEntering(String entering) {
        if (entering == null || entering.equals("")) {
            return "出勤時間を入力してください。";
        }

        return "";
    }

    private static String _validateLeaving(String leaving) {
        if (leaving == null || leaving.equals("")) {
            return "退勤時間を入力してください。";
        }

        return "";
    }
}
