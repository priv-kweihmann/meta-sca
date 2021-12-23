SUMMARY = "NPM: decode-named-character-reference"
DESCRIPTION = "Decode named character references"
HOMEPAGE = "https://github.com/wooorm/decode-named-character-reference#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=23d8001628ed74be839cbeff9bdbe7dc"

DEPENDS = "npm-character-entities-native"

SRC_URI = "https://registry.npmjs.org/decode-named-character-reference/-/decode-named-character-reference-1.0.1.tgz"
SRC_URI[md5sum] = "c8678ba7bcf8412baa370d2d45908286"
SRC_URI[sha256sum] = "260f62320c7dfea559f8096635144d22cf71113707c62421705991d44a8bb037"

NPM_PKGNAME = "decode-named-character-reference"

inherit npmhelper
inherit native
