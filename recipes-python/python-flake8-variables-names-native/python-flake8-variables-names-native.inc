SUMMARY = "A flake8 extension that helps to make more readable variables names"

HOMEPAGE = "https://github.com/best-doctor/flake8-variables-names"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE;md5=48ef0979a2bcc3fae14ff30b8a7f5dbf"

SRC_URI += "https://raw.githubusercontent.com/best-doctor/flake8-variables-names/v${PV}/LICENSE;name=lic"

SRC_URI[lic.md5sum] = "48ef0979a2bcc3fae14ff30b8a7f5dbf"
SRC_URI[lic.sha256sum] = "c696614021eafe355c7fb0af3e724fc7fa8729a0c10c27cbed2505bf30a853ce"

PYPI_PACKAGE = "flake8_variables_names"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit pypi
inherit native
