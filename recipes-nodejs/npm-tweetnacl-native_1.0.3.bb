SUMMARY = "NPM: tweetnacl"
DESCRIPTION = "Port of TweetNaCl cryptographic library to JavaScript"
HOMEPAGE = "https://tweetnacl.js.org"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://LICENSE;md5=911690f51af322440237a253d695d19f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/tweetnacl/-/tweetnacl-1.0.3.tgz"
SRC_URI[md5sum] = "e280296537e0554e228a652d4a07266e"
SRC_URI[sha256sum] = "5f8dc49cb4483e206ba3ebb22abbccfc0218c59b60fc78cce24197ced5b9e102"

NPM_PKGNAME = "tweetnacl"

inherit npmhelper
inherit native
