SUMMARY = "configparser extension for systemd files"
DESCRIPTION = "configparser extension for systemd files"
HOMEPAGE = "https://github.com/sgallagher/systemdunitparser"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-2-Clause;md5=8bef8e6712b1be5aa76af1ebde9d6378"

PYPI_PACKAGE = "systemdunitparser"

inherit pypi

FILES_${PN} += "${datadir}/SystemdUnitParser"

inherit native
