SUMMARY = "Simple Python style checker in one Python file"
HOMEPAGE = "https://github.com/PyCQA/pycodestyle"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4e21c6f4c612498422aedaf3dd409de0"

DEPENDS += "\
            python3-mccabe-native \
            python3-pycodestyle-native \
            python3-pydocstyle-native \
            python3-pyflakes-native \
            "

PYPI_PACKAGE = "pylama"

SRC_URI[md5sum] = "a722c874571acb580f3faa0b4a04e6bb"
SRC_URI[sha256sum] = "2d4f7aecfb5b7466216d48610c7d6bad1c3990c29cdd392ad08259b161e486f6"

inherit pypi
inherit setuptools3
inherit_defer native

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
