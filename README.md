{
	"info": {
		"_postman_id": "46aeccbb-8dd5-41e0-9d03-e0323463b3e5",
		"name": "test",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
	},
	"item": [
		{
			"name": "Get Request",
			"event": [
				{
					"listen": "test",
					"script": {
						"id": "13a4c321-ad9f-48df-a63d-b91010a4648c",
						"exec": [
							"pm.test(\"Status code is 200\", function () {",
							"    pm.response.to.have.status(200);",
							"});",
							"pm.test(\"Response time is less than 200\", function () {",
							"    pm.expect(pm.response.responseTime).to.be.below(200);",
							"});",
							"pm.test(\"Content-Type is present\", function () {",
							"    pm.response.to.have.header(\"Content-Type\");",
							"});",
							"pm.test(\"Status code name has string\", function () {",
							"    pm.response.to.have.status(\"OK\");",
							"});"
						],
						"type": "text/javascript"
					}
				}
			],
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [
					{
						"key": "Content-Type",
						"name": "Content-Type",
						"value": "application/json",
						"type": "text"
					}
				],
				"body": {
					"mode": "raw",
					"raw": ""
				},
				"url": {
					"raw": "https://jsonplaceholder.typicode.com/posts/",
					"protocol": "https",
					"host": [
						"jsonplaceholder",
						"typicode",
						"com"
					],
					"path": [
						"posts",
						""
					]
				}
			},
			"response": []
		},
		{
			"name": "Delete Particular ID Record Where ID=61",
			"event": [
				{
					"listen": "test",
					"script": {
						"id": "13a4c321-ad9f-48df-a63d-b91010a4648c",
						"exec": [
							"pm.test(\"Status code is 200\", function () {",
							"    pm.response.to.have.status(200);",
							"});",
							"pm.test(\"Response time is less than 200ms\", function () {",
							"    pm.expect(pm.response.responseTime).to.be.below(200);",
							"});",
							"pm.test(\"Content-Type is present\", function () {",
							"    pm.response.to.have.header(\"Content-Type\");",
							"});",
							"pm.test(\"Status code name has string\", function () {",
							"    pm.response.to.have.status(\"OK\");",
							"});"
						],
						"type": "text/javascript"
					}
				}
			],
			"request": {
				"method": "DELETE",
				"header": [
					{
						"key": "Content-Type",
						"name": "Content-Type",
						"type": "text",
						"value": "application/json"
					}
				],
				"body": {
					"mode": "raw",
					"raw": ""
				},
				"url": {
					"raw": "https://jsonplaceholder.typicode.com/posts/?id=61",
					"protocol": "https",
					"host": [
						"jsonplaceholder",
						"typicode",
						"com"
					],
					"path": [
						"posts",
						""
					],
					"query": [
						{
							"key": "id",
							"value": "61"
						},
						{
							"key": "",
							"value": "",
							"disabled": true
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "Get Request and find whether previous request deleted record exist",
			"event": [
				{
					"listen": "test",
					"script": {
						"id": "13a4c321-ad9f-48df-a63d-b91010a4648c",
						"exec": [
							"pm.test(\"Check JSON Response body is empty\", function() {\r",
							"var jsonData = JSON.parse(responseBody)\r",
							"pm.expect(jsonData.length).to.eql(undefined)\r",
							"})\r",
							"\r",
							""
						],
						"type": "text/javascript"
					}
				}
			],
			"protocolProfileBehavior": {
				"disableBodyPruning": true
			},
			"request": {
				"method": "GET",
				"header": [
					{
						"key": "Content-Type",
						"name": "Content-Type",
						"type": "text",
						"value": "application/json"
					}
				],
				"body": {
					"mode": "raw",
					"raw": ""
				},
				"url": {
					"raw": "https://jsonplaceholder.typicode.com/posts/?id=61",
					"protocol": "https",
					"host": [
						"jsonplaceholder",
						"typicode",
						"com"
					],
					"path": [
						"posts",
						""
					],
					"query": [
						{
							"key": "id",
							"value": "61"
						}
					]
				}
			},
			"response": []
		}
	]
}
