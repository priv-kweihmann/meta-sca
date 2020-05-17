SUMMARY = "NPM: ansi-regex"
DESCRIPTION = "Regular expression for matching ANSI escape codes"
HOMEPAGE = "https://github.com/chalk/ansi-regex#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/ansi-regex/-/ansi-regex-5.0.0.tgz"
SRC_URI[md5sum] = "69fd1c7bc68c850139d20aefed955a71"
SRC_URI[sha256sum] = "6ee1bda34e578b6da23ca5ffda9dc971748c3c542f5fa999f818df5dc0323b99"

NPM_PKGNAME = "ansi-regex"

inherit npmhelper
inherit native
