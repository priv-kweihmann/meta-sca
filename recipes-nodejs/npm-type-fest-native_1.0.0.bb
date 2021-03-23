SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-1.0.0.tgz"
SRC_URI[md5sum] = "968c21a59fe5a5be356e557fbdcad904"
SRC_URI[sha256sum] = "d5c0a1b6c47e0478dd75e96d065a7d6a3793242505b4211011d4bcb828c19810"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
