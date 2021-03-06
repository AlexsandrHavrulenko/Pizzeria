package com.xzteam.pizzeria;

import com.xzteam.pizzeria.domain.Dish;
import com.xzteam.pizzeria.domain.enums.DishType;
import com.xzteam.pizzeria.repository.DishRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PizzeriaApplicationTests {

    @Autowired
    DishRepository dishRepository;

    @Test
    public void simpleTest() {
        Dish dish = dishRepository.findOne(777L);
        Assert.assertEquals(dish.getType(), DishType.DRINK);
        Assert.assertEquals(dish.getPrice(), 10f, 0.1f);
    }

    @Test(expected = NullPointerException.class)
    public void testGetNull() {
        Dish dish = dishRepository.findOne(-1L);
        dish.getName();
    }

}
