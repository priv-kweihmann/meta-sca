SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=4131c9cb751198c626a526bc9ef613c6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-0.14.0.tgz"
SRC_URI[md5sum] = "8cb3a8138d35718d6197448ddc31fef9"
SRC_URI[sha256sum] = "7d466f699066d663227f8ba7cbbfe04c51b2978d99cc7469fe737793373b42d7"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
