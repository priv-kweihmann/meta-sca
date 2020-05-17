SUMMARY = "NPM: standard-engine"
DESCRIPTION = "Wrap your standards in a tortilla and cover it in special sauce."
HOMEPAGE = "https://github.com/standard/standard-engine#readme"

DEPENDS = "npm-deglob-native npm-get-stdin-native npm-minimist-native npm-pkg-conf-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4a91a0b113362abf408bfcb6ad188645"

SRC_URI = "https://registry.npmjs.org/standard-engine/-/standard-engine-12.0.1.tgz"
SRC_URI[md5sum] = "a8bef6dae5a69b0649d42e5576e14062"
SRC_URI[sha256sum] = "9e207ffc1a3a50cfaab2c4de2b4202ef5c1b72903011c6fa208a677a6e2f39a9"

NPM_PKGNAME = "standard-engine"

inherit npmhelper
inherit native
