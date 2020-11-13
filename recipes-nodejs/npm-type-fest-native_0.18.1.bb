SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=4131c9cb751198c626a526bc9ef613c6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-0.18.1.tgz"
SRC_URI[md5sum] = "65eb04a0476c4fd2be8b4c8080dd9778"
SRC_URI[sha256sum] = "73845bfcdbc9eb3be53df3773893bc25a0947a74b399d0206fa8d0150583b4d7"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
