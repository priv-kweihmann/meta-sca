SUMMARY = "Utility library to parse, normalize and compare License expressions"
HOMEPAGE = "https://github.com/nexB/license-expression"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0 & CC-BY-4.0"
LIC_FILES_CHKSUM = "\
    file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
    file://src/license_expression/data/cc-by-4.0.LICENSE;md5=c2b69cea79405efd14cca910fbc5c070 \
"

DEPENDS += "\
    python3-booleanpy-native \
    python3-setuptools-scm-native \
    python3-toml-native \
"

PYPI_PACKAGE = "license-expression"

SRC_URI[md5sum] = "030df78064748876ca852e8b5ac0d407"
SRC_URI[sha256sum] = "60d5bec1f3364c256a92b9a08583d7ea933c7aa272c8d36d04144a89a3858c01"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-booleanpy"
