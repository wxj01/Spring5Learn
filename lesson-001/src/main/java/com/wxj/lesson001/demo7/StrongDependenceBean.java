package com.wxj.lesson001.demo7;
import org.springframework.beans.factory.DisposableBean;
/**
 * @author wxj
 * @version 1.0
 * @description: TODO 强依赖的bean创建和销毁顺序
 * @date 2021/8/20 0020 14:20
 */

public class StrongDependenceBean {
    public static class Bean1 implements DisposableBean {

        public Bean1() {
            System.out.println(this.getClass() + " constructor!");
        }

        @Override
        public void destroy() throws Exception {
            System.out.println(this.getClass() + " destroy()");
        }
    }

    public static class Bean2 implements DisposableBean {

        private Bean1 bean1;

        public Bean2(Bean1 bean1) { //@1
            this.bean1 = bean1;
            System.out.println(this.getClass() + " constructor!");
        }

        @Override
        public void destroy() throws Exception {
            System.out.println(this.getClass() + " destroy()");
        }
    }

    public static class Bean3 implements DisposableBean {

        private Bean2 bean2;

        public Bean3(Bean2 bean2) { //@2
            this.bean2 = bean2;
            System.out.println(this.getClass() + " constructor!");
        }

        @Override
        public void destroy() throws Exception {
            System.out.println(this.getClass() + " destroy()");
        }
    }
}