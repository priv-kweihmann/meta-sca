SUMMARY = "NPM: qs"
DESCRIPTION = "A querystring parser that supports nesting and arrays, with a depth limit"
HOMEPAGE = "https://github.com/ljharb/qs"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=b289135779dd930509ae81e6041690c0"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/qs/-/qs-6.9.4.tgz"
SRC_URI[md5sum] = "53aa054c5ac6a541f3578451fee684eb"
SRC_URI[sha256sum] = "101109c57d1b7d057fe2a44134111a53c3394298d9451e149e2fa4f6942de231"

NPM_PKGNAME = "qs"

inherit npmhelper
inherit native
