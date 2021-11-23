SUMMARY = "NPM: decode-named-character-reference"
DESCRIPTION = "Decode named character references"
HOMEPAGE = "https://github.com/wooorm/decode-named-character-reference#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=23d8001628ed74be839cbeff9bdbe7dc"

DEPENDS = "npm-character-entities-native"

SRC_URI = "https://registry.npmjs.org/decode-named-character-reference/-/decode-named-character-reference-1.0.0.tgz"
SRC_URI[md5sum] = "5dda6408ea6a040d6b8f9c9d339cdde1"
SRC_URI[sha256sum] = "58e9e9805a76e7c9a0f3c593883281d5bddd73d44c338b03f6b965899e8cee3b"

NPM_PKGNAME = "decode-named-character-reference"

inherit npmhelper
inherit native
