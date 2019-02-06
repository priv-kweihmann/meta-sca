SUMMARY = "astroids"
DESCRIPTION = "Common representation framework of pythoncode for static code analysis checkers"
HOMEPAGE = "https://github.com/PyCQA/astroid"
LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

PV = "2.1.0"

SRC_URI[md5sum] = "09277b4400fc18a22d4bfc45b50c4448"
SRC_URI[sha256sum] = "35b032003d6a863f5dcd7ec11abd5cd5893428beaa31ab164982403bcb311f22"

DEPENDS += "python3-native \
            pywrapt-native \
            pytest-runner-native \
            pylazy-object-proxy-native \
            pysix-native"

PYPI_PACKAGE = "astroid"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/astroid"

BBCLASSEXTEND = "native nativesdk"
