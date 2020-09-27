package com.sanlian.boot.selector;

import com.sanlian.core.impl.TmriHttpClientImpl;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName TmriClientSelector
 * @Description: TODO
 * @Author Soft001
 * @Date 2020/9/23
 **/
public class TmriClientSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
//        // 第一步：获取到通过ComponentScan指定的包路径
//        String[] basePackages = null;
//        // @Import注解对应的类上的ComponentScan注解
//        if (importingClassMetadata.hasAnnotation(ComponentScan.class.getName())) {
//            Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(ComponentScan.class.getName());
//            basePackages = (String[]) annotationAttributes.get("basePackages");
//        }
//        if (basePackages == null || basePackages.length == 0) {
//            //ComponentScan的basePackages默认为空数组
//            String basePackage = null;
//            try {
//                // @Import注解对应的类的包名
//                basePackage = Class.forName(importingClassMetadata.getClassName()).getPackage().getName();
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//            basePackages = new String[]{basePackage};
//        }
//        // 第er步，知道指定包路径下所有实现了EasysteamService接口的类（ClassPathScanningCandidateComponentProvider的使用）
//        ClassPathScanningCandidateComponentProvider scanner = new ClassPathScanningCandidateComponentProvider(false);
//        TypeFilter mfjyFilter = new AssignableTypeFilter(MfjyTmriHttpClient.class);
//        TypeFilter drvFilter = new AssignableTypeFilter(DrvTjTmriHttpClient.class);
//        scanner.addIncludeFilter(mfjyFilter);
//        scanner.addIncludeFilter(drvFilter);
//        Set<String> classes = new HashSet<String>();
//        for (String basePackage : basePackages) {
//            Set<BeanDefinition>beans=scanner.findCandidateComponents(basePackage);
//            for (BeanDefinition beanDefinition: beans ) {
//                classes.add(beanDefinition.getBeanClassName());
//            }
//            //.forEach(beanDefinition -> classes.add(beanDefinition.getBeanClassName()));
//        }
//        // 第三步，返回添加到IOC容器里面去
//        return classes.toArray(new String[0]);
        return new String[] {TmriHttpClientImpl.class.getName()};
    }

}
