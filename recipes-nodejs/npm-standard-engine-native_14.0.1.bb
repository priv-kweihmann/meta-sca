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

SRC_URI = "https://registry.npmjs.org/standard-engine/-/standard-engine-14.0.1.tgz"
SRC_URI[md5sum] = "6257d5d98de443fe5858304aa45e4601"
SRC_URI[sha256sum] = "3e5c3f115f45de4f56acc7807e5caf3fde39b76124ca007f33e868613057b9f4"

NPM_PKGNAME = "standard-engine"

inherit npmhelper
inherit native
