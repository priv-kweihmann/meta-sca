SUMMARY = "Simple Python style checker in one Python file"
HOMEPAGE = "https://github.com/PyCQA/pycodestyle"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4e21c6f4c612498422aedaf3dd409de0"

DEPENDS += "\
    nativesdk-python3-mccabe \
    nativesdk-python3-pycodestyle \
    nativesdk-python3-pydocstyle \
    nativesdk-python3-pyflakes \
"

PYPI_PACKAGE = "pylama"

SRC_URI[md5sum] = "d0a18c372133aa77f73382d691fa51c8"
SRC_URI[sha256sum] = "2dd852fe9312ea6012466cf17ff179668fc3d2716856fcfaaee8ce7876d83620"

inherit pypi
inherit setuptools3
inherit nativesdk

do_install:append() {
    ## This otherwise collides with other modules
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests/
}

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-asyncio \
    nativesdk-python3-core \
    nativesdk-python3-eradicate \
    nativesdk-python3-io \
    nativesdk-python3-logging \
    nativesdk-python3-mccabe \
    nativesdk-python3-pip \
    nativesdk-python3-pycodestyle \
    nativesdk-python3-pydocstyle \
    nativesdk-python3-pyflakes \
"
