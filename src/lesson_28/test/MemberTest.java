package lesson_28.test;

import lesson_28.Member;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MemberTest {

    Member member;
    String startEmail = "john@test.com";
    String startPassword = "qwerty1Q$";


    @BeforeEach
    void setUp() {
        member = new Member(startEmail, startPassword);
    }

    @Test
    void testValidEmailSet(){
        String validEmail = "valid@test.com";
        System.out.println("getEmail after: " + member.getEmail());

        member.setEmail(validEmail);

        System.out.println("getEmail before: " + member.getEmail());
        Assertions.assertEquals(validEmail, member.getEmail());
    }

    @ParameterizedTest
    @MethodSource("invalidEmailData")
    public void testSetInvalidEmail(String email){
        member.setEmail(email);
        Assertions.assertEquals(startEmail,member.getEmail());

    }
    static Stream<String> invalidEmailData() {
        return Stream.of(
                "test@email@.net",
                "test@emailnet",
                "test@email.net.",
                "test@.email.net",
                "test@em%ail.net",
                "test@em ail.net",
                "@test@email.net"

        );
    }
    @Test
    void TestValidPasswordSet(){
        String validPassword = "qwerty1Q$";
        member.setPassword(validPassword);
        Assertions.assertEquals(validPassword,member.getPassword(),"Валидный пароль успешно установлен");
    }
    @ParameterizedTest
    @MethodSource("invalidPasswordData")
    void testSetInvalidPassword(String password){
        member.setPassword(password);
        Assertions.assertNotEquals(password,member.getPassword(),"Невалидный пароль не должен быть установлен.");
    }
    static Stream<String> invalidPasswordData(){
        return Stream.of(
                "short",
                "nouppercase1!",
                "NOLOWERCASE1!",
                "NoNumbers!",
                "NoSpecialchar1",
                "aaaaaaa1A!"
        );
    }

}