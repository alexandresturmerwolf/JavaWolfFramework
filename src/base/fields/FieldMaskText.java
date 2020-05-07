/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base.fields;

/**
 *
 * @author wolfi
 */
public class FieldMaskText {

    private final Fields.FieldType TYPE = Fields.FieldType.FIELD_MASK_TEXT;

    private String field = null;
    private String alias = null;
    private String mask = null;

    /**
     * Constructor complete
     *
     * @param field filedname
     * @param alias nome to show end user
     * @param mask mask
     */
    public FieldMaskText(String field, String alias, String mask) {
        this.field = field;
        this.alias = alias;
        this.mask = mask;

    }
}
