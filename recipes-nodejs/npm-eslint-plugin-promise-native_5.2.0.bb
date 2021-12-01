SUMMARY = "NPM: eslint-plugin-promise"
DESCRIPTION = "Enforce best practices for JavaScript promises"
HOMEPAGE = "https://github.com/xjamundx/eslint-plugin-promise"
DEFAULT_PREFERENCE = "-1"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=362b9d88b78e56bc0f88ccac53b5588c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-plugin-promise/-/eslint-plugin-promise-5.2.0.tgz"
SRC_URI[md5sum] = "6195e17470949fde9cef1b3dc609aa26"
SRC_URI[sha256sum] = "c13ce1a4b3aa036494224cc0e31769cf41a6ea178de387950a88085c09a85102"

NPM_PKGNAME = "eslint-plugin-promise"

inherit npmhelper
inherit native
