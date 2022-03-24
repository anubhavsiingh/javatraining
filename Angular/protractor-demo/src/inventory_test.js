describe('Inventory Rest Consumer', function() {
 
    it('should have a title', function() {
      browser.get('http://localhost:4200/home');
      expect(browser.getTitle()).toEqual('Inventory Rest Consumer');
    });
  });