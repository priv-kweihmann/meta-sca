SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001150.tgz"
SRC_URI[md5sum] = "26d2bddbb450790d0f469edacf36809a"
SRC_URI[sha256sum] = "ac5b488888bb4071a7da80cf15a509efd643311f82261e10888740201266a72d"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
