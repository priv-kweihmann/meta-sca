SUMMARY = "NPM: hast-util-is-body-ok-link"
DESCRIPTION = "hast utility to check if a link element is “Body OK”"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=54;endline=55;md5=f7cd6e61bbbca39fe0e60b4899302d5a"

DEPENDS = "npm-hast-util-has-property-native \
           npm-hast-util-is-element-native"

SRC_URI = "https://registry.npmjs.org/hast-util-is-body-ok-link/-/hast-util-is-body-ok-link-1.0.4.tgz"
SRC_URI[md5sum] = "a271f968a1ed987a4d82b975a346048f"
SRC_URI[sha256sum] = "4265513fb7da938471062a69e7c116a8e0402e9add442edc75c48dd4bfcad206"

NPM_PKGNAME = "hast-util-is-body-ok-link"

inherit npmhelper
inherit native
