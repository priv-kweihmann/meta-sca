SUMMARY = "NPM: convert-source-map"
DESCRIPTION = "Converts a source-map from/to  different formats and allows adding/changing properties."
HOMEPAGE = "https://github.com/thlorenz/convert-source-map"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bf595075ff556bc46c43e08f142fa4f5"

DEPENDS = "npm-safe-buffer-native"

SRC_URI = "https://registry.npmjs.org/convert-source-map/-/convert-source-map-1.8.0.tgz"
SRC_URI[md5sum] = "d1c553aaaffba79be7073471b2619511"
SRC_URI[sha256sum] = "8ff5f30e96cd04fe8e5a99b85526ce0746b34f2b7e314df40dc643742aecfaaa"

NPM_PKGNAME = "convert-source-map"

inherit npmhelper
inherit native
