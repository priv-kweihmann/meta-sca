SUMMARY = "Additional functools in the spirit of stdlib’s functools"
HOMEPAGE = "https://github.com/jaraco/jaraco.functools"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=141643e11c48898150daa83802dbc65f"

DEPENDS += "\
            python3-more-itertools-native \
            python3-setuptools-scm-native \
            python3-wheel-native \
           "

PYPI_PACKAGE = "jaraco_functools"
UPSTREAM_CHECK_REGEX ?= "/jaraco.functools/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "b8a8d165da986efa1966abd91c45348e"
SRC_URI[sha256sum] = "70f7e0e2ae076498e212562325e805204fc092d7b4c17e0e86c959e249701a9d"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-more-itertools"
