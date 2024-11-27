package com.universe.check;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class GeneratorCode {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/check?serverTimezone=GMT%2B8", "root", "1234")
            .globalConfig(builder -> {
                builder.author("mrf") // 设置作者
                        .outputDir("src/main/java"); // 输出目录
            })
            .packageConfig(builder -> {
                builder.parent("com.universe.check") // 设置父包名
                        .entity("model") // 设置实体类包名
                        .mapper("dao") // 设置 Mapper 接口包名
                        .service("service") // 设置 Service 接口包名
                        .serviceImpl("service.impl") // 设置 Service 实现类包名
                        .xml("mappers"); // 设置 Mapper XML 文件包名
            })
            .strategyConfig(builder -> {
                builder.addInclude("sys_role", "sys_user", "sys_user_role", "sys_dict", "db_check_category", "tb_check_area", "tb_check_area_item", "tb_check_area_score", "tb_check_item_score", "tb_check_batch") // 设置需要生成的表名
                        .entityBuilder()
                        .enableLombok() // 启用 Lombok
                        .enableTableFieldAnnotation() // 启用字段注解
                        .controllerBuilder()
                        .enableRestStyle(); // 启用 REST 风格
            })
//            .templateEngine(new FreemarkerTemplateEngine()) // 使用 Freemarker 模板引擎
            .execute(); // 执行生成
    }





}
