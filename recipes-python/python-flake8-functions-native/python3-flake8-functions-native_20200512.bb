SUMMARY = "flake8 plugin for validation of function parameters (length, complexity, etc)"
HOMEPAGE = "https://github.com/best-doctor/flake8-functions"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=352fd8fef192c98968c70971a80f959c"

DEPENDS += "\
            python3-flake8-native \
            python3-pytest-native \
            python3-setuptools-native \
            "
SRC_URI += "git://github.com/best-doctor/flake8-functions.git;protocol=https"
SRCREV = "567b922d4fecf92fb6680669c08b861e178ba689"

UPSTREAM_CHECK_COMMITS = "1"
S = "${WORKDIR}/git"

inherit setuptools3
inherit native
