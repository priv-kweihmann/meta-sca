SUMMARY = "Debian package related modules"
HOMEPAGE = "https://salsa.debian.org/python-debian-team/python-debian"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0+"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

DEPENDS += "\
            python3-chardet-native \
            python3-six-native \
           "

PYPI_PACKAGE = "python-debian"

SRC_URI[md5sum] = "e35d00e46c2882f340f2a009b6272f14"
SRC_URI[sha256sum] = "a794f4c4ee2318ae7260c2e32dac252b833bdaf6686efc2a1afbc6ecf3f0931f"

inherit pypi
inherit setuptools3
inherit native
