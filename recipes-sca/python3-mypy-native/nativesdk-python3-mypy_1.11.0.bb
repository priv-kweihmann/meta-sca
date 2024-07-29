SUMMARY = "Optional static typing for Python 3 and 2 (PEP 484)"
HOMEPAGE = "https://github.com/python/mypy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8d62fd8f8648cb018e52857347e340b9"

DEPENDS += "\
    nativesdk-python3-mypy-extensions \
    nativesdk-python3-typed-ast \
    nativesdk-python3-types-psutil \
    nativesdk-python3-types-setuptools \
    nativesdk-python3-typing-extensions \
    python3-tomli-native \
"

SRC_URI[md5sum] = "656a6e5c58e91a7eab4db97b7cc80baf"
SRC_URI[sha256sum] = "93743608c7348772fdc717af4aeee1997293a1ad04bc0ea6efa15bf65385c538"

PYPI_PACKAGE = "mypy"

inherit pypi

inherit sca-description
inherit python_setuptools_build_meta
inherit_defer nativesdk
SCA_TOOL_DESCRIPTION = "mypy"
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-crypt \
    nativesdk-python3-difflib \
    nativesdk-python3-io \
    nativesdk-python3-json \
    nativesdk-python3-multiprocessing \
    nativesdk-python3-mypy-extensions \
    nativesdk-python3-netclient \
    nativesdk-python3-pickle \
    nativesdk-python3-pytest \
    nativesdk-python3-shell \
    nativesdk-python3-stringold \
    nativesdk-python3-tests \
    nativesdk-python3-threading \
    nativesdk-python3-typed-ast \
    nativesdk-python3-types-psutil \
    nativesdk-python3-types-setuptools \
    nativesdk-python3-typing-extensions \
    nativesdk-python3-unittest \
"
