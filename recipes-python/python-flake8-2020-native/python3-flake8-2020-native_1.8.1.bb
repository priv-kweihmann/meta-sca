SUMMARY = "flake8 plugin which checks for misuse of `sys.version` or `sys.version_info`"
HOMEPAGE = "https://github.com/asottile/flake8-2020"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c0d8485a6f9c059042248e7a6b38e15c"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8_2020"

UPSTREAM_CHECK_REGEX ?= "/flake8-2020/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "2898bfc6977ff7b71cad5fed49bd531f"
SRC_URI[sha256sum] = "094ea95e8b614c3bd123fd4f007be28ec117ca57a6169903d4baaabe78e3e590"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
