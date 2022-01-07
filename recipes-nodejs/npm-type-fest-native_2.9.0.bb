SUMMARY = "NPM: type-fest"
DESCRIPTION = "A collection of essential TypeScript types"
HOMEPAGE = "https://github.com/sindresorhus/type-fest#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT | CC0-1.0"
LIC_FILES_CHKSUM = "file://license;md5=3e06173a93caec684ac1dbab40aec199"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/type-fest/-/type-fest-2.9.0.tgz"
SRC_URI[md5sum] = "af3ed27b8b279980486c95a46eb01b70"
SRC_URI[sha256sum] = "9b85958b9d7a5d028df637935410c3088171e23431b72e5d9a4d025e3e75bfda"

NPM_PKGNAME = "type-fest"

inherit npmhelper
inherit native
