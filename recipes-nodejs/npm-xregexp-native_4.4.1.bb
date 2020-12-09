SUMMARY = "NPM: xregexp"
DESCRIPTION = "Extended regular expressions"
HOMEPAGE = "http://xregexp.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b6fd2ceea8d3872d310a97a375ed26f9"

DEPENDS = "npm-babel-runtime-corejs3-native"

SRC_URI = "https://registry.npmjs.org/xregexp/-/xregexp-4.4.1.tgz"
SRC_URI[md5sum] = "592ba1ace2e84e81607c2a5c5c7d1afd"
SRC_URI[sha256sum] = "4f1a81616a85c7bca4f4b8cc313331f6608c062267a599a5fe7bb27bfad46f86"

NPM_PKGNAME = "xregexp"

inherit npmhelper
inherit native
