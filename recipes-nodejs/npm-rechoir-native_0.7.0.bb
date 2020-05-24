SUMMARY = "NPM: rechoir"
DESCRIPTION = "Prepare a node environment to require files with different extensions."
HOMEPAGE = "https://github.com/gulpjs/rechoir#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c86b3e59f975615dfa869526b45d2031"

DEPENDS = "npm-resolve-native"

SRC_URI = "https://registry.npmjs.org/rechoir/-/rechoir-0.7.0.tgz"
SRC_URI[md5sum] = "c17595e655cef73e410f71a0ae970121"
SRC_URI[sha256sum] = "a1a3a6f0b0957ec23aa4cee6fa6cceaa13a35009bdb35dce4e765cd3f24d3e41"

NPM_PKGNAME = "rechoir"

inherit npmhelper
inherit native
