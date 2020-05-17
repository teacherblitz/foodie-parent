# foodie-parent
### Java架构师直通车-INIT项目
|  表头   | 表头  |
|  ----  | ----  |
| 单元格  | 单元格 |
| 单元格  | 单元格 |

#### Swagger2访问路径
- Swagger2-UI：http://localhost/foodie-api/swagger-ui.html
- Swagger2-Bootstrap-UI：http://localhost/foodie-api/doc.html 

#### 部署工具Alibaba cloud toolkit
1. 项目右键->Alibaba Cloud->Deploy to Host
2. 选择Maven Build->选择Target Host
3. 填写部署目录：Target Directory
4. 填写执行命令：After Deploy
5. 添加如下两个mvn打包命令：
- 任务一、在父工程里执行"clean install"，
- 任务二、在需要发布的子模块里执行"clean package"


