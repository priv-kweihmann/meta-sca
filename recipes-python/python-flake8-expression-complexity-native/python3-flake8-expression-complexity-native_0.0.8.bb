SUMMARY = "flake8 plugin to validate expressions complexity"
HOMEPAGE = "https://github.com/best-doctor/flake8-expression-complexity"

LICENSE = "MIT"
# does currently ship no license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "\
            python3-astpretty-native \
            python3-flake8-native \
            "

PYPI_PACKAGE = "flake8_expression_complexity"

SRC_URI[md5sum] = "3f4639c3e50391658ef33e30ed9ee579"
SRC_URI[sha256sum] = "c23f8ae677eb13b073be9bafa2cf443a87d3e2594817ba82c1f3e184e2de4afa"

UPSTREAM_CHECK_REGEX = "project/flake8-expression-complexity/(?P<pver>(\d+[\.]*)+)"

inherit pypi
inherit native
inherit setuptools3
