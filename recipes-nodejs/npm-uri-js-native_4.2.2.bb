SUMMARY = "NPM: uri-js"
DESCRIPTION = "An RFC 3986/3987 compliant, scheme extendable URI/IRI parsing/validating/resolving library for JavaScript."
HOMEPAGE = "https://github.com/garycourt/uri-js"

DEPENDS = "npm-punycode-native"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://README.md;beginline=185;md5=33450cb5cc7b7939b5383766dcb4e080"

SRC_URI = "https://registry.npmjs.org/uri-js/-/uri-js-4.2.2.tgz"
SRC_URI[md5sum] = "56cf9d223d47c2f43e03ab4a017f1451"
SRC_URI[sha256sum] = "fa2e3a0fdbe0ab9dc82cefdb424370fac52ded8d412bbd51d655aa24716df7ae"

S = "${WORKDIR}/package"

NPM_PKGNAME = "uri-js"

inherit npmhelper
inherit native
