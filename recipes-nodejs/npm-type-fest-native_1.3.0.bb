SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-1.3.0.tgz"
SRC_URI[md5sum] = "d49e782c6d4c15182b993160136beba2"
SRC_URI[sha256sum] = "4fc2a578b35e8d2d7654abc3cb53cb4b11d8fed3a07c5281a5297c89d25dc463"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
