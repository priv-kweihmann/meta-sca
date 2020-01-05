SUMMARY = "Python AST read/write"

HOMEPAGE = "https://github.com/berkerpeksag/astor"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=561205fdabc3ec52cae2d30815b8ade7"

## To fix the issue with latest setuptools
SRC_URI += "file://bd697678674aafcf3f7b1c06af67df181ed584e2.patch"

SRC_URI[md5sum] = "f98f2412a0bd713dfac0de8ada370df0"
SRC_URI[sha256sum] = "37a6eed8b371f1228db08234ed7f6cfdc7817a3ed3824797e20cbb11dc2a7862"

PYPI_PACKAGE = "astor"

inherit pypi
inherit native
inherit setuptools3
