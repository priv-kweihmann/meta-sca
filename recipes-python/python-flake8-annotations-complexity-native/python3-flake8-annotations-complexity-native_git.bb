SUMMARY = "flake8 plugin to validate annotations complexity"
HOMEPAGE = "https://github.com/best-doctor/flake8-annotations-complexity"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=352fd8fef192c98968c70971a80f959c"

SRC_URI = "git://github.com/best-doctor/flake8-annotations-complexity.git;protocol=https"
SRCREV = "3863739c34748db8fb5a740d903b8e243dfddb20"

UPSTREAM_CHECK_COMMITS = "1"

PV = "0.0.5+${SRCREV}"

S = "${WORKDIR}/git"

inherit native
inherit setuptools3
