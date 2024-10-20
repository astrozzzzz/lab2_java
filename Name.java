
class Name {
    private String surname;
    private String firstName;
    private String patronymic;

    public Name(String surname, String firstName, String patronymic) {
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
    }

    public void setName (String name) {
        this.firstName = name;
    }

    public void setSurename (String name) {
        this.surname = name;
    }

    public void setPatronymic (String name) {
        this.patronymic = name;
    }

    public String getName () {
        return this.firstName;
    }

    public String getSurename () {
        return this.surname;
    }

    public String getPatronymic () {
        return this.patronymic;
    }

    public String toString() {
        String res = "";
        if (surname != null && !surname.isEmpty()) {
            res += surname;
            res += " ";
        }
        if (firstName != null && !firstName.isEmpty()) {
            res += firstName;
            res += " ";
        }
        if (patronymic != null && !patronymic.isEmpty()) {
            res += patronymic;
        }
        return res.trim();
    }
}
