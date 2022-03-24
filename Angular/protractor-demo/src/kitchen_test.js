describe('Kitchen Demo', function() {

    beforeEach(function() {
      browser.get('https://kitchen.applitools.com/ingredients/select');
    });
  
    it('should select garlic', function() {
        element(by.id('spices-select-single')).click();
        element(by.css("#spices-select-single [value='garlic']")).click();

        expect(element(by.id('spices-select-single')).getAttribute('value')).toEqual('garlic');
    });

});