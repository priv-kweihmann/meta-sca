SUMMARY = "A tool for measuring Python class cohesion."
HOMEPAGE = "https://github.com/mschwager/cohesion"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=84dcc94da3adb52b53ae4fa38fe49e5d"

SRC_URI += "git://github.com/mschwager/cohesion.git;protocol=https;tag=${PV}"

S = "${WORKDIR}/git"

DEPENDS += "${PYTHON_PN}-flake8-native"

inherit native
