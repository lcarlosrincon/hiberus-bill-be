![](https://nonstoplearningbydoing.files.wordpress.com/2016/12/spring-boot-docker1.png?w=200)
# hiberus-bill-be
You can find the restfull api fundamentals over this framework and working on any feature of the spring's power

### Build and run
On your root code execute:

*mvn clean install*

*docker build -t lcarlosrincon/hiberus-bill .*

*docker run --name bill -p 8010:8010 lcarlosrincon/hiberus-bill*

On your navigator put: http://localhost:8010/bill