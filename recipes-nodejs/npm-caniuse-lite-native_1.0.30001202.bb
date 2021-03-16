SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001202.tgz"
SRC_URI[md5sum] = "3f3b270919b6ab63268791273d09903f"
SRC_URI[sha256sum] = "08387a8bc47654e777a0f514b99e3a6a4a137bf25b002c54fae38f3b8c203c0d"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
