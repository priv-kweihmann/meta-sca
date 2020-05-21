SUMMARY = "flake8 plugin to validate expressions complexity"
HOMEPAGE = "https://github.com/best-doctor/flake8-expression-complexity"

LICENSE = "MIT"
# does currently ship no license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "\
            ${PYTHON_PN}-astpretty-native \
            ${PYTHON_PN}-flake8-native \
            "

PYPI_PACKAGE = "flake8_expression_complexity"

SRC_URI[md5sum] = "9316a9ba67859856ca3a1cc700f4c1c8"
SRC_URI[sha256sum] = "2378e0235a87c00b4ad7a9759dde1f9c71aebf344f53c9ffa0c2e2c4ee8cd142"

inherit pypi
inherit native
inherit setuptools3
