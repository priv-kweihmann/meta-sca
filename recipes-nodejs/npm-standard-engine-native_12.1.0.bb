SUMMARY = "NPM: standard-engine"
DESCRIPTION = "Wrap your standards in a tortilla and cover it in special sauce."
HOMEPAGE = "https://github.com/standard/standard-engine#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4a91a0b113362abf408bfcb6ad188645"

DEPENDS = "npm-deglob-native \
           npm-get-stdin-native \
           npm-minimist-native \
           npm-pkg-conf-native"

SRC_URI = "https://registry.npmjs.org/standard-engine/-/standard-engine-12.1.0.tgz"
SRC_URI[md5sum] = "3dba8350707748591ec07f49fd40a271"
SRC_URI[sha256sum] = "296f1d7419d9b0b1858d8d572dcfce910aa6bfd438f9db59061b9da5ad4d9c1c"

NPM_PKGNAME = "standard-engine"

inherit npmhelper
inherit native
