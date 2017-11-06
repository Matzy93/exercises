import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

	LocalDateTime correctBirth;

    Gigasecond(LocalDate birthDate) {
        this.correctBirth = LocalDateTime.of(birthDate.getYear(),birthDate.getMonthValue(),birthDate.getDayOfMonth(),0,0);
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this.correctBirth = birthDateTime;
    }

    LocalDateTime getDate() {
        return this.correctBirth.plusDays(2500000);
    }

}
