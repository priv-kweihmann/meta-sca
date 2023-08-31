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

SRC_URI[md5sum] = "b120bcccd1d83ee2fc15a02a3e4151a8"
SRC_URI[sha256sum] = "8b137b0feacc17fef4bacee04c011c9e86f2341099c870a1d12d3be37b32a638"

inherit pypi
inherit python_setuptools_build_meta
inherit native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-more-itertools"
