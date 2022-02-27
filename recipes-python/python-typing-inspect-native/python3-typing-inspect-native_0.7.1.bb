SUMMARY = "Runtime inspection utilities for typing module"
HOMEPAGE = "https://github.com/ilevkivskyi/typing_inspect"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=38939e40df14ccacab135b023198167a"

DEPENDS += "\
    python3-mypy-extensions-native \
    python3-typing-extensions-native \
"

PYPI_PACKAGE = "typing_inspect"

UPSTREAM_CHECK_REGEX ?= "/typing-inspect/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "1444feceb8213bd94cfece3c6d4ffc5c"
SRC_URI[sha256sum] = "047d4097d9b17f46531bf6f014356111a1b6fb821a24fe7ac909853ca2a782aa"

inherit pypi
inherit setuptools3
inherit native
