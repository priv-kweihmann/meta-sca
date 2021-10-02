SUMMARY = "NPM: micromark-factory-title"
DESCRIPTION = "micromark factory to parse markdown titles (found in resources, definitions)"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=119;endline=120;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-power-assert-native"

SRC_URI = "https://registry.npmjs.org/micromark-factory-title/-/micromark-factory-title-1.0.1.tgz"
SRC_URI[md5sum] = "e61e9be398933aebee049febe861b7ad"
SRC_URI[sha256sum] = "a234b36ace9b99c3ab512232403641fadbb71f58835676035cec51619d067d60"

NPM_PKGNAME = "micromark-factory-title"

inherit npmhelper
inherit native
