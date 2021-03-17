#include<iostream>
#include<iomanip>
using namespace std;
int main() {
    int cp1, quant1, cp2, quant2;
    double p1, p2, total;
    cin>>cp1>>quant1>>fixed>>setprecision(2)>>p1>>cp2>>quant2>>fixed>>setprecision(2)>>p2;
    total=quant1*p1+quant2*p2;
    cout<<"VALOR A PAGAR: R$ "<<fixed<<setprecision(2)<<total<<endl;
    return 0;
}
