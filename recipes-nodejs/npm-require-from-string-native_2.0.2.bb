SUMMARY = "NPM: require-from-string"
DESCRIPTION = "Require module from string"
HOMEPAGE = "https://github.com/floatdrop/require-from-string#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=be72c3ad86c1c4e9578a1945b082b17d"

SRC_URI = "https://registry.npmjs.org/require-from-string/-/require-from-string-2.0.2.tgz"
SRC_URI[md5sum] = "e9d1c952d6ae6a5eefc4ecc7f2a97f1a"
SRC_URI[sha256sum] = "cb694a4965908f7775a0c757f00cf4e624d193cd71d77988fbcca0f597b88d82"

NPM_PKGNAME = "require-from-string"

inherit npmhelper
inherit native
