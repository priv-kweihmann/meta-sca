SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-1.0.2.tgz"
SRC_URI[md5sum] = "f18681664c31ae13bb7668b129810488"
SRC_URI[sha256sum] = "ae1f88aafe73b894845af09ec176149b78d15c8b971c07a29417bd32e262962c"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
