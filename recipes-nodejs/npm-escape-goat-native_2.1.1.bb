SUMMARY = "NPM: escape-goat"
DESCRIPTION = "Escape a string for use in HTML or the inverse"
HOMEPAGE = "https://github.com/sindresorhus/escape-goat#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/escape-goat/-/escape-goat-2.1.1.tgz"
SRC_URI[md5sum] = "f08124d4847f65b57fcd661aff0a2fa0"
SRC_URI[sha256sum] = "381b9ae56039216d64f966fa8d383fd89c3546cb8d979fc5ebd05a76beb05176"

NPM_PKGNAME = "escape-goat"

inherit npmhelper
inherit native
