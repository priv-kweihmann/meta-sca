SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001239.tgz"
SRC_URI[md5sum] = "c38504e95f01f32029eb8eb266ca0c03"
SRC_URI[sha256sum] = "c684049e543101b81e51d3063346b4ccfdc72edc23d55f92ef264dc1d0a6ed13"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
