SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"

LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=4131c9cb751198c626a526bc9ef613c6"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-0.21.2.tgz"
SRC_URI[md5sum] = "3042ea535f64924164ce1a1a72b92a75"
SRC_URI[sha256sum] = "c1d6c54b80ea1ce73318ce57bc5e3beaf0b34588e96f0d7566d9829a04480546"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
