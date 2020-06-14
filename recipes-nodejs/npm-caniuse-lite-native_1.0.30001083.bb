SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001083.tgz"
SRC_URI[md5sum] = "b4a335b2a3c2283ab40a1bf9c8faeaa9"
SRC_URI[sha256sum] = "a7b652bc9a177a698d635b00a885fc501de76daa043bd4922cd272262a48073f"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
