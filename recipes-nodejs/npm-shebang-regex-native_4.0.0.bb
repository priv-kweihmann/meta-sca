SUMMARY = "NPM: shebang-regex"
DESCRIPTION = "Regular expression for matching a shebang line"
HOMEPAGE = "https://github.com/sindresorhus/shebang-regex#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/shebang-regex/-/shebang-regex-4.0.0.tgz"
SRC_URI[md5sum] = "ac96f3db283230543b59a6f67089128d"
SRC_URI[sha256sum] = "cd48bab77135016978a68350beac587c322b9b1b733a2ccbf7333d8f0b4be847"

NPM_PKGNAME = "shebang-regex"

inherit npmhelper
inherit native
