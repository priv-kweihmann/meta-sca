SUMMARY = "Implements boolean algebra in one module"
HOMEPAGE = "https://github.com/bastikr/boolean.py"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d118b5feceee598ebeca76e13395c2bd"

PYPI_PACKAGE = "boolean.py"

SRC_URI[md5sum] = "1a7ec75805094c91980b9f11240853c0"
SRC_URI[sha256sum] = "60cbc4bad079753721d32649545505362c754e121570ada4658b852a3a318d95"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native
