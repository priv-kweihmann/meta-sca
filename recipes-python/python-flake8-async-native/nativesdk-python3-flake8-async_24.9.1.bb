SUMMARY = "A flake8 plugin that checks bad async / asyncio practices"
HOMEPAGE = "https://github.com/python-trio/flake8-async"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=218979ab483d4a6d1512d8978a38ce7c"

DEPENDS += "\
    nativesdk-python3-flake8 \
    nativesdk-python3-libcst \
"

SRC_URI[sha256sum] = "9e8a530587b7cefb2a804b52a3471afca4ff002a9805b49e056de7749b11f2a9"

PYPI_PACKAGE = "flake8_async"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-polyfill \
    nativesdk-python3-libcst \
"
