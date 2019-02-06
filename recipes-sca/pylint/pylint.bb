SUMMARY = "pylint"
DESCRIPTION = "Static code analyser for python files"
HOMEPAGE = "https://github.com/PyCQA/pylint"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4325afd396febcb659c36b49533135d4"

PV = "2.2.2"

SRC_URI[md5sum] = "6bece9ce12a7461266ecc1908da8d492"
SRC_URI[sha256sum] = "689de29ae747642ab230c6d37be2b969bf75663176658851f456619aacf27492"

DEPENDS += "python3-native \
            pyisort-native \
            pyastroids-native \
            pytest-runner-native"

## A python file with /usr/bin/python-shebang is 
## used - ignore this error
INSANE_SKIP_${PN} += "file-rdeps"

PYPI_PACKAGE = "pylint"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/pylint"

BBCLASSEXTEND = "native nativesdk"
