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

SRC_URI[md5sum] = "38409caf9f14a194b35d1b6275a4125a"
SRC_URI[sha256sum] = "2c91a55601077a555dcd3e5998063773585b323b63fec654e2b674867f3e0040"

UPSTREAM_CHECK_REGEX = "project/flake8-expression-complexity/(?P<pver>(\d+[\.]*)+)"

inherit pypi
inherit setuptools3
inherit native
