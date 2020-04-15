// Copyright (c) {{ year }} {{ organization }}
//
// This software is provided 'as-is', without any express or implied
// warranty. In no event will the authors be held liable for any damages
// arising from the use of this software.
//
// Permission is granted to anyone to use this software for any purpose,
// including commercial applications, and to alter it and redistribute it
// freely, subject to the following restrictions:
//
//    1. The origin of this software must not be misrepresented; you must not
//    claim that you wrote the original software. If you use this software
//    in a product, an acknowledgment in the product documentation would be
//    appreciated but is not required.
//
//    2. Altered source versions must be plainly marked as such, and must not be
//    misrepresented as being the original software.
//
//    3. This notice may not be removed or altered from any source
// distribution.

#include <stdio.h>
#include <string.h>

static char a[10] = "";

static char* foo(char *input) {
	strcpy(a, input);
	return a;
}

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
	foo(c);
}