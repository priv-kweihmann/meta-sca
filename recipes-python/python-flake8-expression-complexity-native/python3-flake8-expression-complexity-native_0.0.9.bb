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

SRC_URI[md5sum] = "62119dc798619577b867b48793edcf28"
SRC_URI[sha256sum] = "1ae325880a5dbfef60a35eaa8bb5351d5c5102774a41d4ed7059bc093a95955b"

UPSTREAM_CHECK_REGEX = "project/flake8-expression-complexity/(?P<pver>(\d+[\.]*)+)"

inherit pypi
inherit setuptools3
inherit native
