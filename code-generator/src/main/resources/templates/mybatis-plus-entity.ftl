package ${entityPackage};

<#if hasParent>
import ${entityParent};
</#if>
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

<#if hasDate>
import java.util.Date;
</#if>

/**
 * <b>${entityComment}</b>
 *
 * @author
 * @date
 * @version
 * @since
 */
@Data
@TableName("${tableName}")
public class ${entityName} <#if hasParent>extends ${entityParentShort}</#if> {
	private static final long serialVersionUID = 1L;
<#list columnPropertyList as columnProperty>
<#if columnProperty.isPrimary>
	@TableId
    private ${columnProperty.propertyType} ${columnProperty.propertyName};                        // ${columnProperty.propertyComment}
<#else>
	@TableField(value = "${columnProperty.columnName}")
	private ${columnProperty.propertyType} ${columnProperty.propertyName};                        // ${columnProperty.propertyComment}
</#if>
</#list>
}