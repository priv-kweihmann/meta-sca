SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001249.tgz"
SRC_URI[md5sum] = "598613f4627ac9153d03fd746011421d"
SRC_URI[sha256sum] = "1e0e59b0f8d34868db30770fcf9465fe637b5759a3b5371cfccfe97f2a20b84f"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
