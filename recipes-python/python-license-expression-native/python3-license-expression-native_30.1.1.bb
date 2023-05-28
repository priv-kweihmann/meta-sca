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

SRC_URI[md5sum] = "4068ad06ea4256f846c18ea77729b55c"
SRC_URI[sha256sum] = "42375df653ad85e6f5b4b0385138b2dbea1f5d66360783d8625c3e4f97f11f0c"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-booleanpy"
