SUMMARY = "NPM: pupa"
DESCRIPTION = "Simple micro templating"
HOMEPAGE = "https://github.com/sindresorhus/pupa#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-escape-goat-native"

SRC_URI = "https://registry.npmjs.org/pupa/-/pupa-2.1.1.tgz"
SRC_URI[md5sum] = "6712c6aff41b75370bcc085b2c74516c"
SRC_URI[sha256sum] = "35a8a62b6265586631917de66e69e81581ead43768a44ed412961287e0595e3b"

NPM_PKGNAME = "pupa"

inherit npmhelper
inherit native
