@RunWith(Parameterized.class) // Напиши аннотацию для параметризованных тестов
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;  // Инициализируй поля класса в конструкторе
    }

    @Parameterized.Parameters
    // Пометь метод аннотацией для параметров
    public static Object[][] getTextData() {
        return new Object[][] {
                {18, true},
                {17, false},
                {19, true},
                {21, true},// Заполни массив тестовыми данными и ожидаемым результатом
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();

        boolean isAdult = program.checkIsAdult(age);
        // Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
        assertEquals("error age", result, isAdult);
    }
}

//Тесты из предыдущего задания можно объединить в один параметризованный тест. Так код будет поддерживаемым и с ним будет удобнее работать.
//Допиши параметризованный тест checkIsAdultWhenAgeThenResult, который проверит возраст из каждого класса эквивалентности. Учти, что код приложения пишут люди из разных стран, и в некоторых совершеннолетие наступает в 21 год.
//В тест будет передаваться два аргумента: возраст и ожидаемый результат проверки. Реализуй это требование с помощью двумерного массива аргументов.