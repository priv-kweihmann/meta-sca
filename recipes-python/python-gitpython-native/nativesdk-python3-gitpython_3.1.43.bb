SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5279a7ab369ba336989dcf2a107e5c8e"

DEPENDS += "nativesdk-python3-gitdb"

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "350a6dd0d1d560e0af82733592e8dbb3"
SRC_URI[sha256sum] = "35f314a9f878467f5453cc1fee295c3e18e52f1b99f10f6cf5b1682e968a9e7c"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer nativesdk

PYPI_PACKAGE_OLD_LOWER = "${@d.getVar('PYPI_PACKAGE_OLD').lower()}"
PYPI_DOWNLOADNAME = "${PYPI_ARCHIVE_NAME_PREFIX}${PYPI_PACKAGE}-${PV}.${PYPI_PACKAGE_EXT}"
PYPI_SRC_URI = "https://files.pythonhosted.org/packages/source/g/${PYPI_PACKAGE_OLD_LOWER}/${PYPI_PACKAGE}-${PV}.${PYPI_PACKAGE_EXT};downloadfilename=${PYPI_DOWNLOADNAME}"
S = "${WORKDIR}/${PYPI_PACKAGE}-${PV}"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-datetime \
    nativesdk-python3-gitdb \
    nativesdk-python3-io \
    nativesdk-python3-logging \
    nativesdk-python3-mmap \
    nativesdk-python3-netclient \
    nativesdk-python3-shell \
    nativesdk-python3-stringold \
    nativesdk-python3-tests \
    nativesdk-python3-unixadmin \
"
