SUMMARY = "NPM: uri-js"
DESCRIPTION = "An RFC 3986/3987 compliant, scheme extendable URI/IRI parsing/validating/resolving library for JavaScript."
HOMEPAGE = "https://github.com/garycourt/uri-js"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b55dad4a98748003b5b423477713da1"

DEPENDS = "npm-punycode-native"

SRC_URI = "https://registry.npmjs.org/uri-js/-/uri-js-4.4.0.tgz"
SRC_URI[md5sum] = "f1054ebca034f8f825313c5ecfbc54b2"
SRC_URI[sha256sum] = "2136118e898eb299ca560c39e5b0f8e80eb288300054b2229acf290495461da9"

NPM_PKGNAME = "uri-js"

inherit npmhelper
inherit native
