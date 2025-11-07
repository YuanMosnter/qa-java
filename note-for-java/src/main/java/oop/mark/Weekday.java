package oop.mark;

public enum Weekday {
    SUN,MON,TUE,WED,THU,FRI,SAT;

    /**
     *  * 如果在主方法中用===的方式比较
     *可读性不够好：直接使用 if 判断会使代码显得冗长，特别是当判断条件增多时
     * 维护性差：如果需要添加更多的周末判断或者修改逻辑，需要修改 main 方法内部代码
     * 缺乏封装性：业务逻辑（判断是否为周末）暴露在主方法中
     * @return
     */
    public boolean isWeekday(){
        return this == SAT || this == SUN;    }
}
