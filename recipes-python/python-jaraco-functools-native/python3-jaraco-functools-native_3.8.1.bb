SUMMARY = "Additional functools in the spirit of stdlib’s functools"
HOMEPAGE = "https://github.com/jaraco/jaraco.functools"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=141643e11c48898150daa83802dbc65f"

DEPENDS += "\
            python3-more-itertools-native \
            python3-setuptools-scm-native \
            python3-toml-native \
            python3-wheel-native \
           "

PYPI_PACKAGE = "jaraco.functools"

SRC_URI[md5sum] = "c57167c6b7398d8934b813a206a82687"
SRC_URI[sha256sum] = "e96a0d4ea455005a4092ce89a69ea0f7fb7e22807ad3b1008f9bf70c48d1cf2e"

inherit pypi
inherit python_setuptools_build_meta
inherit native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-more-itertools"
