SUMMARY = "flake8 plugin to validate expressions complexity"
HOMEPAGE = "https://github.com/best-doctor/flake8-expression-complexity"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
# does currently ship no license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "\
            python3-astpretty-native \
            python3-flake8-native \
            "

PYPI_PACKAGE = "flake8_expression_complexity"

SRC_URI[md5sum] = "f621be803c47473db0f1cfc0bd6599fe"
SRC_URI[sha256sum] = "4dd8909fecbc20f53814cdcef9d0b04f61532764278d9b6e8026686812e96631"

UPSTREAM_CHECK_REGEX = "project/flake8-expression-complexity/(?P<pver>(\d+[\.]*)+)"

inherit pypi
inherit setuptools3
inherit native
