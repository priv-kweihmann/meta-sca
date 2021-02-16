SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=4131c9cb751198c626a526bc9ef613c6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-0.21.1.tgz"
SRC_URI[md5sum] = "86a8c700b37e06b701147eb7a5506371"
SRC_URI[sha256sum] = "528f2bd7fa8e4a36659bd53a91abe761d1d349de81b5838362fbd71fe68e468f"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
