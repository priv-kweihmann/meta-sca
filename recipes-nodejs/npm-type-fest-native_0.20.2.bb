SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=4131c9cb751198c626a526bc9ef613c6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-0.20.2.tgz"
SRC_URI[md5sum] = "cc7a1429eadf860c8f88caf208754b9f"
SRC_URI[sha256sum] = "b9d5d4fc05287af1445030152284e7def803976beb4b23ae4dc26824e79465a2"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
