SUMMARY = "NPM: hast-util-is-body-ok-link"
DESCRIPTION = "hast utility to check if a link element is “Body OK”"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=54;endline=55;md5=f7cd6e61bbbca39fe0e60b4899302d5a"

DEPENDS = "npm-hast-util-has-property-native \
           npm-hast-util-is-element-native"

SRC_URI = "https://registry.npmjs.org/hast-util-is-body-ok-link/-/hast-util-is-body-ok-link-1.0.3.tgz"
SRC_URI[md5sum] = "aec742da7130b092d32603cdfe6d7d8b"
SRC_URI[sha256sum] = "77e4c9e8ada82d07624948602751ddab17bcbfae808a12e3bda64f451379d64b"

NPM_PKGNAME = "hast-util-is-body-ok-link"

inherit npmhelper
inherit native
