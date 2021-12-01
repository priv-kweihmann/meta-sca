SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=3e06173a93caec684ac1dbab40aec199"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.7.0.tgz"
SRC_URI[md5sum] = "7d0387d4d313b6273dffad897bf338c1"
SRC_URI[sha256sum] = "4d2228300b46d1d1dd57dbc082684fec974e1ae6c06b0837e5f5948eee541d7c"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
