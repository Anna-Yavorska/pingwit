package org.example.hw_22.task_1;

import org.apache.commons.lang3.RandomUtils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class ReflectionHomework {
    private static final Random random = new Random();

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        PersonalInfo personalInfo = new PersonalInfo("Ivan", "Petrov", 53, true);
        Class<?> clazz = personalInfo.getClass();
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        Object reflectionPersonalInfo = null;
        for (Constructor<?> constructor : declaredConstructors) {
            if (constructor.getParameterCount() == 0) {
                reflectionPersonalInfo = constructor.newInstance();
            }
        }
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            if (declaredField.getName().equals("name")) {
                String randomName = createRandomString(6);
                declaredField.set(reflectionPersonalInfo, randomName);
            }
            if (declaredField.getName().equals("surname")) {
                String randomSurname = createRandomString(10);
                declaredField.set(reflectionPersonalInfo, randomSurname);
            }
            if (declaredField.getName().equals("age")) {
                declaredField.set(reflectionPersonalInfo, random.nextInt(0, 100));
            }
            if (declaredField.getName().equals("isMarried")) {
                declaredField.set(reflectionPersonalInfo, RandomUtils.nextBoolean());
            }
        }
        System.out.println(reflectionPersonalInfo);
    }

    private static String createRandomString(int lettersQuantity) {
        int leftLimit = 97;
        int rightLimit = 122;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= lettersQuantity; i++) {
            int randomLimitInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            sb.append((char) randomLimitInt);
        }
        String randomString = sb.toString();
        return randomString.toUpperCase();
    }
}
