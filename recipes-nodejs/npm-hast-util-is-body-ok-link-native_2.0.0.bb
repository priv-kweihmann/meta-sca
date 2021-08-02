SUMMARY = "NPM: hast-util-is-body-ok-link"
DESCRIPTION = "hast utility to check if a link element is “Body OK”"
HOMEPAGE = "https://github.com/rehypejs/rehype-minify/tree/main#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=60;endline=61;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-hast-util-has-property-native \
           npm-hast-util-is-element-native \
           npm-types-hast-native"

SRC_URI = "https://registry.npmjs.org/hast-util-is-body-ok-link/-/hast-util-is-body-ok-link-2.0.0.tgz"
SRC_URI[md5sum] = "cfa9bb4c14857d46d06b6d0026761166"
SRC_URI[sha256sum] = "d7ce192f4d1197781640c6cfa7bf44c59bcbed25e04666c6d88a391470cbf9e1"

NPM_PKGNAME = "hast-util-is-body-ok-link"

inherit npmhelper
inherit native
