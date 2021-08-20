SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/browserslist/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001251.tgz"
SRC_URI[md5sum] = "404b4100e97caed613328f79b6c1864a"
SRC_URI[sha256sum] = "957eced2c54fe87f6a019f65a4b0fe1a736f30f1e05e146f61f22eefeb16c1b2"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
