SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001264.tgz"
SRC_URI[md5sum] = "c2aadefb478a9a58a6e4e3a91e824664"
SRC_URI[sha256sum] = "a6bf331be70bb46822f7fcdc31e2f5826c5ac6d525b9d8ef56145d27694bb715"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
