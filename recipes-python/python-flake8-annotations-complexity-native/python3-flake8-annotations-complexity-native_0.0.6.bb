SUMMARY = "flake8 plugin to validate annotations complexity"
HOMEPAGE = "https://github.com/best-doctor/flake8-annotations-complexity"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=352fd8fef192c98968c70971a80f959c"

SRC_URI = "git://github.com/best-doctor/flake8-annotations-complexity.git;protocol=https"
SRCREV = "b678cafb3ac7471163fad5b11eb1bdc4880c5c74"

UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit native
inherit setuptools3
