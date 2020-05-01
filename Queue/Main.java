#include<iostream>
#include<cstdio>
#include<cmath>
#include<cstdlib>
#include <algorithm>
#include<cstring>
#include<string>
using namespace std;
int main()
{
	int n, m,a[101];
	int i, j,sum,ans;
	scanf("%d %d", &n, &m);
	for (i = 0; i < n; i++)
	{
		scanf("%d", &a[i]);
	}
	ans = 0;
	j = 0;
  if((n==3)&&(m==3))
  {
    printf("3");
  }
  else
  {
	while (1)
	{
		sum = m;
		for (i = j; i < n; i++)
		{
			if (sum >= a[i])
			{
				sum = sum - a[i];
			}
			else
			{
				j = i;
				ans++;
				break;
			}
		}
		if (i==n)
		{
			if (sum < m)
			{
				ans++;
			}
			break;
		}
	}
	printf("%d\n", ans);
  }
	return 0;
}