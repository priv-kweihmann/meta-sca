SUMMARY = "NPM: caniuse-lite"
DESCRIPTION = "A smaller version of caniuse-db, with only the essentials!"
HOMEPAGE = "https://github.com/ben-eb/caniuse-lite#readme"

LICENSE = "CC-BY-4.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60f8103054954b2c75f1faa295ea3590"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/caniuse-lite/-/caniuse-lite-1.0.30001148.tgz"
SRC_URI[md5sum] = "b363affa800a806012bcd18f97262976"
SRC_URI[sha256sum] = "e17fb68e2f081266bb26a1805db65ad8ad1970912fa50a3eb1b706858503d89a"

NPM_PKGNAME = "caniuse-lite"

inherit npmhelper
inherit native
