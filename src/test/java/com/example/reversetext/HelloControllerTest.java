package com.example.reversetext;

import com.example.reversetext.HelloController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerTest {

    @Test
    void testReverseText() {
        HelloController controller = new HelloController();
        String originalText = "hello";
        String reversedText = controller.reverseText(originalText);
        assertEquals("olleh", reversedText);
    }

    @Test
    void testHandleReverseActionWithValidLength() {
        // Создайте экземпляр HelloController и установите текст меньше 2999 символов
        // Вызовите метод handleReverseAction и проверьте, что текст был корректно обработан
    }

    @Test
    void testHandleReverseActionWithExcessiveLength() {
        // Создайте экземпляр HelloController и установите текст больше 2999 символов
        // Вызовите метод handleReverseAction и проверьте, что было отображено соответствующее сообщение об ошибке
    }

    @Test
    void testReverseTextWithEmptyInput() {
        HelloController controller = new HelloController();
        assertEquals("", controller.reverseText(""));
    }

    @Test
    void testReverseTextWithSpacesAndSpecialCharacters() {
        HelloController controller = new HelloController();
        assertEquals("!dlrow olleH", controller.reverseText("Hello world!"));
    }

    @Test
    void testHandleClearAction() {
        // Создайте экземпляр HelloController, установите текст в поля ввода и вывода
        // Вызовите метод handleClearAction и проверьте, что поля были очищены
    }

    @Test
    void testFXMLFieldInitialization() {
        // Тестирование инициализации компонентов может потребовать загрузки FXML
        // и проверки, что поля не null после загрузки
    }

    @Test
    void testStatePersistenceBetweenOperations() {
        // Проверьте, сохраняется ли состояние между операциями (например, если текст остаётся в полях ввода/вывода после некоторых действий)
    }

    @Test
    void testReverseTextWithInvalidInput() {
        // Проверьте, как метод reverseText обрабатывает некорректный ввод (например, включающий специальные необрабатываемые символы)
    }

    @Test
    void testUIBehaviourForVariousInteractions() {
        // Для этого теста потребуется TestFX или аналогичный инструмент для тестирования пользовательского интерфейса
        // Тест может включать проверки реакции интерфейса на ввод текста, нажатия кнопок и т.д.
    }

}
