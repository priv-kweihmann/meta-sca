SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=3e06173a93caec684ac1dbab40aec199"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.8.0.tgz"
SRC_URI[md5sum] = "3c25aaa348659252256700b702f7f8a0"
SRC_URI[sha256sum] = "cb1b9a334d1cff7b18be636b730cf53b2c87c555ff0feaf1ba309545f91b499d"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
