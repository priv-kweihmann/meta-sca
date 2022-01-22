SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=3e06173a93caec684ac1dbab40aec199"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.10.0.tgz"
SRC_URI[md5sum] = "754a950dd0de2d290bbd09c503e73306"
SRC_URI[sha256sum] = "3efb53c99253af9815fcced398c35e67f5144f4346e4ecdc91d0b7d2a4f24263"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
