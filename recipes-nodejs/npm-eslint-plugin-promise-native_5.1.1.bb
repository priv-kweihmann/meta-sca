SUMMARY = "NPM: eslint-plugin-promise"
DESCRIPTION = "Enforce best practices for JavaScript promises"
HOMEPAGE = "https://github.com/xjamundx/eslint-plugin-promise"

DEFAULT_PREFERENCE = "-1"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=362b9d88b78e56bc0f88ccac53b5588c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-plugin-promise/-/eslint-plugin-promise-5.1.1.tgz"
SRC_URI[md5sum] = "d99039f45b265b0121395236b55d5a12"
SRC_URI[sha256sum] = "e6d32dfec7fb049f6f793eca606421026aee92d3a7fa28da4a0c9f73e1fb8777"

NPM_PKGNAME = "eslint-plugin-promise"

inherit npmhelper
inherit native
