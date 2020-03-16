SUMMARY = "flake8 plugin to validate annotations complexity"
HOMEPAGE = "https://github.com/best-doctor/flake8-annotations-complexity"

SRC_URI = "git://github.com/best-doctor/flake8-annotations-complexity.git;protocol=https;tag=v${PV}"

S = "${WORKDIR}/git"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=352fd8fef192c98968c70971a80f959c"

inherit native
inherit setuptools3
