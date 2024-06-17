const express = require('express');
const router = express.Router();
const productHelpers = require('../helpers/product-helpers');

router.get('/', async (req, res, next) => {
  try {
    let products = await productHelpers.getAllProducts();
    res.render('admin/view-products', { admin: true, products });
  } catch (err) {
    console.error('Error fetching products:', err);
    res.status(500).send('Error fetching products.');
  }
});

router.get('/add-product', (req, res) => {
  res.render('admin/add-product');
});

router.post('/add-product', async (req, res) => {
  
  try {
    console.log(req.body);

    // Check if files are uploaded
    if (!req.files || !req.files.Image) {
      console.log('No file uploaded');
      return res.status(400).send('No file uploaded.');
    }

    let image = req.files.Image;
    console.log('File uploaded:', image);

    productHelpers.addProduct(req.body, (err, id) => {
      if (err) {
        console.error('Error adding product:', err);
        return res.status(500).send('Error adding product.');
      }

      let imagePath = `./public/product-images/${id}.jpg`;
      image.mv(imagePath, (err) => {
        if (err) {
          console.error('File move error:', err);
          return res.status(500).send(err);
        }
        res.redirect('/admin');
      });
    });
  } catch (err) {
    console.error('Error:', err);
    res.status(500).send('Server error.');
  }
});

module.exports = router;
