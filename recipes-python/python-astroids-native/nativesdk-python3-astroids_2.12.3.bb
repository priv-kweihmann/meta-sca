SUMMARY = "A common base representation of python source code for pylint and other projects"
HOMEPAGE = "https://github.com/PyCQA/astroid"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a70cf540abf41acb644ac3b621b2fad1"

DEPENDS += "\
    nativesdk-python3 \
    nativesdk-python3-pylazy-object-proxy \
    nativesdk-python3-typed-ast \
    nativesdk-python3-typing-extensions \
    nativesdk-python3-wrapt \
    python3-pytest-runner-native \
"

PYPI_PACKAGE = "astroid"

SRC_URI[md5sum] = "7f53fff5db46fd3a6a255c020770b637"
SRC_URI[sha256sum] = "937a0229b5c078ca0bb69bdae7f00f95ba5bdee7ba38d9c7fcef92c5ce935f92"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-math \
    nativesdk-python3-misc \
    nativesdk-python3-pprint \
    nativesdk-python3-pylazy-object-proxy \
    nativesdk-python3-pytest \
    nativesdk-python3-typed-ast \
    nativesdk-python3-typing-extensions \
    nativesdk-python3-wrapt \
"
