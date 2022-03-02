SUMMARY = "configparser extension for systemd files"
HOMEPAGE = "https://github.com/sgallagher/systemdunitparser"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0"
## This modules doesn't offer an explicit license file
## Info taken from pypi-PKGINFO
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0-only;md5=c79ff39f19dfec6d293b95dea7b07891"

PYPI_PACKAGE = "systemdunitparser"

SRC_URI[md5sum] = "4bb9d1a8495ef5024bde1ab1785c14e4"
SRC_URI[sha256sum] = "1a072a4e55fc5573823e0a910497164db96d9e16648b0f540d546cd5591de90e"

inherit pypi
inherit setuptools3
inherit native
