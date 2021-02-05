SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001185.tgz"
SRC_URI[md5sum] = "30cbe449c011435bb51bb6cc2c049687"
SRC_URI[sha256sum] = "fac355e8e80dd6de5cb937ea1ead00ac381c2c3be254376d12c0c506482403a4"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
