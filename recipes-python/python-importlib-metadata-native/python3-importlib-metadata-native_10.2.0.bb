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

SRC_URI[sha256sum] = "9413a2029fd9ca5669d27f1386071bbfe3c7ebca0545692ec975088241fe1d79"

S = "${UNPACKDIR}/importlib_metadata-${PV}"

RDEPENDS:${PN} += "python3-zipp-native"
