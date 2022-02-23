SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=3e06173a93caec684ac1dbab40aec199"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.12.0.tgz"
SRC_URI[md5sum] = "15a5785a75cd5bac3cec19ecbe254794"
SRC_URI[sha256sum] = "f510688983837a00a7ef6d1e711f02a60e210b3acea18a293b126cc174753953"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
