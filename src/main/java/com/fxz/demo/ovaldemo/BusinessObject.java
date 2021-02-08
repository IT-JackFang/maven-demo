package com.fxz.demo.ovaldemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.sf.oval.constraint.Length;
import net.sf.oval.constraint.NotEmpty;
import net.sf.oval.constraint.NotNull;

/**
 * 描述：
 *
 * @author Fang
 * @date 2021-01-18 11:12:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusinessObject {

    @NotNull
    @NotEmpty
    @Length(max = 32)
    private String name;

}
