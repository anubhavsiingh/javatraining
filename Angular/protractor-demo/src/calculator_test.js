describe('Protractor Demo App', function() {
    var firstNumber = element(by.model('first'));
    var secondNumber = element(by.model('second'));
    var goButton = element(by.id('gobutton'));
    var latestResult = element(by.binding('latest'));
  
    beforeEach(function() {
      browser.get('http://juliemr.github.io/protractor-demo/');
    });
  
    it('should have a title', function() {
      expect(browser.getTitle()).toEqual('Super Calculator');
    });

    it('should add one and two', function() {
        firstNumber.sendKeys(1);
        secondNumber.sendKeys(2);
    
        goButton.click();
    
        expect(latestResult.getText()).toEqual('3');
      });

      it('should multiply 5 and 6', function() {
        firstNumber.sendKeys(5);
        secondNumber.sendKeys(6);
        element(by.model('operator')).sendKeys('*');        //to change the default opeartor '+' to multiply
        goButton.click();
    
        expect(latestResult.getText()).toEqual('30');
      });

});