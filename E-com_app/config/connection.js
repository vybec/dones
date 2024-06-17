const MongoClient = require('mongodb').MongoClient;
const state = {
  db: null
};

module.exports.connect = (url, done) => {
  if (state.db) return done();

  MongoClient.connect(url, (err, client) => {
    if (err) return done(err);
    state.db = client.db('your-database-name'); // replace 'your-database-name' with your actual database name
    done();
  });
};

module.exports.get = () => {
  return state.db;
};
