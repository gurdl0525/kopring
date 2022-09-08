import com.example.kopring.global.error.ErrorCode

open class BaseException(val errorCode: ErrorCode) : RuntimeException() {
}