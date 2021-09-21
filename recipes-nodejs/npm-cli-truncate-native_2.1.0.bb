SUMMARY = "NPM: cli-truncate"
DESCRIPTION = "Truncate a string to a specific width in the terminal"
HOMEPAGE = "https://github.com/sindresorhus/cli-truncate#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-slice-ansi-native \
           npm-string-width-native"

SRC_URI = "https://registry.npmjs.org/cli-truncate/-/cli-truncate-2.1.0.tgz"
SRC_URI[md5sum] = "cd8f0450f55eab682ded921148dd531d"
SRC_URI[sha256sum] = "1058c4dbd142afb628bebdb8d29ca2503904d2d489c6ffd7403728cc4b76f188"

NPM_PKGNAME = "cli-truncate"

inherit npmhelper
inherit native
