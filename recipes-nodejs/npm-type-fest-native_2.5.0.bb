SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.5.0.tgz"
SRC_URI[md5sum] = "cafec8dd1d8a1bd3ea444c4e09d29a0e"
SRC_URI[sha256sum] = "bd2d1d3b1a56740e9ab33975b710bbf4e46db6d41224d50557b2a6c7702060f6"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
