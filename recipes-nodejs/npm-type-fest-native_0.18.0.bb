SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=4131c9cb751198c626a526bc9ef613c6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-0.18.0.tgz"
SRC_URI[md5sum] = "861e94084989e547596ba8854e288387"
SRC_URI[sha256sum] = "da0f5fa6a5d588792df831d8665a31406b02addbb84274cb595be81e9d5dfe1e"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
