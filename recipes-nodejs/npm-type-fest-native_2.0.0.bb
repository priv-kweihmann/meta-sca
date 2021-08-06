SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.0.0.tgz"
SRC_URI[md5sum] = "377900493d34a41473ee0c6bea62fb38"
SRC_URI[sha256sum] = "0892c7fa0d98d39d0ee660ffb8c122f22147dd9cffd607c6e3ee7b1c2908e470"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
