SUMMARY = "NPM: eslint-plugin-promise"
DESCRIPTION = "Enforce best practices for JavaScript promises"
HOMEPAGE = "https://github.com/xjamundx/eslint-plugin-promise"
DEFAULT_PREFERENCE = "-1"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9220254d90f57d6eccbffc30086e0540"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-plugin-promise/-/eslint-plugin-promise-6.0.0.tgz"
SRC_URI[md5sum] = "f5b8c0fe01975d94a1b49d99da80266a"
SRC_URI[sha256sum] = "5168392e1a6b3058c3083a437c804a262e3ca0283c5bc56647e920dd3c8e05e1"

NPM_PKGNAME = "eslint-plugin-promise"

inherit npmhelper
inherit native
