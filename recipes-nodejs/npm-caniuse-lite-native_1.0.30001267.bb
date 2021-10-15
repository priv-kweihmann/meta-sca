SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001267.tgz"
SRC_URI[md5sum] = "bd8d6dccf64589f338163ea8bfeca3f6"
SRC_URI[sha256sum] = "351006ad9f43546c89db00e8cd2b2337d28af2b391af1cb725d146b1b5936f73"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
