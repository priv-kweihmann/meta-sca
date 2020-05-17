SUMMARY = "NPM: repeating"
DESCRIPTION = "Repeat a string - fast"
HOMEPAGE = "https://github.com/sindresorhus/repeating#readme"

DEPENDS = "npm-is-finite-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "https://registry.npmjs.org/repeating/-/repeating-2.0.1.tgz"
SRC_URI[md5sum] = "376233a6b60ab00afac4023629eabdb4"
SRC_URI[sha256sum] = "2b686da5dedfd4fc6a1368690df313213e801a5d8b320b786082bf6facb28097"

NPM_PKGNAME = "repeating"

inherit npmhelper
inherit native
