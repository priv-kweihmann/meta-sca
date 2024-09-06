SUMMARY = "Dump readable YAML and load safely any YAML"
HOMEPAGE = "http://aboutcode.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "\
            python3-pyyaml-native \
            python3-setuptools-scm-native \
            "

PYPI_PACKAGE = "saneyaml"

SRC_URI[md5sum] = "0ab1ec694c2c004035d1d42c17ac47b0"
SRC_URI[sha256sum] = "19cfbd8bf94d730998162c790fe5cec9abb5300cc5890fe37dc6dbcaa8fb16bb"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-pyyaml"
