SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=4131c9cb751198c626a526bc9ef613c6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-0.21.3.tgz"
SRC_URI[md5sum] = "adecccf357c120e80e91f9479173d9ec"
SRC_URI[sha256sum] = "135cd7f1bb8c437aded44c9ebc3493bccf7a0d551c58d25172742eb107e9fdd1"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
