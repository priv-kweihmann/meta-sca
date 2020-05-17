SUMMARY = "NPM: pump-chain"
DESCRIPTION = "A module that glues pump and bubble-stream-error to make things easier when your public API returns a stream."
HOMEPAGE = "https://github.com/alessioalex/pump-chain#readme"

DEPENDS = "npm-bubble-stream-error-native npm-pump-native npm-sliced-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=61;md5=de52438bd212bba4e70b37f9f82477b8"

SRC_URI = "https://registry.npmjs.org/pump-chain/-/pump-chain-1.0.0.tgz"
SRC_URI[md5sum] = "f81be31d93844f45bf2acfd89d635a61"
SRC_URI[sha256sum] = "1e420dcb24451f58712da176dc8797592d22ab316137f468fa0daacd1913c747"

NPM_PKGNAME = "pump-chain"

inherit npmhelper
inherit native
