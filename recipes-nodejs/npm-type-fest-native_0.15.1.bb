SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=4131c9cb751198c626a526bc9ef613c6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-0.15.1.tgz"
SRC_URI[md5sum] = "2dce74ee7fb29188d91b222bdbfb4f3d"
SRC_URI[sha256sum] = "f4a684f7a25e5c3f11a90e5ee7cf23c7ba4a85d006e8f7997974e8d98a4ad01c"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
