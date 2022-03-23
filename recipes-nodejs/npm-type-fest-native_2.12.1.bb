SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=3e06173a93caec684ac1dbab40aec199"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.12.1.tgz"
SRC_URI[md5sum] = "7f9826b2f95b099cdaeba55171047d38"
SRC_URI[sha256sum] = "7f155147332c1607b91e87c504ec9b151a2c0c59fcc1d543e53b0e31b046d439"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
