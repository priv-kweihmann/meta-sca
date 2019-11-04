SUMMARY = "Python AST read/write"

HOMEPAGE = "https://github.com/berkerpeksag/astor"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=561205fdabc3ec52cae2d30815b8ade7"

## To fix the issue with latest setuptools
SRC_URI += "file://bd697678674aafcf3f7b1c06af67df181ed584e2.patch"

PYPI_PACKAGE = "astor"

inherit pypi
inherit native
