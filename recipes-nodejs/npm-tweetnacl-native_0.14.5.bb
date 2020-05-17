SUMMARY = "NPM: tweetnacl"
DESCRIPTION = "Port of TweetNaCl cryptographic library to JavaScript"
HOMEPAGE = "https://tweetnacl.js.org"

LICENSE = "Unlicense"
LIC_FILES_CHKSUM = "file://LICENSE;md5=911690f51af322440237a253d695d19f"

SRC_URI = "https://registry.npmjs.org/tweetnacl/-/tweetnacl-0.14.5.tgz"
SRC_URI[md5sum] = "147626dfa61ae7175b1fe170ea986b42"
SRC_URI[sha256sum] = "6cea33d67a9bd83f8bd250655c78a2c89ea912bcc6be91c8e65807ce69cfdfd6"

S = "${WORKDIR}/package"

NPM_PKGNAME = "tweetnacl"

inherit npmhelper
inherit native
