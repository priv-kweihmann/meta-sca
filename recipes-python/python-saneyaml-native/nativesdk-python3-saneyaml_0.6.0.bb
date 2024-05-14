SUMMARY = "Dump readable YAML and load safely any YAML"
HOMEPAGE = "http://aboutcode.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "\
    nativesdk-python3-pyyaml \
    python3-setuptools-scm-native \
    python3-toml-native \
"

PYPI_PACKAGE = "saneyaml"

SRC_URI[md5sum] = "7369bae2778042790470462963c0c0a0"
SRC_URI[sha256sum] = "b2309f7836623cd6db932574ebbc43e3f65c743e7635179e64beecb0d1626e44"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-pyyaml"
