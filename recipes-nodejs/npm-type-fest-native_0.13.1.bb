SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=4131c9cb751198c626a526bc9ef613c6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-0.13.1.tgz"
SRC_URI[md5sum] = "9cfbf8b71f8d5842fbe50649d8abe151"
SRC_URI[sha256sum] = "fd9c65b80229311e2672969a19f10fae1969fef36e031441e83fab9440ed1477"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
