SUMMARY = "NPM: uri-js"
DESCRIPTION = "An RFC 3986/3987 compliant, scheme extendable URI/IRI parsing/validating/resolving library for JavaScript."
HOMEPAGE = "https://github.com/garycourt/uri-js"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b55dad4a98748003b5b423477713da1"

DEPENDS = "npm-punycode-native"

SRC_URI = "https://registry.npmjs.org/uri-js/-/uri-js-4.4.1.tgz"
SRC_URI[md5sum] = "a76a588aa2f2433c0f54712ab065b445"
SRC_URI[sha256sum] = "5612de52afe83da73e66b519e83aa56aa81151c844b90bcf8e045df5ecec8d2d"

NPM_PKGNAME = "uri-js"

inherit npmhelper
inherit native
