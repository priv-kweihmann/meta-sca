SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001170.tgz"
SRC_URI[md5sum] = "0ab6e5a28f151fc913ba0ba49c53fa97"
SRC_URI[sha256sum] = "ccd10b706660b7e1129987c0008cf7d086469da61a20582f144fa8bb82b6c6d0"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
