SUMMARY = "NPM: number-is-nan"
DESCRIPTION = "ES2015 `Number.isNaN()` ponyfill"
HOMEPAGE = "https://github.com/sindresorhus/number-is-nan#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/number-is-nan/-/number-is-nan-2.0.0.tgz"
SRC_URI[md5sum] = "5727e6678afa05dd0b904d43975d1ead"
SRC_URI[sha256sum] = "40a50c22057a448cc88b73c89e954d8b5cf0066fabbed8ad0513c99c55db7874"

NPM_PKGNAME = "number-is-nan"

inherit npmhelper
inherit native
