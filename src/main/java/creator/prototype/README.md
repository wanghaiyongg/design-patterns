## 原型模式

### 用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象

### 优点
-- 性能优良。原型模式是在内存二进制流的拷贝，要比直接new对象性能好很多。
-- 逃避构造函数的约束

### 使用场景
-- 资源优化场景
-- 性能和安全要求的场景
-- 一个对象多个修改者的场景

### 注意事项
-- 构造函数不会被执行
-- 先拷贝和深拷贝
-- clone与final