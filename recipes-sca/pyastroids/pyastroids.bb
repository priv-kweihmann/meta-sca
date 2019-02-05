SUMMARY = "astroids"
DESCRIPTION = "Common representation framework of pythoncode for static code analysis checkers"
HOMEPAGE = "https://github.com/PyCQA/astroid"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

PV = "1.6.0"

SRC_URI[md5sum] = "6f8f60b316218455726958f08c6e17f1"
SRC_URI[sha256sum] = "71dadba2110008e2c03f9fde662ddd2053db3c0489d0e03c94e828a0399edd4f"

RDEPENDS_${PN} += "python3-native"
RDEPENDS_${PN} += "python3-native \
                   pywrapt-native \
                   pylazy-object-proxy-native \
                   pysix-native"
DEPENDS += "python3-native \
            pywrapt-native \
            pylazy-object-proxy-native \
            pysix-native"

PYPI_PACKAGE = "astroid"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/astroid"

BBCLASSEXTEND = "native nativesdk"
