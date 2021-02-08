package com.fxz.demo.ovaldemo;

import lombok.extern.slf4j.Slf4j;
import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;

import java.util.List;

/**
 * 描述：
 *
 * @author Fang
 * @date 2021-01-18 11:17:05
 */
@Slf4j
public class OvalDemos {

    public static void main(String[] args) {

        Validator validator = new Validator();

        BusinessObject bo = new BusinessObject("Fang");

        List<ConstraintViolation> violations = validator.validate(bo);

        if (!violations.isEmpty()) {
            log.info("Object " + bo + " is invalid!");
            throw new BusinessException(violations);
        } else {
            System.out.println("name = " + bo.getName());
        }

    }

}
