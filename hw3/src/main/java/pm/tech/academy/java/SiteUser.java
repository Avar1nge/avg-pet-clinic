package pm.tech.academy.java;

import java.time.LocalDate;

public class SiteUser {
    private final String email;
    private final String name;
    private final LocalDate birthday;

    public SiteUser(String email, String name, LocalDate birthday) {
        this.email = email;
        this.name = name;
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
// TODO implement equals and hashCode by email and name (objects are equal if emails and names are equal by values and even if birthdays are different)


    @Override
    public boolean equals(Object o) {
        if (o == null) return false;

        SiteUser siteUser = (SiteUser) o;

        if (email != null ? !email.equals(siteUser.email) : siteUser.email != null) return false;
        return name != null ? name.equals(siteUser.name) : siteUser.name == null;
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
