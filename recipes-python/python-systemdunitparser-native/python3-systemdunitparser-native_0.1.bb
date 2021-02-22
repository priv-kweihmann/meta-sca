SUMMARY = "configparser extension for systemd files"
HOMEPAGE = "https://github.com/sgallagher/systemdunitparser"

LICENSE = "GPL-3.0"
## This modules doesn't offer an explicit license file
## Info taken from pypi-PKGINFO
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-3.0-only;md5=c79ff39f19dfec6d293b95dea7b07891"

PYPI_PACKAGE = "systemdunitparser"

SRC_URI[md5sum] = "211799b0229cb36c316cef26856dbabe"
SRC_URI[sha256sum] = "f85f1362abd18778a74605955fc83cbe62e695cf02ac80211c9b010377df2823"

inherit pypi
inherit setuptools3
inherit native
