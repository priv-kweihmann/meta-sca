SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001248.tgz"
SRC_URI[md5sum] = "567ae58c8ae7e23d1b7e0eab1ecfd06d"
SRC_URI[sha256sum] = "e001de64a5188c2717a981ef1712e52beb3b1f7e4706d8c0921e648d22700edd"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
