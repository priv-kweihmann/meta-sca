SUMMARY = "NPM: lodash.keys"
DESCRIPTION = "The lodash method `_.keys` exported as a module."
HOMEPAGE = "https://lodash.com/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a3b2b7770df62392c164de4001b59f8f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/lodash.keys/-/lodash.keys-4.2.0.tgz"
SRC_URI[md5sum] = "2a84572de63065265c3e8036d43eaa39"
SRC_URI[sha256sum] = "5a647aec98bdced42dc41b63a189590ff2dd942b7d123e2cb404c1e4da278a01"

NPM_PKGNAME = "lodash.keys"

inherit npmhelper
inherit native
