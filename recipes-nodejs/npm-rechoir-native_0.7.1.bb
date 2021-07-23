SUMMARY = "NPM: rechoir"
DESCRIPTION = "Prepare a node environment to require files with different extensions."
HOMEPAGE = "https://github.com/gulpjs/rechoir#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c86b3e59f975615dfa869526b45d2031"

DEPENDS = "npm-resolve-native"

SRC_URI = "https://registry.npmjs.org/rechoir/-/rechoir-0.7.1.tgz"
SRC_URI[md5sum] = "5b1b8d5385d07c68d4bc3f4f2a0216d0"
SRC_URI[sha256sum] = "244345c88dbe369e9077ff5880de9329a235839cc8b1920e9c75080c84062270"

NPM_PKGNAME = "rechoir"

inherit npmhelper
inherit native
