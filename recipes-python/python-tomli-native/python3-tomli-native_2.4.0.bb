SUMMARY = "A lil' TOML parser"
HOMEPAGE = "https://github.com/hukkin/tomli"
BUGTRACKER = "https://github.com/hukkin/tomli/issues"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aaaaf0879d17df0110d1aa8c8c9f46f5"

inherit pypi
inherit python_flit_core
inherit_defer native

PYPI_PACKAGE = "tomli"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
SRC_URI[sha256sum] = "aa89c3f6c277dd275d8e243ad24f3b5e701491a860d5121f2cdd399fbb31fc9c"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-datetime \
    nativesdk-python3-stringold \
"
