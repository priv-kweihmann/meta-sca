SUMMARY = "NPM: responselike"
DESCRIPTION = "A response-like object for mocking a Node.js HTTP response stream"
HOMEPAGE = "https://github.com/lukechilds/responselike#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ebe53e6698981352da17c09ed915f13f"

DEPENDS = "npm-lowercase-keys-native"

SRC_URI = "https://registry.npmjs.org/responselike/-/responselike-1.0.2.tgz"
SRC_URI[md5sum] = "c2d481fb92af68b51731eadf2e338a63"
SRC_URI[sha256sum] = "12d820689a4f7517711958dcd07dca9580d27c37da1fb400f51939e8e59f3554"

NPM_PKGNAME = "responselike"

inherit npmhelper
inherit native
