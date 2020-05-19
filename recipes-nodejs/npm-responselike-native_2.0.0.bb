SUMMARY = "NPM: responselike"
DESCRIPTION = "A response-like object for mocking a Node.js HTTP response stream"
HOMEPAGE = "https://github.com/lukechilds/responselike#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ebe53e6698981352da17c09ed915f13f"

DEPENDS = "npm-lowercase-keys-native"

SRC_URI = "https://registry.npmjs.org/responselike/-/responselike-2.0.0.tgz"
SRC_URI[md5sum] = "9bdbcf02e8e5c2600a2255c47ab27f81"
SRC_URI[sha256sum] = "37561d658ac22580fea291abba8977e8850eff5d45ae3d6d7729944a2dec190b"

NPM_PKGNAME = "responselike"

inherit npmhelper
inherit native
