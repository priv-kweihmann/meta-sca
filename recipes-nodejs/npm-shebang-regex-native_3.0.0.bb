SUMMARY = "NPM: shebang-regex"
DESCRIPTION = "Regular expression for matching a shebang line"
HOMEPAGE = "https://github.com/sindresorhus/shebang-regex#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/shebang-regex/-/shebang-regex-3.0.0.tgz"
SRC_URI[md5sum] = "800d00b53670160a44fa6116b1cbb6e5"
SRC_URI[sha256sum] = "fedbabaa6db26c6be0183f82777dfa852d59a62f8885de93bd32ebc28758958f"

NPM_PKGNAME = "shebang-regex"

inherit npmhelper
inherit native
