package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Report;

public class ReportValidator {
    public static List<String> validate(Report r) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(r.getTitle());
        if (!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _validateContent(r.getContent());
        if (!content_error.equals("")) {
            errors.add(content_error);
        }

        String enter_time_error = _validateEnter_time(r.getEnter_time());
        if (!enter_time_error.equals("")) {
            errors.add(enter_time_error);
        }

        String leave_time_error = _validateLeave_time(r.getLeave_time());
        if (!leave_time_error.equals("")) {
            errors.add(leave_time_error);
        }

        return errors;
    }

    private static String _validateTitle(String title) {
        if (title == null || title.equals("")) {
            return "タイトルを入力してください。";
        }

        return "";
    }

    private static String _validateContent(String content) {
        if (content == null || content.equals("")) {
            return "内容を入力してください。";
        }

        return "";
    }

    private static String _validateEnter_time(String enter_time) {
        if (enter_time == null || enter_time.equals("")) {
            return "出勤時間を入力してください。";
        }

        return "";
    }

    private static String _validateLeave_time(String leave_time) {
        if (leave_time == null || leave_time.equals("")) {
            return "退勤時間を入力してください。";
        }

        return "";
    }
}
