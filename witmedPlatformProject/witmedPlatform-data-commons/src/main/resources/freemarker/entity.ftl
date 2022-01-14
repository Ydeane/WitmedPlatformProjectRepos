package ${packageName};
import com.yrx.witmedPlatform.base.entity.BaseEntity;
import lombok.Data;
/**
 * <b>系统功能-系统功能菜单信息实体信息</b>
 *
 * @author Ydene
 * @date 2022-1-4
 * @version 1.0.0
*/
@Data
public class ${className} extends BaseEntity {
<#list propertyList as property >
	private ${property.type}  ${property.name};     //${property.comment}
</#list>

}
