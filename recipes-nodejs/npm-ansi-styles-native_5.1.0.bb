SUMMARY = "NPM: ansi-styles"
DESCRIPTION = "ANSI escape codes for styling strings in the terminal"
HOMEPAGE = "https://github.com/chalk/ansi-styles#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ansi-styles/-/ansi-styles-5.1.0.tgz"
SRC_URI[md5sum] = "d9ea18e9a024dd9cbdbb4cebc6b21545"
SRC_URI[sha256sum] = "ba179dbd1177d2ad34dc674f9aba8bf558b9b9a67371f9421a8a7b8b053adf83"

NPM_PKGNAME = "ansi-styles"

inherit npmhelper
inherit native
