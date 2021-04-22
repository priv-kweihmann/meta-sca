SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001214.tgz"
SRC_URI[md5sum] = "f76526136a962c1d4092f8e4c326a42e"
SRC_URI[sha256sum] = "c880f8c493a2226c850e49838a3243ff49637df33bebe27806f5c3e555fe735d"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
