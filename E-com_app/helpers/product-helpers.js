const db = require('../config/connection');
const collection = require('../config/collections'); // Assuming collections.js exports your collection names

module.exports = {
  addProduct: (product, callback) => {
    const database = db.get();
    if (!database) {
      return callback(new Error('Database not initialized'));
    }
    database.collection(collection.PRODUCT_COLLECTION).insertOne(product, (err, result) => {
      if (err) {
        return callback(err);
      }
      callback(null, result.insertedId);
    });
  }
};
