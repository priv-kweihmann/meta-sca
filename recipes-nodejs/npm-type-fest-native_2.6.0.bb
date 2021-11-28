SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=3e06173a93caec684ac1dbab40aec199"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.6.0.tgz"
SRC_URI[md5sum] = "f691c94d3e2c0a0de8ae7193ad63296d"
SRC_URI[sha256sum] = "a303b0219c64722efff09feeb27067b5756d274c43d048909d3d391e49646836"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
