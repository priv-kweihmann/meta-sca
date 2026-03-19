SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://pypi.org/project/importlib-metadata/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=affe5a7d8b988c3db245c01075b29e17"

DEPENDS += "\
    python3-coherent-licensed-native \
    python3-setuptools-scm-native \
"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

PYPI_PACKAGE = "importlib_metadata"

SRC_URI[sha256sum] = "d4ae075d546a9c2db36f0ba957f15f9443c9604e57d0785701621cb7ea2ec5d7"

S = "${UNPACKDIR}/importlib_metadata-${PV}"

RDEPENDS:${PN} += "python3-zipp-native"
