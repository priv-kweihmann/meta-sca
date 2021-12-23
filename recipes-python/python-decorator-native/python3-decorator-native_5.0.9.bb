SUMMARY = "Better living through Python with decorators"
HOMEPAGE = "https://github.com/micheles/decorator"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=be2fd2007972bf96c08af3293d728b22"

PYPI_PACKAGE = "decorator"

SRC_URI[md5sum] = "a90526e45e7a30cf2710d6467f403e03"
SRC_URI[sha256sum] = "72ecfba4320a893c53f9706bebb2d55c270c1e51a28789361aa93e4a21319ed5"

inherit pypi
inherit setuptools3
inherit native
