SUMMARY = "flake8 plugin which checks for misuse of `sys.version` or `sys.version_info`"
HOMEPAGE = "https://github.com/asottile/flake8-2020"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c0d8485a6f9c059042248e7a6b38e15c"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8_2020"

UPSTREAM_CHECK_REGEX ?= "/flake8-2020/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "d8a51626d1b1f50da5355f163302d618"
SRC_URI[sha256sum] = "f5312b3634266bd0f1957f64ecabeb62d67bbd9cee637e33a2651a80091f90aa"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
