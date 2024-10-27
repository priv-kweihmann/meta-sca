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
SRC_URI[sha256sum] = "d46d457a85337051c36524bc5349dd91b1877838e2979ac5ced3e710ed8a60ed"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-datetime \
    nativesdk-python3-stringold \
"
