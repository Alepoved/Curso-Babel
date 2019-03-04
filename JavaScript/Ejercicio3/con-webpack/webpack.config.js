const path = require ("path");

module.exports = {
    entry: path.join(__dirname,"app.js"),//archivo donde empieza la aplicacion
    output: {
        path: path.join(__dirname,"dist"),//creacion de carpeta
        filename: "bundle.js"
    },
    module: {
        rules: [{
            test: /\.js$/ ,
            exclude: /node_modules/,
            loader: "babel-loader"
        }]
    },
    devServer: {
        contentBase: path.join(__dirname,"dist")
    },
    resolve: {
        extensions: [".js",".es6"]
    }
}