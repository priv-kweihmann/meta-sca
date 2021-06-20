SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-1.2.1.tgz"
SRC_URI[md5sum] = "3614f743125fe94d376cbbf98947e42d"
SRC_URI[sha256sum] = "1f5958b639e68839d656eccdab248a8c8adcf119c6f22fdff7c1feeff3e4a450"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
