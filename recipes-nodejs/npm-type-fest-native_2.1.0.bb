SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.1.0.tgz"
SRC_URI[md5sum] = "824857e60277b6c334bb509dabf9f714"
SRC_URI[sha256sum] = "108c3dffc379a6ff170036fbb152c4f25918e5432252419e9dfe8ce01b864c94"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
