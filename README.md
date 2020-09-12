

# 類神經網路 Artificial Neural Network

###### Java 單層感知機實作 Single-Layer Perceptron coding in Java

+++

此程式碼由成德高中810038羅崧瑋所撰寫

為自主學習之項目 若有不足請見諒

+++

[1]: https://www.books.com.tw/products/0010801297?sloc=main "類神經網路實戰：使用 Python"
[2]: https://www.books.com.tw/products/0010807359 "不插電：用Java手刻一個類神經網路"
[3]: https://www.books.com.tw/products/0010824023?sloc=main "Java SE8 OCAJP專業認證指南"
[4]: https://zh.wikipedia.org/wiki/%E4%BA%BA%E5%B7%A5%E7%A5%9E%E7%BB%8F%E7%BD%91%E7%BB%9C#%E7%A5%9E%E7%BB%8F%E5%85%83%E7%BD%91%E7%BB%9C "維基百科-人工神經網路"
[5]: https://zh.wikipedia.org/wiki/%E6%84%9F%E7%9F%A5%E5%99%A8 "維基百科-感知器"
[6]: https://1fly2sky.wordpress.com/2017/02/14/%E9%A1%9E%E7%A5%9E%E7%B6%93%E7%B6%B2%E8%B7%AF-%E6%84%9F%E7%9F%A5%E6%A9%9F%E7%9A%84%E5%8E%9F%E7%90%86%E4%BB%A5%E5%8F%8A%E5%AF%A6%E4%BD%9C/ "類神經網路-感知機的原理以及實作"

### **學習資料**

<h4>參考書籍 :

* [ 類神經網路實戰：使用 Python][1]
* [不插電：用Java手刻一個類神經網路][2]
* [Java SE8 OCAJP專業認證指南][3]

 <h4>網站 :

* [維基百科-人工神經網路][4]
* [維基百科-感知器][5]
* [類經網路-感知機的原理以及實作][6]

### **程式碼注意事項**

* `Perceptron.java` 

  我在裡面設的值都是我覺得結果比較好的值 更改可能會造成感知機學不起來

* `train.java`

  #### net函數

  公式: $net=\displaystyle\sum_{i=1}^n x _i\times w_i= x_ 1*w_ 1-\Theta$

  ````java
  public double Sigma(final double x) {
          net = (x * w - e);
          return net;
      }
  ````

  #### 正確率函數

  公式: $正確率=1-\frac{錯誤次數}{總次數}$

  ```java
      public float per(int wr, int dataset) {
          			//錯誤次數   //總次數
          return (1 - (wr * 1.00f / dataset));
      }
  ```

  

* `Data.java`

  #### 產生亂數

  利用 Java 內建`Math.random()`函數生成 max ~ min 的隨機亂數

  ```java
  public double data(double max,double min){
          double x=(int)(Math.random() * (max - min + 1) + min);
          return (int)x;
      }
  ```

* `actFunction.java`

  #### 激活函數

  * > <h4>Sigmoid

    公式: $y(x)=\frac{1}{1-E^{-net}}$

    ```java
    public static float Sigmoid(double net){
            double y=(float)1/(1+Math.pow(Math.E,-1*net));
            return (float) y;
        }
    ```

    

  * > <h4>ReLU

    公式: $$ f(n)= \begin{cases} 0 & \text for &\ x<0 \\ x & \text for &\ x \ge 0 \end{cases} $$

    ```java
    public static float ReLU(double net) {
            double y=(net>0)?net:0;
            return (float)y;
        }
    ```

    