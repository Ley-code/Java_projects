#include <iostream>
using namespace std;
int main(){
    int num;
    string unit,unit2,unit3;
    float magnitude,magnitude2,magnitude3;
    cout << "Pgage calculator" << endl;
    cout << "------------------" << endl;
    cout << "Number of knowns: ";
    cin >> num;
    cout << "write the givens" << endl;
    if(num == 2){
        cin >> unit;
        cin >> magnitude;
        cin >> unit2;
        cin >> magnitude2;
        if(unit == "patm"){
            float pgage = magnitude2 - magnitude;
            cout << "pgage = " <<pgage; 
        }
    } else if(num==3){
        cin >> unit;
        cin >> magnitude;
        cin >> unit2;
        cin >> magnitude2;
        cin >> unit3;
        cin >> magnitude3;
        cout << "page = " << (magnitude2*magnitude*magnitude3);
        
    } else {
        cout << "cannot calculate";
    }
}