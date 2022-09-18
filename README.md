# Diagram
![microservices diagram drawio](https://user-images.githubusercontent.com/73538696/190912771-2499c278-e8a4-4fae-b2be-411790c8c818.png)
---
# Topics covered in this repo:
- Rest endpoints
- Mysql db connection
- Unit testing
- Eureka
- API Gateway
- Zipkin
---
### Example
##### GET Request:
```
http://localhost:9092/sales/orderItems/7/2
```
#### Response:
```json
{
    "orderItems": {
        "order_id": 7,
        "item_id": 2,
        "product_id": 3,
        "quantity": 1,
        "list_price": 999.99,
        "discount": 0.1
    },
    "products": {
        "product_id": 3,
        "product_name": "Surly Wednesday Frameset - 2016",
        "brand_id": 8,
        "category_id": 6,
        "model_year": 2016,
        "list_price": 999.99
    }
}
```
---
