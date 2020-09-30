SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=4131c9cb751198c626a526bc9ef613c6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-0.17.0.tgz"
SRC_URI[md5sum] = "999c26252925b3e06b1e468b6953fbff"
SRC_URI[sha256sum] = "1558d720c63ce07c07cd298b077c1822d48c378ba9f44979097687c6b9fdbddb"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
