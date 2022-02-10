SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=3e06173a93caec684ac1dbab40aec199"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.11.2.tgz"
SRC_URI[md5sum] = "a4d2da20b18dfb2c1971244aa2e28a14"
SRC_URI[sha256sum] = "e6aeea80515e2f9a99b52642f7920b9db0ba69bd32680629a9af9540ef3743e4"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
