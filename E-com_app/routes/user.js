var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  let products=[
    {
      name:'IPHONE 11',
      category:'Mobile',
      discription:'This is a great phone made by Teve Jobs',
      image:'https://i0.wp.com/www.icareservice.in/wp-content/uploads/2020/04/iPhone-11-Back-Panel-Replacement-Yellow.jpg?fit=648%2C632&ssl=1'

    },
    {
      name:'Nothing 2A',
      category:'Mobile',
      discription:'This is a great phone made by Kim',
      image:'https://img-new.cgtrader.com/items/5138914/249964693d/large/nothing-phone-2a-3d-model-249964693d.jpg'

    },
    {
      name:'Galaxy s23 Ultra',
      category:'Mobile',
      discription:'This is a great phone made by Samsung',
      image:'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSFFNuKBPCb8vzXc9_Ym0_webVotDaAHiqyfg&s'

    },
    {
      name:'Red Magic',
      category:'Mobile',
      discription:'This is a great phone made by Red',
      image:'https://www.giztop.com/media/catalog/product/cache/dc206057cdd42d7e34b9d36e347785ca/r/e/red_magic_9_pro_01_3.jpg'

    },
  ]
  res.render('index', {products,admin:true,admin:false });
});

module.exports = router;
