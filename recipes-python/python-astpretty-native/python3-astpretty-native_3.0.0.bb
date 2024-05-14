SUMMARY = "Pretty print the output of python stdlib ast.parse"
HOMEPAGE = "https://github.com/asottile/astpretty"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5fd324061c581b8d45b8cb18c560a543"

SRC_URI[md5sum] = "6af044f722f2f23de86d927e5ddf09ba"
SRC_URI[sha256sum] = "b08c95f32e5994454ea99882ff3c4a0afc8254c38998a0ed4b479dba448dc581"

PYPI_PACKAGE = "astpretty"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
"
