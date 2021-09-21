SUMMARY = "NPM: restore-cursor"
DESCRIPTION = "Gracefully restore the CLI cursor on exit"
HOMEPAGE = "https://github.com/sindresorhus/restore-cursor#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-onetime-native \
           npm-signal-exit-native"

SRC_URI = "https://registry.npmjs.org/restore-cursor/-/restore-cursor-3.1.0.tgz"
SRC_URI[md5sum] = "058736e2d721ba0c99b5be09283ae59b"
SRC_URI[sha256sum] = "0948716bb31f4cb02857a37b539cbe2aad249d5182f114a27404716064e3ec29"

NPM_PKGNAME = "restore-cursor"

inherit npmhelper
inherit native
