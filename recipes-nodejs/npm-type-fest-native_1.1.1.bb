SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-1.1.1.tgz"
SRC_URI[md5sum] = "e675a1ae922fa64694ef5616cb8b6e40"
SRC_URI[sha256sum] = "b167befb0b62fa12e1c8403b792ea19b82e7639bcbf06ac9704962cba997df9e"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
