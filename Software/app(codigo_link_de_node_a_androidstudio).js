const express = require("express")
const app= express()
const mongoClient = require("mongodb").MongoClient

const url = "mongodb://localhost:27017

app.use(express.json())

mongoClient.connect(url, (err, db) => {
    if (err){
        console.log("Error while connecting mongo client")
    }else {
        const myDb = db.db("myDb")
        const collection = myDb.collection("myTable")

        app.post("/nuevousuario", (req,res) => {
            const newUser = {
            name: req.body.name,
            edadgest: req.body.edadgest
            fechanac:req.body.fechanac
            hora:req.body.hora
            }
            const query ={name: newUser.name}
            collection.findOne(query,(err,result)=>{
            if (result == null){
                collection.insertOne(newUser,(err,result)=>{
                    res.status(200).send()
                })
            }else {
                res.status(400).send()
            }
        })
        }
    }

})

app.listen(3000, () =>{
    console.log("Listening on port 3000...")}
})
