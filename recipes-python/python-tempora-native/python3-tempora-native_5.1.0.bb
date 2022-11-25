SUMMARY = "Objects and routines pertaining to date and time"
HOMEPAGE = "https://github.com/jaraco/tempora"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "\
	         python3-jaraco-functools-native \
             python3-pytz-native \
             python3-setuptools-scm-native \
             python3-toml-native \
             python3-wheel-native \
            "

PYPI_PACKAGE = "tempora"

SRC_URI[md5sum] = "f9954a8c3b091f9769eb7bbe0faddccf"
SRC_URI[sha256sum] = "3e7c4a5369a1788c88a99b6be3a4c74c0c7728d3b62fd768a7e81bd0be0e88df"

inherit pypi
inherit python_setuptools_build_meta
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-jaraco-functools \
    nativesdk-python3-pytz \
"
