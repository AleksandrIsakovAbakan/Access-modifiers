import java.util.*

class Registration() {

    var email: String = ""
        get() = field.uppercase(Locale.getDefault())

    var password: String = ""
        set(value) {
            if (value.length < 6) println("Длина пароля менее 6 символов") else field = value
        }

    override fun toString(): String {
        return "Registration(email='$email', password='$password')"
    }
}