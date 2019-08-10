SUMMARY = "reStructuredText linter"

HOMEPAGE = "https://github.com/twolfson/restructuredtext-lint"
LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://UNLICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680"

PYPI_PACKAGE = "restructuredtext_lint"

DEPENDS += " \
            ${PYTHON_PN}-docutils-native \
           "

inherit pypi
inherit native
