SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001123.tgz"
SRC_URI[md5sum] = "ce64509ebc833c787b56615f32ccf467"
SRC_URI[sha256sum] = "903263d84407743a23ae7f803be511cebeb57983dbc00ec38e695215bbfaf440"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
