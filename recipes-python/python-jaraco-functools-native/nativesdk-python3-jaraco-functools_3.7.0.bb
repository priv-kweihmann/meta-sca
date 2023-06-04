SUMMARY = "Additional functools in the spirit of stdlib’s functools"
HOMEPAGE = "https://github.com/jaraco/jaraco.functools"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=141643e11c48898150daa83802dbc65f"

DEPENDS += "\
    nativesdk-python3-more-itertools \
    python3-setuptools-scm-native \
    python3-toml-native \
    python3-wheel-native \
"

PYPI_PACKAGE = "jaraco.functools"

SRC_URI[md5sum] = "2488bcb8d88dcc3a35a784de40b2c796"
SRC_URI[sha256sum] = "685dc06075696697edc9c4ef89af33f0fd2570a6ff57767332dbf4165e5ffbb3"

inherit pypi
inherit python_setuptools_build_meta
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-more-itertools"
