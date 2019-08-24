#include <stdio.h>
#include <string.h>

int main()
{
	printf("Hello World\n");
	char *a[10] = {};
	char *b[10] = {};
	char c[250] = "";
	memcpy(&a, &a, sizeof(a) + 10);
	//memcpy(&b, &a, sizeof(a));
	//memset(&c, 'a', 255);
	if (c[-1] == 0) return 1;
	return 0;

	if (c[-1] == 0) return 1;
}