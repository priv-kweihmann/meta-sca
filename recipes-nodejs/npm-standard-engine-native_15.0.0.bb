SUMMARY = "NPM: standard-engine"
DESCRIPTION = "Wrap your standards in a tortilla and cover it in special sauce."
HOMEPAGE = "https://github.com/standard/standard-engine#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4a91a0b113362abf408bfcb6ad188645"

DEPENDS = "npm-get-stdin-native \
           npm-minimist-native \
           npm-pkg-conf-native \
           npm-xdg-basedir-native"

SRC_URI = "https://registry.npmjs.org/standard-engine/-/standard-engine-15.0.0.tgz"
SRC_URI[md5sum] = "e517add862ff770b4b77f53f022bb2e4"
SRC_URI[sha256sum] = "79a4db02a9e66ec2d93a6a3147e8928107c8c5fcdbedca2aceb437f1073b3c22"

NPM_PKGNAME = "standard-engine"

inherit npmhelper
inherit native
