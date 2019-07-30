SUMMARY = "configparser extension for systemd files"
DESCRIPTION = "configparser extension for systemd files"
HOMEPAGE = "https://github.com/sgallagher/systemdunitparser"
LICENSE = "GPL-3.0"
## This modules doesn't offer an explicit license file
## Info taken from pypi-PKGINFO
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0;md5=c79ff39f19dfec6d293b95dea7b07891"

PYPI_PACKAGE = "systemdunitparser"

inherit pypi

FILES_${PN} += "${datadir}/SystemdUnitParser"

inherit native
