SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=3e06173a93caec684ac1dbab40aec199"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.11.0.tgz"
SRC_URI[md5sum] = "dded33611d5d0bdbf681d119e972c444"
SRC_URI[sha256sum] = "77c79825f5c784b3593157d9cbb89b1c652af3fce726274dc50299d9df50af17"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
