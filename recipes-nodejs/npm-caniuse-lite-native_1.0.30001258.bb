SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001258.tgz"
SRC_URI[md5sum] = "0a1b187c6e00c7a09fb58e21e0c0b83f"
SRC_URI[sha256sum] = "87def6befc12a7fe3f46166782cc411ccd6c43e15a1e4ffcdb4a2c5691effbd3"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
