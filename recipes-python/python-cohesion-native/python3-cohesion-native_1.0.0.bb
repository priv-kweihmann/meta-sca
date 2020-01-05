SUMMARY = "A tool for measuring Python class cohesion."
HOMEPAGE = "https://github.com/mschwager/cohesion"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI += "git://github.com/mschwager/cohesion.git;protocol=https;tag=${PV}"

S = "${WORKDIR}/git"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit native
inherit setuptools3

SRC_URI[md5sum] = "f927529cd1735f6f50ee2c61628e9c1f"
SRC_URI[sha256sum] = "05eed71e2e327246ad6b38c540c4a3117230b19679b875190486ddd2d721422d"
