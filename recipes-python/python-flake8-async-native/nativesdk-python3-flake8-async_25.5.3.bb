SUMMARY = "A flake8 plugin that checks bad async / asyncio practices"
HOMEPAGE = "https://github.com/python-trio/flake8-async"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=218979ab483d4a6d1512d8978a38ce7c"

DEPENDS += "\
    nativesdk-python3-flake8 \
    nativesdk-python3-libcst \
"

SRC_URI[sha256sum] = "fdbc70b40f6a4144beae399814e0e4ac3c034307384085c4729a1e44005904b7"

PYPI_PACKAGE = "flake8-async"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-polyfill \
    nativesdk-python3-libcst \
"
