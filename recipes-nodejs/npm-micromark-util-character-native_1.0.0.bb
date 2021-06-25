SUMMARY = "NPM: micromark-util-character"
DESCRIPTION = "micromark utility to handle character codes"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=230;endline=231;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-symbol-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-util-character/-/micromark-util-character-1.0.0.tgz"
SRC_URI[md5sum] = "f3fe500c85aaa827adfbbe0ea96c0e7e"
SRC_URI[sha256sum] = "f5bc61e948d02e6dc0513baf14d81e2780e701ab2f08685bcf398fe0efe81032"

NPM_PKGNAME = "micromark-util-character"

inherit npmhelper
inherit native
