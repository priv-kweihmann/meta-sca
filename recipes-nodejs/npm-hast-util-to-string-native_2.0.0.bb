SUMMARY = "NPM: hast-util-to-string"
DESCRIPTION = "hast utility to get the plain-text value of a node"
HOMEPAGE = "https://github.com/rehypejs/rehype-minify/tree/main#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=59;endline=60;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-types-hast-native"

SRC_URI = "https://registry.npmjs.org/hast-util-to-string/-/hast-util-to-string-2.0.0.tgz"
SRC_URI[md5sum] = "0629655f033c240ea139b1f9d135d091"
SRC_URI[sha256sum] = "2902870d14ace23754324de153b5589f92a67d46dbc93f7e546dead44a715ddf"

NPM_PKGNAME = "hast-util-to-string"

inherit npmhelper
inherit native
