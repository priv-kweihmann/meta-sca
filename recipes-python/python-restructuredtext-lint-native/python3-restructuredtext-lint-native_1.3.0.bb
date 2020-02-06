SUMMARY = "reStructuredText linter"
HOMEPAGE = "https://github.com/twolfson/restructuredtext-lint"

LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://UNLICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680"

PYPI_PACKAGE = "restructuredtext_lint"

UPSTREAM_CHECK_REGEX ?= "/restructuredtext-lint/(?P<pver>(\d+[\.\-_]*)+)"

DEPENDS += "\
            ${PYTHON_PN}-docutils-native \
           "

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "0f90ef86ca94b1389eccf5faccaebef4"
SRC_URI[sha256sum] = "97b3da356d5b3a8514d8f1f9098febd8b41463bed6a1d9f126cf0a048b6fd908"
