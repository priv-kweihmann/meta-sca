SUMMARY = "flake8 plugin to validate annotations complexity"
HOMEPAGE = "https://github.com/best-doctor/flake8-annotations-complexity"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=352fd8fef192c98968c70971a80f959c"

PV = "0.0.6+${SRCREV}"

SRC_URI = "git://github.com/best-doctor/flake8-annotations-complexity.git;branch=master;protocol=https"
SRCREV = "e8c51b6fae2a4f911aa05c2bc45fbea1f633fc96"

UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"
PYPA_WHEEL = "${PIP_INSTALL_DIST_PATH}/flake8_annotations_complexity-0.0.6-*.whl"

inherit setuptools3
inherit native
