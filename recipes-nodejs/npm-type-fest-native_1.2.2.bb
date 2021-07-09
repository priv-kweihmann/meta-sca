SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-1.2.2.tgz"
SRC_URI[md5sum] = "5798bf6496ce0acd31cd3a54e639cfbd"
SRC_URI[sha256sum] = "9a3d3725517ffbe779ee372438c7e2487184e0969c5d5c8675aa9dec19936c3d"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
