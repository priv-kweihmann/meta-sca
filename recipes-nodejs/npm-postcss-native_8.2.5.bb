SUMMARY = "NPM: postcss"
DESCRIPTION = "Tool for transforming styles with JS plugins"
HOMEPAGE = "https://postcss.org/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e0ef868fdaaba6859dcbab082c20439b"

DEPENDS = "npm-colorette-native \
           npm-nanoid-native \
           npm-source-map-native"

SRC_URI = "https://registry.npmjs.org/postcss/-/postcss-8.2.5.tgz"
SRC_URI[md5sum] = "01f593c6e0c572aadade5cd799ecf0b9"
SRC_URI[sha256sum] = "e33d841a2e237062417885f35cf1d9ea35ac50548106996939025e410ba5278b"

NPM_PKGNAME = "postcss"

inherit npmhelper
inherit native
