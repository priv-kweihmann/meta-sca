SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-1.1.2.tgz"
SRC_URI[md5sum] = "9d509fbc6ed3449245f3d31a9ecbe241"
SRC_URI[sha256sum] = "a47d90efae6a97e77dcb55665b3ed3dff294165f91a81f517b910d8e1bd824a7"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
