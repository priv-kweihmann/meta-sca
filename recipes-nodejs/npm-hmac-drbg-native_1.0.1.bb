SUMMARY = "NPM: hmac-drbg"
DESCRIPTION = "Deterministic random bit generator (hmac)"
HOMEPAGE = "https://github.com/indutny/hmac-drbg#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=25;md5=c733d89c596a5d659d364e58a3637a5c"

DEPENDS = "npm-hash.js-native \
           npm-minimalistic-assert-native \
           npm-minimalistic-crypto-utils-native"

SRC_URI = "https://registry.npmjs.org/hmac-drbg/-/hmac-drbg-1.0.1.tgz"
SRC_URI[md5sum] = "861b35b6f51c5bb5094bddfd39dcd173"
SRC_URI[sha256sum] = "321370d938a49a55cbdfcef124f63cde6d3a947b7231aeab1a5ba0ca62e35962"

NPM_PKGNAME = "hmac-drbg"

inherit npmhelper
inherit native
