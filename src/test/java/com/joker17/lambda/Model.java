package com.joker17.lambda;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;

@Data
public class Model {
    private Long id;
    private String name;

    private boolean check;

    private Boolean checkBool;
    private Boolean isCheckBool;

    private int intVal;
    private Integer integer;

    private String n;

    private String an;

    private String abNNs;
    private String 中文字符名;


    /**
     * 第二个字母为大写时，首字母应为大写 （正确示例）
     */
    private String CN;

    /**
     * 第二个字母为大写时，首字母应为大写 （错误示例）
     */
    private String bN;
    private String bNs;

    /**
     * 第二个字母为大写时，首字母应为大写 （特殊示例，自定义getter方法可推断一致）
     */
    @Getter(AccessLevel.NONE)
    public String bNFromCustomGetter;

    public String getbNFromCustomGetter() {
        return bNFromCustomGetter;
    }
}
