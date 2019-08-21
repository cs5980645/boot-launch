package com.cf.bootlaunch.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data   //生成get set hash方法
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article {


    /**
     * id : 1
     * author : zimug
     * title : 手摸手教你开发spring boot
     * content : c
     * createTime :
     * reader : [{"name":"zimug","age":18},{"name":"kobe","age":37}]
     */

    private int id;
    private String author;
    private String title;
    private String content;
    private String createTime;
    private List<ReaderBean> reader;



    public static class ReaderBean {
        /**
         * name : zimug
         * age : 18
         */

        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
