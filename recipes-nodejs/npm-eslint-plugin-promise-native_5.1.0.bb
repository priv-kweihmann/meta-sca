SUMMARY = "NPM: eslint-plugin-promise"
DESCRIPTION = "Enforce best practices for JavaScript promises"
HOMEPAGE = "https://github.com/xjamundx/eslint-plugin-promise"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=362b9d88b78e56bc0f88ccac53b5588c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-plugin-promise/-/eslint-plugin-promise-5.1.0.tgz"
SRC_URI[md5sum] = "516c78e41da7f5e091cb50bb85f89c3f"
SRC_URI[sha256sum] = "fecb170eb955a15a17b89e0d57eb4c8d1fdad7dbc68c1748a6d973dc964cb655"

NPM_PKGNAME = "eslint-plugin-promise"

inherit npmhelper
inherit native
