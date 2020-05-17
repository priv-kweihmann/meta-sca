SUMMARY = "NPM: textlint-util-to-string"
DESCRIPTION = "textlint util convert Paragraph Node to text with SourceMap."
HOMEPAGE = "https://github.com/textlint/textlint-util-to-string"

DEPENDS = "npm-object-assign-native npm-structured-source-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

SRC_URI = "https://registry.npmjs.org/textlint-util-to-string/-/textlint-util-to-string-2.1.1.tgz"
SRC_URI[md5sum] = "0d677a17dad13faa1f7c7c5706275702"
SRC_URI[sha256sum] = "9544ff4baa1b77ceb000d47098246ad110ba83cb54bed2c30f04dcf53286707b"

NPM_PKGNAME = "textlint-util-to-string"

inherit npmhelper
inherit native
