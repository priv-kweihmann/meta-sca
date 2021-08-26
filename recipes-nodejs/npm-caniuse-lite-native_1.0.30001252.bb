SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001252.tgz"
SRC_URI[md5sum] = "6586d94cbfddde61f0be96d974838bd1"
SRC_URI[sha256sum] = "af29c1d7121ae2792f81c8c50a4f58e6b5d961488c9b4d22995daeea8e9a9942"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
