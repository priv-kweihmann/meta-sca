SUMMARY = "NPM: eslint-plugin-promise"
DESCRIPTION = "Enforce best practices for JavaScript promises"
HOMEPAGE = "https://github.com/xjamundx/eslint-plugin-promise"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=362b9d88b78e56bc0f88ccac53b5588c"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-plugin-promise/-/eslint-plugin-promise-4.3.1.tgz"
SRC_URI[md5sum] = "90520b4f32d45b7d12a79826911b5d18"
SRC_URI[sha256sum] = "312c7bf465fb7ff283a7e2ad44258c0a28687037e3691ecfc69ec5a594d44dfa"

NPM_PKGNAME = "eslint-plugin-promise"

inherit npmhelper
inherit native
