package com.exceptions;

import org.junit.Test;

public class CityNotFoundExample {

    @Test
    public void throwCityNotFound() {
       try {
           throw new CityNotFoundException("saas");
       }
       catch (CityNotFoundException e){
           e.printStackTrace();
       }
    }
}
