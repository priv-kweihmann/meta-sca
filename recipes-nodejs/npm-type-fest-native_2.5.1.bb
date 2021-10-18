SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.5.1.tgz"
SRC_URI[md5sum] = "db11e80b7e087871670e3dcc48025f98"
SRC_URI[sha256sum] = "ac3cf371c55ade7a66cd145a0abab0507c5281dde04ee459fcf20bd417a44fc5"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
